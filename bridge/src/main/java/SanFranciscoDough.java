public class SanFranciscoDough implements Dough {

    public void chooseDough(Stock stock){
        System.out.println("san francisco");
        System.out.println("300g of flour less in stock");
        stock.useFlour(300);
    }
}
