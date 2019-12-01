import org.junit.Test;


public class MonsterTest {
    @Test
    public void test3(){
        CloneFactory monsterMaker = new CloneFactory();
        Goblin goblin = new Goblin(5);

        Goblin clonedGoblin = (Goblin) monsterMaker.getClone(goblin);
        System.out.println(goblin);
        System.out.println(clonedGoblin);

        goblin.changeHealth(2);

        System.out.println("Goblin HashCode: " + System.identityHashCode(System.identityHashCode(goblin)));
        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedGoblin)));


        System.out.println(goblin.health());
        System.out.println(clonedGoblin.health());
    }
}