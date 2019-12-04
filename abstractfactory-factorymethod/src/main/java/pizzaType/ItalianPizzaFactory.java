package pizzaType;

import ingredients.Cheese;
import ingredients.Gouda;
import ingredients.Ingredient;
import ingredients.Mushrooms;


public class ItalianPizzaFactory implements PizzaTypeFactory{

    @Override
    public Cheese takeChesse() {
        return new Gouda();
    }

    @Override
    public Ingredient takeIngredient() {
       return new Mushrooms(); 
    }
    
}
