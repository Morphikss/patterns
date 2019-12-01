public class Adapter {
    public static void main(String[] args){
        Dragon dragon1 = new Dragon();
        Enemy enemy1 = new Enemy(10);
        Monster dragonAdapter = new MonsterAdapter(dragon1);

        dragonAdapter.walkForward();
        dragonAdapter.smash(enemy1);

        System.out.println(enemy1.Health());
    }
}
