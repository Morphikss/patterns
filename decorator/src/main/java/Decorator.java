public class Decorator {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(5);
        Monster troll = new Troll();

        troll = new BuffDecorator(troll, 5);
        troll.smash(enemy);
        System.out.println(enemy.Health());
    }
}
