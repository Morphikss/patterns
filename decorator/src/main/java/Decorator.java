public class Decorator {
    public static void main(String[] args) {
        Monster giantOgr = new GiantOgr((new Giant()));
        System.out.println(giantOgr.getDescription());

    }
}
