public class ReceiverBalance implements Balance {
    @Override
    public void increase() {
        System.out.println("Increase receiver balance.");
    }

    @Override
    public void decrease() {
        System.out.println("Decrease receiver balance.");
    }
}
