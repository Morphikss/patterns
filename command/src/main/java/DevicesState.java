public class DevicesState {
    private boolean isGateOpened = false;
    private boolean isDrivewayLightsOn = false;
    private boolean isGarageDoorOpened = false;
    private boolean isDoorOpened = false;

    public boolean isGateOpened() {
        return isGateOpened;
    }

    public void setGateOpened(boolean gateOpened) {
        isGateOpened = gateOpened;
    }

    public boolean isDrivewayLightsOn() {
        return isDrivewayLightsOn;
    }

    public void setDrivewayLightsOn(boolean drivewayLightsOn) {
        isDrivewayLightsOn = drivewayLightsOn;
    }

    public boolean isGarageDoorOpened() {
        return isGarageDoorOpened;
    }

    public void setGarageDoorOpened(boolean garageDoorOpened) {
        isGarageDoorOpened = garageDoorOpened;
    }

    public boolean isDoorOpened() {
        return isDoorOpened;
    }

    public void setDoorOpened(boolean doorOpened) {
        isDoorOpened = doorOpened;
    }
}
