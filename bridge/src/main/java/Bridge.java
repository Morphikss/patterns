public class Bridge {
    public static void main(String[] args) {
        Stock stock = new Stock(500);
        Type american = new AmericanType(new FatDough(), stock);
        american.chooseDough();
        Type italian = new ItalianType(new SanFranciscoDough(), stock);
        italian.chooseDough();
    }


}

