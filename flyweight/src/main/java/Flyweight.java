public class Flyweight {
    public static void main(String[] args){
        Monster armyOfTroll = new ArmyOfTroll(10000);
        armyOfTroll.walkForward();
        Enemy enemy = new Enemy(75000);
        armyOfTroll.smash(enemy);
        armyOfTroll.smash(enemy);
    }
}
