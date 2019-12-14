public class ReceiverAccount implements Account {
    @Override
    public void unlock(ClientInterface receiver) {
        System.out.println("Unlock receiver account.");
        receiver.unlockAccount();

    }

    @Override
    public void lock(ClientInterface receiver) {
        System.out.println("Lock receiver account");
        receiver.lockAccount();
    }
}
