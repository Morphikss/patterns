import ingredients.*;
import ingredientsSelect.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class SelectTests {

    @Test
    public void CheeseSelectTest() {
        CheeseSelect selector = new CheddarSelect();
        Cheese cheese = selector.take();
        assertTrue(cheese instanceof Cheese);
        selector = new GoudaSelect();
        cheese = selector.take();
        assertTrue(cheese instanceof Cheese);
    }

    @Test
    public void CheddarSelectTest() {
        CheeseSelect selector = new CheddarSelect();
        Cheese cheese = selector.take();
        assertTrue(cheese instanceof Cheddar);
        assertTrue(cheese instanceof Cheese);

    }

    @Test
    public void GoudaSelectTest() {
        CheeseSelect selector = new GoudaSelect();
        Cheese cheese = selector.take();
        assertTrue(cheese instanceof Gouda);
        assertTrue(cheese instanceof Cheese);
    }

    @Test
    public void IngredientSelectTest() {
        IngredientSelect selector = new MushroomsSelect();
        Ingredient ingredient = selector.take();
        assertTrue(ingredient instanceof Ingredient);
        selector = new PineappleSelect();
        ingredient = selector.take();
        assertTrue(ingredient instanceof Ingredient);
    }

    @Test
    public void MushroomsSelectTest() {
        IngredientSelect selector = new MushroomsSelect();
        Ingredient ingredient = selector.take();
        assertTrue(ingredient instanceof Mushrooms);
        assertTrue(ingredient instanceof Ingredient);

    }

    @Test
    public void PineappleSelectTest() {
        IngredientSelect selector = new PineappleSelect();
        Ingredient ingredient = selector.take();
        assertTrue(ingredient instanceof Pineapple);
        assertTrue(ingredient instanceof Ingredient);

    }

}
