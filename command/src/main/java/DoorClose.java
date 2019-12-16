public class DoorClose implements CommanderInterface{
    @Override
    public void execute(DevicesState devices) {
        devices.setDoorOpened(false);
        System.out.println("Main door closed");
    }
}
