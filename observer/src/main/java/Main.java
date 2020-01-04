public class Main {
    public static void main(String[] args) {
        Enemy orcAdam = new Enemy(5);
        orcAdam.addObserver(new Notification("orcAdam"));
        Monster troll = new Troll();
        System.out.println(orcAdam.observerOneStatus().isShowTargetDead());
        troll.smash(orcAdam);
        System.out.println(orcAdam.observerOneStatus().isShowTargetDead());
    }
}
