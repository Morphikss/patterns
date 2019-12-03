import java.util.ArrayList;
import java.util.List;

public class Horde implements Monster {
    private List<Monster> monsters = new ArrayList<>();

    public void addMonster(Monster monster){
        System.out.println("Add children: " + monster);
        monsters.add(monster);
    }

    @Override
    public void smash(Player player) {
        System.out.println("Walka");
        if(!monsters.isEmpty()){
            for(Monster monster: monsters ){
                if(monster instanceof Monster){
                    monster.smash(player);
                }
            }
        }
    }


}
