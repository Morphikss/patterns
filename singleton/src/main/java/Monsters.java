import java.util.ArrayList;
import java.util.List;


public class Monsters {
    
    List<Monster> monsters = new ArrayList<Monster>();
    private static Monsters instance = new Monsters();
    
    private Monsters() {
    }
    
    
    public static Monsters getInstance() {
        return instance;
    }
    
    public void addMonster(Monster monster) {
        monsters.add(monster);
    }
    public List<Monster> getMonsters() {
        return monsters;
    }

    
}

