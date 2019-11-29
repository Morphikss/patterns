public class ReceiverAccount implements Account {
    @Override
    public void unlock() {
        System.out.println("Unlock receiver account.");
    }

    @Override
    public void lock() {
        System.out.println("Lock receiver account");
    }
}
