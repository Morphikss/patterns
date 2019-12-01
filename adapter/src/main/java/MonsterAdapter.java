public class MonsterAdapter implements Monster {
    Dragon dragon;

    public MonsterAdapter(Dragon newDragon){
        this.dragon = newDragon;
    }

    public void smash(Enemy enemy) {
        dragon.emblaze(enemy);
    }

    public void walkForward() {
        dragon.fly();
    }
}
