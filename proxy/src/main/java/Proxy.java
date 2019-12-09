public class Proxy {
    public static void main(String[] args){

        IApi manager = new ProxyMainApi(300,200, Authorization.USER);
        System.out.println(manager.isLocked());
        manager.transfer(200);
        System.out.println(manager.getSenderBalance());
        System.out.println(manager.getReceiverBalance());

        IApi manager1 = new ProxyMainApi(300,200, Authorization.ADMIN);
        System.out.println(manager1.isLocked());
        manager1.transfer(200);
        System.out.println(manager1.getSenderBalance());
        System.out.println(manager1.getReceiverBalance());

    }
}



