

public class main {

    
    public static void main(String[] args) { 
       Monster monster = new Monster.Builder()
               .setHp(5)
               .setArmor(5)
               .setIsAgressive(true)
               .setMana(5)
               .build();
   
       System.out.println(monster.getHp());
       
       Monster monster1 = new Monster.Builder()
               .setHp(10)
               .setArmor(10)
               .setIsAgressive(false)
               .setMana(10)
               .build();
       
       Monsters monsters = Monsters.getInstance();
       monsters.addMonster(monster);
       monsters.addMonster(monster1);
       
       System.out.println(monsters.getMonsters());

    }
    
}
