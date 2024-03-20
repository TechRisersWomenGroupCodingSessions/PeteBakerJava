package org.example;

import java.util.List;
import java.util.Map;

public class Baker {
    static Integer numberOfCakes;


    public int getNumberOfCakes(List<RecipeIngredient> recipe, List<Ingredient> cupboard) {

        for (RecipeIngredient recipeIngredient : recipe) {
            for (Ingredient ingredient : cupboard) {
                if (recipeIngredient.ingredientType.equals(ingredient.ingredientType)) {
                    numberOfCakes = ingredient.countOfIngredient/recipeIngredient.countOfIngredient;
                }
             //   else if(!recipeIngredient.ingredientType.equals(ingredient.ingredientType)) {

                }
            }
        }
        return numberOfCakes;
    }
}
