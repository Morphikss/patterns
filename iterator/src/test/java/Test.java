import java.util.Iterator;

import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void test1() {
        PizzaMenuApi menuApi = new PizzaMenuApi();

        menuApi.addPizza(new Pizza("Capriciosa", 2));
        menuApi.addPizza(new Pizza("Chicken", 3));
        menuApi.addPizza(new Pizza("Hawaii", 4));

        Iterator<Pizza> iterator = menuApi.iterator();
        menuApi.printPizzas(iterator);

        Iterator<Pizza> iterator2 = menuApi.iterator();
        Iterator<Pizza> iterator3 = menuApi.iterator();

        assertEquals(2, iterator2.next().getPrice());
        assertEquals("Capriciosa", iterator3.next().getName());
        assertTrue(iterator2.hasNext());

        assertEquals(3, iterator2.next().getPrice());
        assertEquals("Chicken", iterator3.next().getName());
        assertTrue(iterator2.hasNext());

        assertEquals(4, iterator2.next().getPrice());
        assertEquals("Hawaii", iterator3.next().getName());
        assertFalse(iterator2.hasNext());
    }
}