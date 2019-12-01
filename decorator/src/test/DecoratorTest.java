import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class DecoratorTest {
    @Test
    public void test2(){
        Enemy enemy = new Enemy(10);
        Monster troll = new Troll();

        troll = new BuffDecorator(troll, 5);
        troll.smash(enemy);
        assertEquals("Decorator with bonus damage works and dealt 5 more damage", 0, enemy.Health());
    }
}
