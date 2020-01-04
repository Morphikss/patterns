public class Notification implements Observer{
    private boolean showTargetDead = false;
    private String name;

    public Notification(String name){
        this.name = name;
    }

    @Override
    public void notifyObject(){
        showTargetDead = true;
        System.out.println("Dead target name: " + name);
    }

    public boolean isShowTargetDead() {
        return showTargetDead;
    }
}
