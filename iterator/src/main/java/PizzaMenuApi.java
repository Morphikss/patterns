import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PizzaMenuApi {
    private List<Pizza> pizzas;

    public PizzaMenuApi() {
        this.pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public Iterator<Pizza> iterator(){
        return new MenuIterator();
    }

    public class MenuIterator implements Iterator{
        int currentIndex = 0;

        public Pizza next() {
            Pizza item = pizzas.get(currentIndex);
            currentIndex++;
            return item;
        }

        public boolean hasNext() {
            if(pizzas.size() <= currentIndex || pizzas.get(currentIndex) == null) return false;
            return true;
        }
    }

    public static void printPizzas(Iterator<Pizza> iterator){
        if(iterator != null){
            while(iterator.hasNext()) System.out.println(iterator.next().getName());
        }
    }
}
