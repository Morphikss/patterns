import static org.junit.Assert.*;

public class FacadeTest {

    @org.junit.Test
    public void test() {
        MainApi api = new MainApi(200,200);
        System.out.println(api.isLocked());


        api.blockSenderAccount();
        System.out.println(api.isLocked());
        assertTrue(api.isLocked());

        api.openSenderAccount();
        System.out.println(api.isLocked());
        assertFalse(api.isLocked());
    }
    @org.junit.Test
    public void test1() {
        MainApi api = new MainApi(200,200);

        api.tranfer(200);
        double balance = api.getSenderBalance();
        assertEquals(0,api.getSenderBalance(), 0.0001);
        assertEquals(400,api.getReceiverBalance(), 0.0001);
        System.out.println(api.getSenderBalance());
        System.out.println(api.getReceiverBalance());

    }


}