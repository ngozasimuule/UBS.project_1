//package net.healthyfoodrecipes.UBS.project.Model;
//
//
//import net.healthyfoodrecipes.UBS.project.Repository.Database;
//import net.healthyfoodrecipes.UBS.project.Repository.Recipe;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//public class ApiControllers {
//
//    @GetMapping(value = "/")
//    public String getPage() {
//        return "Welcome Recipes Api";
//    }
//
//    @GetMapping(value = "/recipes")
//    public Recipe getAll() {
//        Database DB= new Database();
//        return  DB.getAllRecipes();
//    }
//}
//
//

package net.healthyfoodrecipes.UBS.project.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "recipes")
public class Recipes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "Id")
    private String name,instructions;

    @Column(name = "Ingredients")
    private String ingredients;
}

