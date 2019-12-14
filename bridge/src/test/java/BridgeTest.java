import static org.junit.Assert.*;

public class BridgeTest {

    @org.junit.Test
    public void test() {
        Dough fat = new FatDough();
        Dough sanFrancisco = new SanFranciscoDough();
        Stock stock = new Stock(500);

        Type american = new AmericanType(fat, stock);
        american.chooseDough();
        Type italian = new ItalianType(sanFrancisco, stock);
        italian.chooseDough();

        assertEquals(0,stock.getFlourAmount());

        Type americann = new AmericanType(fat, stock);
        Type italiann = new ItalianType(fat, stock);
        assertEquals(americann.dough, italiann.dough);
    }
}