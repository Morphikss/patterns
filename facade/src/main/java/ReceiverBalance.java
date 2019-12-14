public class ReceiverBalance implements Balance {
    @Override
    public void increase(ClientInterface receiver, double amount) {
        System.out.println("Increase receiver balance.");
        receiver.increaseBalance(amount);

    }

    @Override
    public void decrease(ClientInterface receiver, double amount) {
        System.out.println("Decrease receiver balance.");
        receiver.decreaseBalance(amount);

    }
}
