public class Zombie implements Monster {
    int attackDamage;

    public Zombie(int attackDamage){
        this.attackDamage = attackDamage;
    }


    @Override
    public void smash() {
        System.out.println("SMASH THEM ALL");
    }
}
