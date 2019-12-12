public class Troll implements Monster {
    @Override
    public void smash(Enemy enemy) {
        enemy.DealDamage(5);
    }

    public void walkForward() {
        System.out.println("Troll walks 5 meters forward");
    }
}

