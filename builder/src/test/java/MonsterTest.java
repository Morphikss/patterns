import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MonsterTest {
    @Test
    public void test() {
        Monster monster = new Monster.Builder()
                .setHp(5)
                .setArmor(5)
                .setIsAgressive(true)
                .setMana(5)
                .build();
        Monster monster1 = new Monster.Builder()
                .setHp(5)
                .setArmor(5)
                .setIsAgressive(true)
                .setMana(5)
                .build();

        assertTrue(monster.equals(monster1));
    }

}