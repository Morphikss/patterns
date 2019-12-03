import static org.junit.Assert.*;

public class FacadeTest {
    @org.junit.Test
    public void test() {
        MainApi api = new MainApi(400,200);
        api.tranfer(200);
        assertEquals(api.getSenderBalance(),api.getReceiverBalance());
        System.out.println(api.getSenderBalance());
        System.out.println(api.getReceiverBalance());

        
    }

}