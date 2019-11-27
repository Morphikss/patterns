import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class MonstersTest {

    @Test
    public void test1() {
        Monster monster = new Monster.Builder()
                .setHp(5)
                .setArmor(5)
                .setIsAgressive(true)
                .setMana(5)
                .build();

        Monster monster1 = new Monster.Builder()
                .setHp(10)
                .setArmor(10)
                .setIsAgressive(false)
                .setMana(10)
                .build();

        Monsters instance = Monsters.getInstance();
        List<Monster> monsters = new ArrayList<Monster>();

        instance.addMonster(monster);
        instance.addMonster(monster1);
        monsters.add(monster);
        monsters.add(monster1);

        assertTrue(monsters.equals(instance.getMonsters()));
    }

    @Test
    public void test2() {
        Monsters inst = Monsters.getInstance();
        assertTrue(inst.getMonsters() instanceof ArrayList);
    }
}