public class Stock {
    private int flourAmount;
    public Stock(int flourAmount){
        this.flourAmount = flourAmount;
    }
    public void useFlour(int amountFlourUsed){
        this.flourAmount -= amountFlourUsed;
    }

    public int getFlourAmount() {
        return flourAmount;
    }
}
