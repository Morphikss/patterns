public class GarageDoorClose implements CommanderInterface {
    @Override
    public void execute(DevicesState devices) {
        devices.setGarageDoorOpened(false);
        System.out.println("Garage door close");
    }

    @Override
    public void undo() {

    }
}
