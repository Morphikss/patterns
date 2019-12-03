import static org.junit.Assert.*;

public class CompositeTest {
    @org.junit.Test
    public void test() {
        Player player = new Player(4);
        Player player2 = new Player(4);
        Player player3 = new Player(8);

        Horde horde = new Horde();
        Horde horde2 = new Horde();
        Horde horde3 = new Horde();

        Monster zombie1 = new Zombie(2);
        Monster zombie2 = new Zombie(2);
        Monster zombie3 = new Zombie(2);
        Monster zombie4 = new Zombie(2);

        horde.addMonster(zombie1);
        horde.addMonster(zombie2);
        horde2.addMonster(zombie3);
        horde2.addMonster(zombie4);


        horde.smash(player);
        assertEquals(0, player.getHp(),0.001);

        horde2.smash(player2);
        assertEquals(0, player2.getHp(),0.001);

        horde3.addMonster(horde);
        horde3.addMonster(horde2);


        horde3.smash(player3);
        assertEquals(0, player3.getHp(),0.001);

    }

}