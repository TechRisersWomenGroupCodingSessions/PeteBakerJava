package org.example;

import java.util.List;
import java.util.Map;

public class Baker {


    public int getNumberOfCakes(List<RecipeIngredient> recipe, List<Ingredient> cupboard) {
        int numberOfCakes = Integer.MAX_VALUE;


        for (RecipeIngredient recipeIngredient : recipe) {

            int counter = 0;
            int totalNumberOfCakes = 0;
            var cupboardIngredient = cupboard.get(counter);
            do {
                if (cupboardIngredient.ingredientType.equals(recipeIngredient.ingredientType)){
                    totalNumberOfCakes = cupboardIngredient.countOfIngredient / recipeIngredient.countOfIngredient;
                    if (totalNumberOfCakes <= numberOfCakes) {
                        numberOfCakes = totalNumberOfCakes;
                    }
                }
                counter++;
            } while (counter < cupboard.size());
            }


        return numberOfCakes;
    }
}