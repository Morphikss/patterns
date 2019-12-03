
public class Facade {

        public static void main(String[] args){
            MainApi manager = new MainApi(300,200);
            System.out.println(manager.isLocked());
            manager.tranfer(200);
            System.out.println(manager.getSenderBalance());
            System.out.println(manager.getReceiverBalance());
            System.out.println(manager.isLocked());
        }

}

