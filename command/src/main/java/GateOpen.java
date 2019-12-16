public class GateOpen implements CommanderInterface{
    @Override
    public void execute(DevicesState devices) {
        devices.setGateOpened(true);
        System.out.println("Gate open");
    }

    @Override
    public void undo() {

    }
}
