public class Bridge {
    public static void main(String[] args) {
        Type american = new AmericanType(new FatDough());
        american.chooseDough();
        Type italian = new ItalianType(new SanFranciscoDough());
        italian.chooseDough();
    }


}

