public class Adapter {
    public static void main(String[] args){
        Troll troll1 = new Troll();
        Dragon dragon1 = new Dragon();

        Monster dragonAdapter = new DragonAdapter(dragon1);

        troll1.smash();
        troll1.walkForward();

        dragon1.fly();
        dragon1.emblaze();

        dragonAdapter.walkForward();
        dragonAdapter.smash();

        Monster monsterr = dragonAdapter;
        monsterr.smash();
        monsterr.walkForward();
        monsterr = troll1;
        monsterr.smash();
        monsterr.walkForward();
    }
}
