public class ItalianType extends Type {

    public ItalianType(Dough dou){
        super(dou);
    }
    @Override
    public void chooseDough() {
        System.out.println("Italian pizza made with dough ");
        dough.chooseDough();
    }
}
