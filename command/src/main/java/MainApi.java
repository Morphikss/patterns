import java.util.ArrayList;

public class MainApi {
    private ArrayList< CommanderInterface > goingHome = new ArrayList<>();
    private ArrayList< CommanderInterface > goingWork = new ArrayList<>();
    private DevicesState devices = new DevicesState();

    public MainApi(){
        goingHome.add(new DrivewayLightsOn());
        goingHome.add(new GateOpen());
        goingHome.add(new GarageDoorOpen());
        goingHome.add(new DoorOpen());

        goingWork.add(new GarageDoorClose());
        goingWork.add(new GateClose());
        goingWork.add(new DrivewayLightsOff());
        goingWork.add(new DoorClose());
    }

    public void comingHome(){
        for (CommanderInterface command : goingHome){
            if (command instanceof CommanderInterface) {
                command.execute(devices);
            }
        }
    }

    public void comingWork(){
        for (CommanderInterface command : goingWork){
            if (command instanceof CommanderInterface) {
                command.execute(devices);
            }
        }
    }

    public DevicesState getDevices(){
        return devices;
    }
}
