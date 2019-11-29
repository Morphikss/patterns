public class MainApi {
    private Account senderAccount = new SenderAccount();
    private Account receiverAccount = new ReceiverAccount();
    private Balance senderBalance = new SenderBalance();
    private Balance receiverBalance = new ReceiverBalance();

    public void usualTranfer(){
        senderAccount.lock();
        senderBalance.decrease();
        receiverAccount.lock();
        receiverBalance.increase();
        senderAccount.unlock();
        receiverAccount.unlock();

    }
    public void ownTranfer(){
        senderAccount.lock();
        senderBalance.decrease();
        senderBalance.increase();
        senderAccount.unlock();

    }
    public void blockAccount(){
        senderAccount.lock();
    }

    public void openAccount(){
        senderAccount.unlock();
    }
}


//    private Light livingRoomLight = new LivingRoomLight();
//    private Light hallLight = new HallLight();
//    private Door mainDoor = new MainDoor();
//    private Door garageDoor = new GarageDoor();
//
//    public void lockHome(){
//
//        System.out.println("------ LOCK HOME -----");
//        livingRoomLight.off();
//        hallLight.off();
//        mainDoor.lock();
//        garageDoor.lock();
//    }
//
//    public void unlockHome(){
//
//        System.out.println("------ UNLOCK HOME -----");
//        hallLight.on();
//        mainDoor.unlock();
//        garageDoor.unlock();
//    }
//
//    public void lightOff(){
//
//        System.out.println("------ LIGHT OFF -----");
//        livingRoomLight.off();
//        hallLight.off();
//    }
//
//    public void lightOn(){
//
//        System.out.println("------ LIGHT ON -----");
//        livingRoomLight.on();
//        hallLight.on();
//    }