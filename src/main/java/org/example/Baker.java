package org.example;

import java.util.List;
import java.util.Map;

public class Baker {


    public int getNumberOfCakes(List<RecipeIngredient> recipe, List<Ingredient> cupboard) {
        int numberOfCakes = 0;


        for (RecipeIngredient recipeIngredient : recipe) {
            for (Ingredient cupboardIngredient : cupboard) {
                if(recipeIngredient.ingredientType.equals(cupboardIngredient.ingredientType)) {
                    numberOfCakes = cupboardIngredient.countOfIngredient/ recipeIngredient.countOfIngredient;
                }
            }
        }


        return numberOfCakes;


    }
}