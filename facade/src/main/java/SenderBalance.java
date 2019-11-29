public class SenderBalance implements Balance {
    @Override
    public void increase() {
        System.out.println("Increase sender balance.");
    }

    @Override
    public void decrease() {
        System.out.println("Decrease sender balance.");
    }
}
