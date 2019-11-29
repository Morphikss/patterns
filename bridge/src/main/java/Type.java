public abstract class Type {
    protected Dough dough;

    public Type(Dough dou){
        this.dough = dou;
    }

    abstract public void chooseDough();
}
