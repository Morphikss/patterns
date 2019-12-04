package pizzaType;

import ingredients.Cheese;
import ingredients.Ingredient;

public interface PizzaTypeFactory {
    Cheese takeChesse();
    Ingredient takeIngredient();
}
