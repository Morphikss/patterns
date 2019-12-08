import java.util.ArrayList;
import java.util.List;

public class ArmyOfTroll implements Monster {
    public List<Integer> healthOfMonsters;
    public List<Integer> attackDamageOfMonsters;

    public ArmyOfTroll(int sizeOfArmy){
        healthOfMonsters = new ArrayList<>();
        attackDamageOfMonsters = new ArrayList<>();
        for(int i = 0; i < sizeOfArmy; i++){
            healthOfMonsters.add(1);
            attackDamageOfMonsters.add(5);
        }
    }


    @Override
    public void smash(Enemy enemy) {
        if(healthOfMonsters.size() == attackDamageOfMonsters.size()){
            for (Integer temp : attackDamageOfMonsters){
                enemy.DealDamage(temp);
                if(enemy.Health() <= 0) {
                    System.out.println("Enemy is dead");
                    break;
                }
            }

            enemy.crump(this);
        }
        else {
            System.out.println("Something is wrong!");
            System.exit(32);
        }

    }

    @Override
    public void walkForward() {
        System.out.println("10000 trolls army coming to your gates");
    }
}
