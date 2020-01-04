import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


/**
 * Czesc tego programu jest przetestowane w poprzednim wzorcu np. adapter, dekorator.
 * tutaj jest zawarte to co najwazniejsze.
 */
public class ObserverTest {
    @Test
    public void test3(){
        Enemy orcAdam = new Enemy(5);
        orcAdam.addObserver(new Notification("orcAdam"));
        Monster troll = new Troll();
        assertFalse("Notification is shown on HUD",orcAdam.observerOneStatus().isShowTargetDead());
        System.out.println(orcAdam.observerOneStatus().isShowTargetDead());
        troll.smash(orcAdam);
        System.out.println(orcAdam.observerOneStatus().isShowTargetDead());
        assertTrue("Notification isnt shown on HUD beacause target is still alive" ,orcAdam.observerOneStatus().isShowTargetDead());
    }
}
