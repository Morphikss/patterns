import org.junit.Test;


public class DecoratorTest {
    @Test
    public void test2(){
        Enemy enemy = new Enemy(10);
        Monster troll = new Troll();

        troll = new BuffDecorator(troll, 5);
        troll.smash(enemy);
        System.out.println(enemy.Health());
    }
}
