
import ingredients.Cheese;
import ingredients.Ingredient;
import pizzaType.AmericanPizzaFactory;
import pizzaType.ItalianPizzaFactory;
import pizzaType.PizzaTypeFactory;


public class main {
    public static void main(String[] args) {
         makePizza(new AmericanPizzaFactory());
         makePizza(new ItalianPizzaFactory());
         
    }
    public static void makePizza(PizzaTypeFactory type){
        Cheese chesse = type.takeChesse();
        Ingredient ingredient = type.takeIngredient();
        
        chesse.add();
        ingredient.add();
    }
}
