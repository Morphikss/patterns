public class ProxyMainApi implements IApi {
    private IApi mainApi;
    private Authorization access;
    private boolean unwantedAccess;

    public ProxyMainApi(double b1, double b2, Authorization access){
        unwantedAccess = false;
        mainApi = new MainApi(b1, b2);
        this.access = access;
    }

    @Override
    public void transfer(double amount) {
        if(access == Authorization.ADMIN) {
            mainApi.transfer(200);
        }
        else{
            unwantedAccess = true;
            System.out.println("Warning, we have any unwanted person");
        }
    }

    @Override
    public double getSenderBalance() {
        if(access == Authorization.ADMIN || access == Authorization.USER) {
            return mainApi.getSenderBalance();
        }
        else{
            System.out.println("Permission denied");
            return 0;
        }
    }

    @Override
    public double getReceiverBalance() {
        if(access == Authorization.ADMIN) {
            return mainApi.getReceiverBalance();
        }
        else{
            System.out.println("Permission denied");
            return 0;
        }
    }

    @Override
    public boolean isLocked() {
        if(access == Authorization.ADMIN) {
            return mainApi.isLocked();
        }
        else{
            System.out.println("Permission denied");
            return false;
        }
    }
    public IApi getMainAp(){
        if(access == Authorization.ADMIN) {
            return mainApi;
        }
        return null;
    }

    @Override
    public boolean isUnwantedAccess(){
        return unwantedAccess;
    }
}
