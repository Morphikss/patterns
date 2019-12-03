
public class Facade {

        public static void main(String[] args){
            MainApi manager = new MainApi(300,200);
            manager.tranfer(200);
            System.out.println(manager.getSenderBalance());
            System.out.println(manager.getReceiverBalance());

        }

}

