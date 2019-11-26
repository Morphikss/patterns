public class Prototype {
    public static void main(String[] args){
        CloneFactory monsterMaker = new CloneFactory();
        Goblin goblin = new Goblin();
        goblin.x = 2;
        Goblin clonedGoblin = (Goblin) monsterMaker.getClone(goblin);
        System.out.println(goblin);
        System.out.println(clonedGoblin);

        System.out.println("Goblin HashCode: " + System.identityHashCode(System.identityHashCode(goblin)));
        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedGoblin)));
        System.out.println(goblin.x);
        System.out.println(clonedGoblin.x);

    }
}
