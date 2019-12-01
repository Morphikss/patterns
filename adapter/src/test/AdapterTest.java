import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdapterTest {
    @Test
    public void test1(){
        Dragon dragon = new Dragon();
        Troll troll = new Troll();
        Enemy enemy = new Enemy(10);
        Monster monsterAdapter = new MonsterAdapter(dragon);

        monsterAdapter.walkForward();
        monsterAdapter.smash(enemy);

        assertEquals(0, enemy.Health());

        Enemy enemy1 = new Enemy(10);
        troll.smash(enemy1);
        troll.smash(enemy1);
        assertEquals(enemy1.Health(), enemy.Health());
    }


}
