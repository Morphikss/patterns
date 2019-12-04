package ingredientsSelect;

import ingredients.Cheese;
import ingredients.Gouda;

public class GoudaSelect implements CheeseSelect{

    @Override
    public Cheese take() {
        return new Gouda();
    }
    
}

