public class Composite {
    public static void main(String[] args){
        Player player = new Player(2);
        Player player2 = new Player(2);
        Player player3 = new Player(4);

        Horde horde = new Horde();
        Horde horde2 = new Horde();
        Horde horde3 = new Horde();


        Monster zombie1 = new Zombie(1);
        Monster zombie2 = new Zombie(1);
        Monster zombie3 = new Zombie(1);
        Monster zombie4 = new Zombie(1);

        horde.addMonster(zombie1);
        horde.addMonster(zombie2);
        horde2.addMonster(zombie3);
        horde2.addMonster(zombie4);


        horde.smash(player);
        horde2.smash(player2);
        horde3.addMonster(horde);
        horde3.addMonster(horde2);
        horde3.smash(player3);


    }
}
