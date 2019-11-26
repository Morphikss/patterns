


public class Goblin implements Monster {
    int x = 0;
    public Goblin(){
        System.out.println("Made Goblin");
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
