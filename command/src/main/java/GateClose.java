public class GateClose implements CommanderInterface {
    @Override
    public void execute(DevicesState devices) {
        devices.setGateOpened(false);
        System.out.println("Gate close");
    }

    @Override
    public void undo() {

    }
}
