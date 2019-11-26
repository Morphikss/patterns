public abstract class MonsterDecorator implements Monster{
    protected Monster monster;

    public MonsterDecorator(Monster monster){
        this.monster = monster;
    }

    public String getDescription(){
        return monster.getDescription();
    }
}
