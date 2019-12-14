public class AmericanType extends Type {
    public AmericanType(Dough dou, Stock stock){
        super(dou, stock);
    }
    @Override
    public void chooseDough() {
        System.out.println("American pizza made with dough: ");
        dough.chooseDough(stock);
    }
}
