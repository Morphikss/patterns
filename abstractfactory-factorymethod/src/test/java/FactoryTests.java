import ingredients.*;
import org.junit.Test;
import pizzaType.AmericanPizzaFactory;
import pizzaType.FusionPizzaFactory;
import pizzaType.ItalianPizzaFactory;
import pizzaType.PizzaTypeFactory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FactoryTests {
    @Test
    public void AmericanPizzaFactoryTest() {
        PizzaTypeFactory factory = new AmericanPizzaFactory();
        Ingredient ingredient = factory.takeIngredient();
        Cheese cheese = factory.takeChesse();
        assertTrue(ingredient instanceof Pineapple);
        assertTrue(cheese instanceof Cheddar);
        assertFalse(ingredient instanceof Mushrooms);
        assertFalse(cheese instanceof Gouda);
    }

    @Test
    public void ItalianPizzaFactoryTest() {
        PizzaTypeFactory factory = new ItalianPizzaFactory();
        Ingredient ingredient = factory.takeIngredient();
        Cheese cheese = factory.takeChesse();
        assertTrue(ingredient instanceof Mushrooms);
        assertTrue(cheese instanceof Gouda);
        assertFalse(ingredient instanceof Pineapple);
        assertFalse(cheese instanceof Cheddar);
    }

    @Test
    public void FushionPizzaFactoryTest() {
        PizzaTypeFactory factory = new FusionPizzaFactory();
        Ingredient ingredient = factory.takeIngredient();
        Cheese cheese = factory.takeChesse();
        assertTrue(ingredient instanceof Mushrooms);
        assertTrue(cheese instanceof Cheddar);
        assertFalse(ingredient instanceof Pineapple);
        assertFalse(cheese instanceof Gouda);
    }

    @Test
    public void PizzaTypeFactoryTest() {
        PizzaTypeFactory factory = new FusionPizzaFactory();
        Ingredient ingredient = factory.takeIngredient();
        Cheese cheese = factory.takeChesse();
        assertTrue(ingredient instanceof Ingredient);
        assertTrue(cheese instanceof Cheese);

        factory = new ItalianPizzaFactory();
        ingredient = factory.takeIngredient();
        cheese = factory.takeChesse();
        assertTrue(ingredient instanceof Ingredient);
        assertTrue(cheese instanceof Cheese);

        factory = new AmericanPizzaFactory();
        ingredient = factory.takeIngredient();
        cheese = factory.takeChesse();
        assertTrue(ingredient instanceof Ingredient);
        assertTrue(cheese instanceof Cheese);
    }


}
