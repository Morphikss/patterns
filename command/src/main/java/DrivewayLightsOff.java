public class DrivewayLightsOff implements CommanderInterface {
    @Override
    public void execute(DevicesState devices) {
        devices.setDrivewayLightsOn(false);
        System.out.println("Driveway lights off");
    }

}
