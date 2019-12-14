public class ItalianType extends Type {

    public ItalianType(Dough dou, Stock stock){
        super(dou, stock);
    }
    @Override
    public void chooseDough() {
        System.out.println("Italian pizza made with dough: ");
        dough.chooseDough(stock);
    }
}
