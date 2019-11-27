public class main {


    public static void main(String[] args) {
        Monster monster = new Monster.Builder()
                .setHp(5)
                .setArmor(5)
                .setIsAgressive(true)
                .setMana(5)
                .build();

        System.out.println(monster.getHp());

    }

}
