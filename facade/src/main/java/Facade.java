import jdk.tools.jaotc.Main;

public class Facade {

    public class DesignPatternsFacade{

        public  void main(String[] args){
            MainApi manager = new MainApi(300,200);
            manager.tranfer(200);
            
        }
    }

}
