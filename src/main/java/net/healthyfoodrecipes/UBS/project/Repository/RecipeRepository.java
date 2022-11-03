package net.healthyfoodrecipes.UBS.project.Repository;

import net.healthyfoodrecipes.UBS.project.Model.Recipes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipes, Long> {
    // all crud database methods
}

