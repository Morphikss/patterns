import java.util.ArrayList;
import java.util.List;

public class Combat implements Monster {
    private Player player;
    private List<Monster> monsters = new ArrayList<>();

    public void addMonster(Monster monster){
        System.out.println("Add children: " + monster);
        monsters.add(monster);
    }

    @Override
    public void smash() {
        System.out.println("Kompozyt");
        if(!monsters.isEmpty()){
            for(Monster monster: monsters ){
                if(monster instanceof Monster){
                    monster.smash();
                }
            }
        }
    }


}
