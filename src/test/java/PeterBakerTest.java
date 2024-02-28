import java.util.*;

import org.example.Baker;
import org.example.Ingredient;
import org.example.RecipeIngredient;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeterBakerTest {
    @Test
    public void shouldBakeOneCakeWhenExactAmountOfFlour() {
        Baker baker = new Baker();
        RecipeIngredient recipeFlour = new RecipeIngredient("Flour", 1);
        Ingredient flour = new Ingredient("Flour", 1);
        List<Ingredient> cupboard = new ArrayList<Ingredient>();
        cupboard.add(flour);
        List<RecipeIngredient> recipe = new ArrayList<RecipeIngredient>();
        recipe.add(recipeFlour);

        int numberOfCakes = baker.getNumberOfCakes(recipe, cupboard);

        Assert.assertEquals(1, numberOfCakes);

    }

    @Test
    public void shouldBakeOneCakeWhenExactAmountOfSugar() {
        Baker baker = new Baker();
        RecipeIngredient recipeFlour = new RecipeIngredient("Sugar", 1);
        Ingredient flour = new Ingredient("Sugar", 1);
        List<Ingredient> cupboard = new ArrayList<Ingredient>();
        cupboard.add(flour);
        List<RecipeIngredient> recipe = new ArrayList<RecipeIngredient>();
        recipe.add(recipeFlour);

        int numberOfCakes = baker.getNumberOfCakes(recipe, cupboard);

        Assert.assertEquals(200, numberOfCakes);

    }
}
