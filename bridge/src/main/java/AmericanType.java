public class AmericanType extends Type {
    public AmericanType(Dough dou){
        super(dou);
    }
    @Override
    public void chooseDough() {
        System.out.println("American pizza made with dough ");
        dough.chooseDough();
    }
}
