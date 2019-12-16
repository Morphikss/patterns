public class DoorOpen implements CommanderInterface {
    @Override
    public void execute(DevicesState devices) {
        devices.setDoorOpened(true);
        System.out.println("Main door open");
    }

}
