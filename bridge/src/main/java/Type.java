public abstract class Type {
    protected Dough dough;
    protected Stock stock;

    public Type(Dough dou, Stock stock){
        this.dough = dou;
        this.stock = stock;
    }


    abstract public void chooseDough();

}
