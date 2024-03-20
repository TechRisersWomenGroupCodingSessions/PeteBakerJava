package org.example;

import java.util.List;
import java.util.Map;

public class Baker {


    public int getNumberOfCakes(List<RecipeIngredient> recipe, List<Ingredient> cupboard) {
        int numberOfCakes = 0;

        // we're going about this incorrectly because we cannot get past 0 with the current logic


        for (RecipeIngredient recipeIngredient : recipe) {
            //for (Ingredient cupboardIngredient : cupboard) {
                // if(recipeIngredient.ingredientType.equals(cupboardIngredient.ingredientType)) {
                //     int numberOfCakes_2 = cupboardIngredient.countOfIngredient/ recipeIngredient.countOfIngredient;
                //     if (numberOfCakes<numberOfCakes_2){
                //         numberOfCakes = numberOfCakes_2;
                //     }
                //     else {
                //         numberOfCakes = 0;
                //     }
                //     break;
                // }
                // else {
                //     return 0;
                // }
                int counter = 0;
                var cupboardIngredient = cupboard[counter];
                do {
                    numberOfCakes = cupboardIngredient.countOfIngredient/ recipeIngredient.countOfIngredient;
                } while (counter < cupboard.size()) {
                    int temp = recipeIngredient.ingredientType.equals(cupboardIngredient.ingredientType);
                    if (temp < numberOfCakes){
                        numberOfCakes = temp;
                    }
                    counter++;
                //}
            }
        }




        return numberOfCakes;


    }
}