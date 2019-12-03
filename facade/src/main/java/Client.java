public class Client implements ClientInterface{
    private boolean locked;
    private double balance;

    public Client(double balance){
        this.balance = balance;
        this.locked = false;
    }

    @Override
    public void lockAccount() {
        setLocked(true);
    }

    @Override
    public void unlockAccount() {
        setLocked(false);
    }

    @Override
    public void increaseBalance(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void decreaseBalance(double amount) {
        setBalance(getBalance() - amount);
    }

    @Override
    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
