/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaType;

import ingredients.Cheddar;
import ingredients.Cheese;
import ingredients.Ingredient;
import ingredients.Mushrooms;

/**
 *
 * @author Maciej
 */
public class FusionPizzaFactory implements PizzaTypeFactory {

    @Override
    public Cheese takeChesse() {
        return new Cheddar();
    }

    @Override
    public Ingredient takeIngredient() {
        return new Mushrooms(); 
    }
    
}
