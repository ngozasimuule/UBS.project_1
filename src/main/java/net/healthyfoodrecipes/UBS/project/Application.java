package net.healthyfoodrecipes.UBS.project;

import net.healthyfoodrecipes.UBS.project.Repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.web.context.annotation.ApplicationScope;


@ApplicationScope
public class Application implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private RecipeRepository recipeRepository;

	@Override
	public void run(String... args) throws Exception {

	}
}
