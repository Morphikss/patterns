package pizzaType;

import ingredients.Cheddar;
import ingredients.Cheese;
import ingredients.Ingredient;
import ingredients.Pineapple;


public class AmericanPizzaFactory implements PizzaTypeFactory{

    @Override
    public Cheese takeChesse() {
        return new Cheddar();
    }

    @Override
    public Ingredient takeIngredient() {
        return new Pineapple();
    }
    
}
