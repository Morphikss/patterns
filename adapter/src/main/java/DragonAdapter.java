public class DragonAdapter implements Monster {
    Dragon dragon;

    public DragonAdapter(Dragon newDragon){
        this.dragon = newDragon;
    }

    public void smash() {
        dragon.emblaze();
    }

    public void walkForward() {
        dragon.fly();
    }
}
