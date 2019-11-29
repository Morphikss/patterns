import jdk.tools.jaotc.Main;

public class Facade {

    public class DesignPatternsFacade{

        public  void main(String[] args){
            MainApi manager = new MainApi();
            manager.ownTranfer();
            manager.usualTranfer();
            manager.blockAccount();
            manager.openAccount();
        }
    }

}
