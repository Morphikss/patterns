public class DrivewayLightsOn implements CommanderInterface {
    @Override
    public void execute(DevicesState devices) {
        devices.setDrivewayLightsOn(true);
        System.out.println("Driveway lights on");
    }

}
