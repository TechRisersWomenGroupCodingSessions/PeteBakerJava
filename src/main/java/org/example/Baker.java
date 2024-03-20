package org.example;

import java.util.List;
import java.util.Map;

public class Baker {


    public int getNumberOfCakes(List<RecipeIngredient> recipe, List<Ingredient> cupboard) {
        int numberOfCakes = 0;


        for (RecipeIngredient recipeIngredient : recipe) {

            int counter = 0;
            int totalNumberOfCakes = 0;
            var cupboardIngredient = cupboard.get(counter);
            do {
                numberOfCakes = cupboardIngredient.countOfIngredient / recipeIngredient.countOfIngredient;
                totalNumberOfCakes = totalNumberOfCakes + cupboardIngredient.countOfIngredient / recipeIngredient.countOfIngredient;
                if (totalNumberOfCakes < numberOfCakes) {
                    numberOfCakes = totalNumberOfCakes;
                }
                counter++;
            } while (counter < cupboard.size()) {

                }
            }


        return numberOfCakes;
    }
}