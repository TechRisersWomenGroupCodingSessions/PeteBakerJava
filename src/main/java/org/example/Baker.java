package org.example;

import java.util.HashMap;
import java.util.Map;

public class Baker {

    public int cakes(Map<String, Integer> cakeRecipe, Map<String, Integer> peterIngredient) {
        int numberOfCakes = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : cakeRecipe.entrySet()) {
            if(peterIngredient.containsKey(entry.getKey()) && peterIngredient.get(entry.getKey())/entry.getValue() < numberOfCakes) {
                numberOfCakes = peterIngredient.get(entry.getKey())/entry.getValue();
            }
        }
        return numberOfCakes;
    }
}
