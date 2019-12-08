public class Flyweight {
    public static void main(String[] args){
        Monster armyOfTroll = new ArmyOfTroll(10000);
        Enemy enemy = new Enemy(100000);
        armyOfTroll.smash(enemy);
        armyOfTroll.smash(enemy);
    }
}
