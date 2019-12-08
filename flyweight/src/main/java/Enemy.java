public class Enemy {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void DealDamage(int damage) {
        this.health -= damage;
    }

    public int Health() {
        return health;
    }

    public void crump(ArmyOfTroll army){
        System.out.println("Smash half of army population");
        int missed = army.healthOfMonsters.size()/2;
        for(int i = army.healthOfMonsters.size(); i > missed; i--){
            army.healthOfMonsters.remove(i-1);
            army.attackDamageOfMonsters.remove(i-1);
        }
        if(army.healthOfMonsters.size() > 50) {
            System.out.println(army.healthOfMonsters.size() + " left. Oh really, that's it?");
        }else System.out.println("Oh shit...");
    }

}
