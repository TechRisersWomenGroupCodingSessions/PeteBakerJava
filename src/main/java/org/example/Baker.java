package org.example;


import java.util.List;
import java.util.Map;

public class Baker {

    public int getNumberOfCakes(List<RecipeIngredient> recipe, List<Ingredient> cupboard) {
        int numberOfCakes = 0;

        for (Ingredient cupboardIngredient : cupboard) {
            numberOfCakes = cupboardIngredient.countOfIngredient;
        }
       return numberOfCakes;
    }

}
