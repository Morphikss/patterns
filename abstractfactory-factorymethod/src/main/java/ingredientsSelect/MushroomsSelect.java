package ingredientsSelect;

import ingredients.Ingredient;
import ingredients.Mushrooms;


public class MushroomsSelect implements IngredientSelect {

    @Override
    public Ingredient take() {
        return new Mushrooms();
    }
    
}
