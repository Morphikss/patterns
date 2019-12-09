import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyTest {

    /**
     * reszta testow dla tego modulu znajduje sie w fasadzie.
     */
    @Test
    public void test() {
        IApi manager = new ProxyMainApi(300,200, Authorization.USER);
        assertEquals(300, manager.getSenderBalance(), 0.01);
        assertEquals(0, manager.getReceiverBalance(), 0.01);
        assertFalse(manager.isLocked());

        manager.transfer(200);
        assertEquals(300, manager.getSenderBalance(), 0.01);
        assertTrue(manager.isUnwantedAccess());
    }
}