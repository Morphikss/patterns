public class MainApi {
    private Account senderAccount;
    private Account receiverAccount;
    private Balance senderBalance;
    private Balance receiverBalance;
    private ClientInterface sender;
    private ClientInterface receiver;

    public MainApi(double b1, double b2){
        this.senderAccount = new SenderAccount();
        this.receiverAccount = new ReceiverAccount();
        this.senderBalance = new SenderBalance();
        this.receiverBalance = new ReceiverBalance();
        this.sender = new Client(b1);
        this.receiver = new Client(b2);
    }
    public void tranfer(double amount){
        senderAccount.lock(sender);
        senderBalance.decrease(sender, amount);
        receiverAccount.lock(receiver);
        receiverBalance.increase(receiver, amount);
        senderAccount.unlock(sender);
        receiverAccount.unlock(receiver);
    }

    public double getSenderBalance(){
        return sender.getBalance();
    }

    public double getReceiverBalance(){
        return receiver.getBalance();
    }

    public boolean isLocked(){
        return sender.isLocked();
    }

    public void blockSenderAccount(){
        senderAccount.lock(sender);
    }

    public void openSenderAccount(){
        senderAccount.unlock(sender);
    }
}


