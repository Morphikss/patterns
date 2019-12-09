public interface IApi {
    void transfer(double amount);
    double getSenderBalance();
    double getReceiverBalance();
    boolean isLocked();
    boolean isUnwantedAccess();
}
