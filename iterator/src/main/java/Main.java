import java.util.Iterator;

public class Main {

    public static void main( String[] args ) {
        PizzaMenuApi menuApi = new PizzaMenuApi();

        menuApi.addPizza(new Pizza("Capriciosa", 2));
        menuApi.addPizza(new Pizza("Chicken", 3));
        menuApi.addPizza(new Pizza("Hawaii", 4));

        Iterator<Pizza> iterator = menuApi.iterator();
        menuApi.printPizzas(iterator);
    }

}
