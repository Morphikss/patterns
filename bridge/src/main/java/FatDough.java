public class FatDough implements Dough {
    public void chooseDough(Stock stock){
        System.out.println("fat");
        System.out.println("200g of flour less in stock");
        stock.useFlour(200);
    }
}
