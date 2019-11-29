public class ReceiverAccount implements Account {
    public void unlock() {
        System.out.println("Unlock sender account.");
    }

    public void lock() {
        System.out.println("Lock sender account");
    }
}
