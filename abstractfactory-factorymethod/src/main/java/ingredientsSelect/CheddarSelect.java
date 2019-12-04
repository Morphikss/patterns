package ingredientsSelect;

import ingredients.Cheddar;
import ingredients.Cheese;

public class CheddarSelect implements CheeseSelect{

    @Override
    public Cheese take() {
        return new Cheddar();
    }
    
}
