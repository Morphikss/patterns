

public class Monster{
    private int hp;
    private int mana;
    private int armor;
    private boolean isAggresive;

    private Monster(int hp, int mana, int armor, boolean isAggresive){
        this.hp = hp;
        this.mana = mana;
        this.isAggresive = isAggresive;
        this.armor = armor;
    }

    public int getHp(){
        return hp;
    }


    public static class Builder {
        private int hp;
        private int mana;
        private int armor;
        private boolean isAggresive;

        public Builder(){

        }

        public Builder setHp(int hp){
            this.hp = hp;
            return this;
        }
        public Builder setMana(int mana){
            this.mana = mana;
            return this;
        }
        public Builder setArmor(int armor){
            this.armor = armor;
            return this;
        }
        public Builder setIsAgressive(boolean isAggresive){
            this.isAggresive = isAggresive;
            return this;
        }

        public Monster build(){
            return new Monster(hp, mana, armor, isAggresive);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        } else if(!(obj.getClass() == this.getClass())) {
            return false;
        } else {
            Monster monsterObj = (Monster)obj;
            return monsterObj.hp == this.hp
                    && monsterObj.mana == this.mana
                    && monsterObj.armor == this.armor
                    && monsterObj.isAggresive == this.isAggresive;
        }
    }
}

