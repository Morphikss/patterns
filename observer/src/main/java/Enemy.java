import java.util.ArrayList;

public class Enemy {
    protected ArrayList< Observer > observers = new ArrayList<>();
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void DealDamage(int damage) {
        this.health -= damage;
        if(this.health <= 0){
            notifyAllObject();
        }
    }

    public void addObserver(Observer observer){

        if (observer != null){
            observers.add(observer);
        }
    }


    public void notifyAllObject(){
        for (Observer observer : observers){
            if (observer instanceof Observer){
                observer.notifyObject();
            }
        }
    }

    public Notification observerOneStatus(){
        return (Notification)observers.get(0);
    }

    public int Health() {
        return health;
    }
}

