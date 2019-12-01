


public class Goblin implements Monster {
    private int hp = 0;

    public Goblin(int hp){
        this.hp = hp;
        System.out.println("Made Goblin with " + hp + " hp.");
    }

    public void changeHealth(int hp){
        this.hp = hp;
    }

    public int health(){
        return this.hp;
    }

    public Monster makeCopy() {
        System.out.println("Coping Goblin");
        Goblin goblinObject = null;
        try {
            goblinObject = (Goblin) super.clone();
        }
        catch( CloneNotSupportedException e){
            System.out.println("Goblin turned into dust");
        }

        return goblinObject;
    }

}
