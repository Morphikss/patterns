import static org.junit.Assert.*;

public class StrategyTest {

    @org.junit.Test
    public void test1() {
        Monster troll = new Troll();
        Monster dragon = new Dragon();

        System.out.println(troll.toMove());
        System.out.println(dragon.toMove());
        assertEquals("walks", troll.toMove());
        assertEquals("fly", dragon.toMove());



        dragon.setWalkingAbility(new walks());
        System.out.println(dragon.toMove());

        assertEquals("walks", dragon.toMove());

        dragon.setFlyingAbility(new flies());
        System.out.println(dragon.toMove());

        assertEquals("fly", dragon.toMove());
    }
}