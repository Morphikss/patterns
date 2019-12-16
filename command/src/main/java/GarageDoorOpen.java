public class GarageDoorOpen implements CommanderInterface {
    @Override
    public void execute(DevicesState devices) {
        devices.setGarageDoorOpened(true);
        System.out.println("Garage door open");
    }

}
