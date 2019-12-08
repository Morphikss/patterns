public class ProxyMainApi implements IApi {
    IApi mainApi;

    public ProxyMainApi(double b1, double b2){
        mainApi = new MainApi(b1, b2);
        
    }

    @Override
    public void transfer(double amount) {

    }

    @Override
    public double getSenderBalance() {
        return 0;
    }

    @Override
    public double getReceiverBalance() {
        return 0;
    }

    @Override
    public boolean isLocked() {
        return false;
    }
}
