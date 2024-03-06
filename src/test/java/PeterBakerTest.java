import org.example.Ingredient;
import org.example.RecipeIngredient;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.example.Baker;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeterBakerTest {

    @Test
     void shouldBakeOneCakeWhenExactAmountOfFlour() {
        Baker baker = new Baker();

        RecipeIngredient recipeFlour = new RecipeIngredient("Flour", 1);
        Ingredient flour = new Ingredient("Flour", 1);
        List<Ingredient> cupboard = new ArrayList<Ingredient>();
        cupboard.add(flour);
        List<RecipeIngredient> recipe = new ArrayList<RecipeIngredient>();
        recipe.add(recipeFlour);

        int numberOfCakes = baker.getNumberOfCakes(recipe, cupboard);

        assertEquals(1, numberOfCakes);

    }

//    cakes({apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100}, {sugar: 500, flour: 2000, milk: 2000});
}
