package net.healthyfoodrecipes.UBS.project.Controller;

import net.healthyfoodrecipes.UBS.project.Exception.ResourceNotFoundException;
import net.healthyfoodrecipes.UBS.project.Model.Recipes;
import net.healthyfoodrecipes.UBS.project.Repository.RecipeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/mycookbook-io1.p.rapidapi.com/recipes/rapidapi")
public class RecipesController {

    private final RecipeRepository recipeRepository;

    public RecipesController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping
    public List<Recipes> getAllEmployees(){
        return recipeRepository.findAll();
    }

    // build create recipe REST API
    @PostMapping
    public Recipes createRecipes(@RequestBody Recipes recipes) {
        return recipeRepository.save(recipes);
    }

    // build get recipe by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Recipes> getRecipesById(@PathVariable  long id){
        Recipes recipes = recipeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Recipes not exist with id:" + id));
        return ResponseEntity.ok(recipes);
    }

    // build update recipe REST API
    @PutMapping("{id}")
    public ResponseEntity<Recipes> updateRecipes(@PathVariable long id,@RequestBody Recipes recipesDetails) {
        Recipes updateRecipes = recipeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Recipes do not exist with id: " + id));

        updateRecipes.setName(recipesDetails.getId());
        updateRecipes.setInstructions(recipesDetails.getIngredients());
        updateRecipes.setIngredients(recipesDetails.getInstructions());

        recipeRepository.save(updateRecipes);

        return ResponseEntity.ok(updateRecipes);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteRecipes(@PathVariable long id){

        Recipes recipes = recipeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Recipes not exist with id: " + id));

        recipeRepository.delete(recipes);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}

