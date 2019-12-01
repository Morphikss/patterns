import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class PrototypeTest {
    @Test
    public void test1(){
        CloneFactory monsterMaker = new CloneFactory();
        Goblin goblin = new Goblin(5);

        Goblin clonedGoblin = (Goblin) monsterMaker.getClone(goblin);
        assertNotEquals(goblin, clonedGoblin);

        goblin.changeHealth(2);
        assertNotEquals(goblin.health(), clonedGoblin.health());
        assertNotEquals(System.identityHashCode(goblin), System.identityHashCode(clonedGoblin));
    }
}
