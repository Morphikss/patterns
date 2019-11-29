public class SenderAccount implements Account {
    @Override
    public void unlock() {
        System.out.println("Unlock sender account.");
    }

    @Override
    public void lock() {
        System.out.println("Lock sender account");
    }
}
