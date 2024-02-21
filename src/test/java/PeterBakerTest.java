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

        assertEquals(numberOfCakes, 3);
    }
}
