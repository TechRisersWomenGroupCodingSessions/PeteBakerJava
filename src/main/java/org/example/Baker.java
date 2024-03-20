package org.example;

import java.util.List;
import java.util.Map;

public class Baker {
    static Integer numberOfCakes;


    public int getNumberOfCakes(List<RecipeIngredient> recipe, List<Ingredient> cupboard) {

        int[] temp = new int[recipe.size()];
        int counter = 0;

        for (RecipeIngredient recipeIngredient : recipe) {
            for (Ingredient ingredient : cupboard) {
                if (recipeIngredient.ingredientType.equals(ingredient.ingredientType)) {
                    numberOfCakes = ingredient.countOfIngredient/recipeIngredient.countOfIngredient;
                    temp[counter] = numberOfCakes;
                }
                }
            counter++;
            }

       int minNumberOfCakes = temp[0];
        for (int value: temp) {
            if(value < minNumberOfCakes) {
                minNumberOfCakes = value;
            }
        }


        return minNumberOfCakes;
    }
}
