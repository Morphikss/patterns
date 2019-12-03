public class Zombie implements Monster {
    int attackDamage;

    public Zombie(int attackDamage){
        this.attackDamage = attackDamage;
    }


    @Override
    public void smash(Player player) {
        System.out.println(player.getHp());
        int tmp = player.getHp() - this.attackDamage;
        System.out.println(tmp);
        player.setHp(tmp);
        if(player.getHp() == 0){
            System.out.println("Player is dead");
        }
    }
}
