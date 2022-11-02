package net.healthyfoodrecipes.UBS.project.Repository;

public class Database {


    public Database(){
        //mysql


    }

    public boolean CreateRecipes( ){



        return true;
    }
    public Recipe getAllRecipes(){


        Recipe r= new Recipe();
        r.id=1;
        r.name="Creamy courgette lasagne";
        r.instructions="Heat oven to 220C/fan 200C/gas 7. Put a pan of water on to boil, then cook the lasagne sheets for about 5 mins until softened, but not cooked through...";


        r.ingredients= new Ingredients();// new Recipe.Ingredients();
        r.ingredients.name="large aubergines, trimmed and thinly sliced lengthways";
        r.ingredients.quantity="3";

        return r;
    }
    public boolean getRecipe(int Id){



        return true;
    }

    public boolean updateRecipe(int Id){



        return true;
    }

    public boolean delete(int Id){



        return true;
    }


}

