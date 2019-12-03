public class SenderBalance implements Balance {
    @Override
    public void increase(ClientInterface sender, double amount) {
        System.out.println("Increase sender balance.");
        sender.increaseBalance(amount);

    }

    @Override
    public void decrease(ClientInterface sender, double amount) {
        System.out.println("Decrease sender balance.");
        sender.decreaseBalance(amount);

    }
}
