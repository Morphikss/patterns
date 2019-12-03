public interface Balance {
    void increase(ClientInterface client, double amount);
    void decrease(ClientInterface client, double amount);
}
