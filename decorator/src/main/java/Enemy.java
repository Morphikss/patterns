public class Enemy {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void DealDamage(int damage) {
        this.health -= damage;
    }

    public int Health() {
        return health;
    }
}
