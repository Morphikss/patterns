public class Client implements ClientInterface{
    private boolean lock;
    private double balance;

    public Client(double balance){
        this.balance = balance;
        this.lock = true;
    }

    @Override
    public void lockAccount() {
        setLock(true);
    }

    @Override
    public void unlockAccount() {
        setLock(false);
    }

    @Override
    public void increaseBalance(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void decreaseBalance(double amount) {
        setBalance(getBalance() - amount);
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
