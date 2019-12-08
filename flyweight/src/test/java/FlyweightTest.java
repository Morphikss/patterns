import static org.junit.Assert.*;

public class FlyweightTest {
    @org.junit.Test
    public void test() {
        Monster armyOfTroll = new ArmyOfTroll(10000);
        Enemy enemy = new Enemy(75000);
        armyOfTroll.smash(enemy);
        armyOfTroll.smash(enemy);
        assertEquals(0, enemy.Health());

        Monster armyOfTroll1 = new ArmyOfTroll(10000);
        Enemy enemy1 = new Enemy(75000);
        armyOfTroll1.smash(enemy1);
        assertEquals(25000, enemy1.Health());
        armyOfTroll1.smash(enemy1);
        assertEquals(enemy.Health(), enemy1.Health());
    }

}