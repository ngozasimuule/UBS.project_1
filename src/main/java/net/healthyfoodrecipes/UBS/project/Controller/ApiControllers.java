package net.healthyfoodrecipes.UBS.project.Controller;


import net.healthyfoodrecipes.UBS.project.Repository.Database;
import net.healthyfoodrecipes.UBS.project.Repository.Recipe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiControllers {

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome Recipes Api";
    }

    @GetMapping(value = "/recipes")
    public Recipe getAll() {
        Database DB= new Database();
        return  DB.getAllRecipes();
    }
}


