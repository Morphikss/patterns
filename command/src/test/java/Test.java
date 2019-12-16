import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void test1() {
        MainApi api = new MainApi();
        api.comingHome();
        assertTrue(api.getDevices().isDrivewayLightsOn());
        assertTrue(api.getDevices().isGarageDoorOpened());
        assertTrue(api.getDevices().isGateOpened());
        assertTrue(api.getDevices().isDoorOpened());

        api.comingWork();

        assertFalse(api.getDevices().isDrivewayLightsOn());
        assertFalse(api.getDevices().isGarageDoorOpened());
        assertFalse(api.getDevices().isGateOpened());
        assertFalse(api.getDevices().isDoorOpened());

    }
}