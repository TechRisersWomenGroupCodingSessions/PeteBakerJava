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

    @Test
    public void shouldBakeOneCakeWhenExactAmountOfSugar() {
        Baker baker = new Baker();
        RecipeIngredient recipeSugar = new RecipeIngredient("Sugar", 1);
        Ingredient sugar = new Ingredient("Sugar", 200);
        List<Ingredient> cupboard = new ArrayList<Ingredient>();
        cupboard.add(sugar);
        List<RecipeIngredient> recipe = new ArrayList<RecipeIngredient>();
        recipe.add(recipeSugar);

        int numberOfCakes = baker.getNumberOfCakes(recipe, cupboard);

        assertEquals(200, numberOfCakes);

    }

    @Test
    public void shouldBakeNoCakesWhenNotEnoughFlour() {
        Baker baker = new Baker();
        RecipeIngredient recipeSugar = new RecipeIngredient("Sugar", 1);
        RecipeIngredient recipeFlour = new RecipeIngredient("Flour", 2);

        Ingredient sugar = new Ingredient("Sugar", 1);
        Ingredient flour = new Ingredient("Flour", 1);

        List<Ingredient> cupboard = new ArrayList<Ingredient>();
        cupboard.add(sugar);
        cupboard.add(flour);

        List<RecipeIngredient> recipe = new ArrayList<RecipeIngredient>();
        recipe.add(recipeSugar);
        recipe.add(recipeFlour);

        int numberOfCakes = baker.getNumberOfCakes(recipe, cupboard);

        assertEquals(0, numberOfCakes);
    }

    @Test
    public void shouldBakeNoCakesIfOneIngredientIsMissing() {
        Baker baker = new Baker();
        RecipeIngredient recipeSugar = new RecipeIngredient("Sugar", 1);
        RecipeIngredient recipeFlour = new RecipeIngredient("Flour", 2);

        Ingredient sugar = new Ingredient("Sugar", 1);


        List<Ingredient> cupboard = new ArrayList<Ingredient>();
        cupboard.add(sugar);


        List<RecipeIngredient> recipe = new ArrayList<RecipeIngredient>();
        recipe.add(recipeSugar);
        recipe.add(recipeFlour);

        int numberOfCakes = baker.getNumberOfCakes(recipe, cupboard);

        assertEquals(0, numberOfCakes);
    }

    @Test
    public void shouldBakeTwoCakes(){
        Baker baker = new Baker();

        RecipeIngredient recipeFlour = new RecipeIngredient("Flour", 500);
        RecipeIngredient recipeSugar = new RecipeIngredient("Sugar", 200);
        RecipeIngredient recipeEggs = new RecipeIngredient("Eggs", 1);

        List<RecipeIngredient> recipe = new ArrayList<RecipeIngredient>();

        recipe.add(recipeFlour);
        recipe.add(recipeSugar);
        recipe.add(recipeEggs);

        Ingredient flour = new Ingredient("Flour", 1200);
        Ingredient sugar = new Ingredient("Sugar", 1200);
        Ingredient eggs = new Ingredient("Eggs", 5);
        Ingredient milk = new Ingredient("Milk", 200);

        List<Ingredient> cupboard = new ArrayList<Ingredient>();
        cupboard.add(flour);
        cupboard.add(sugar);
        cupboard.add(eggs);
        cupboard.add(milk);

        int numberOfCakes = baker.getNumberOfCakes(recipe, cupboard);

        assertEquals(2, numberOfCakes);

    }

//    cakes({flour: 500, sugar: 200, eggs: 1}, {flour: 1200, sugar: 1200, eggs: 5, milk: 200});

//    cakes({apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100}, {sugar: 500, flour: 2000, milk: 2000});
}
