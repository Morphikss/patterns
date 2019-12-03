public interface ClientInterface {
    void lockAccount();
    void unlockAccount();
    void increaseBalance(double amount);
    void decreaseBalance(double amount);
    double getBalance();
    boolean isLocked();
}
