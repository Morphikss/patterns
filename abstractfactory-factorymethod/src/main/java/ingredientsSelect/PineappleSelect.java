package ingredientsSelect;

import ingredients.Ingredient;
import ingredients.Pineapple;


public class PineappleSelect implements IngredientSelect {

    @Override
    public Ingredient take() {
        return new Pineapple();
    }
    
}
    
