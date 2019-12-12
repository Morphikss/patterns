public class SenderAccount implements Account {
    @Override
    public void unlock(ClientInterface sender) {
        System.out.println("Unlock sender account.");
        sender.unlockAccount();
    }

    @Override
    public void lock(ClientInterface sender) {
        System.out.println("Lock sender account");
        sender.lockAccount();
    }
}
