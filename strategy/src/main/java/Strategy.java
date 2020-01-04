public class Strategy {
    public static void main(String[] args) {
        Monster troll = new Troll();
        Monster dragon = new Dragon();

        System.out.println(troll.toMove());
        System.out.println(dragon.toMove());

        dragon.setWalkingAbility(new walks());
        System.out.println(dragon.toMove());

        dragon.setFlyingAbility(new flies());

        System.out.println(dragon.toMove());
    }

}
