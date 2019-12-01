public class BuffDecorator implements Monster{
    Monster monster;
    int bonusDamage;

    public BuffDecorator(Monster monster, int bonusDamage){
        this.monster = monster;
        this.bonusDamage = bonusDamage;
    }

    @Override
    public void smash(Enemy enemy) {
        this.monster.smash(enemy);
        enemy.DealDamage(this.bonusDamage);
    }

    @Override
    public void walkForward() {
        System.out.println("walk 5 meters and regenerate hp");
    }
}
