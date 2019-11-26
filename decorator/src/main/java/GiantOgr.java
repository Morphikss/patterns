public class GiantOgr extends MonsterDecorator {

    public GiantOgr(Monster monster) {
        super(monster);
    }
    public String getDescription(){
        return monster.getDescription() + "Ogr";
    }
}
