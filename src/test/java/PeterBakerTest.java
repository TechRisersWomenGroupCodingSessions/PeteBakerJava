import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import org.example.Baker;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeterBakerTest {

    @Test void testingCakesFunction() {
        Map<String,Integer> cakeRecipe = new HashMap<>();
        Map<String,Integer> peterIngredient = new HashMap<>();

        cakeRecipe.put("flour", 400);
        cakeRecipe.put("sugar",200);
        cakeRecipe.put("eggs",1);

        peterIngredient.put("flour",1200);
        peterIngredient.put("sugar",1200);
        peterIngredient.put("eggs",5);
        peterIngredient.put("milk",200);

        Baker baker = new Baker();
        int numberOfCakes = baker.cakes(cakeRecipe, peterIngredient);

        assertEquals(3, numberOfCakes);
    }

    @Test void testingCakesZero() {
        Map<String,Integer> cakeRecipe = new HashMap<>();
        Map<String,Integer> peterIngredient = new HashMap<>();

        cakeRecipe.put("apples", 3);
        cakeRecipe.put("flour",300);
        cakeRecipe.put("sugar",150);
        cakeRecipe.put("milk",100);
        cakeRecipe.put("oil",100);

        peterIngredient.put("flour",2000);
        peterIngredient.put("sugar",500);
        peterIngredient.put("milk",2000);

        Baker baker = new Baker();
        int numberOfCakes = baker.cakes(cakeRecipe, peterIngredient);

        assertEquals(0, numberOfCakes);
    }
//    cakes({apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100}, {sugar: 500, flour: 2000, milk: 2000});
}
