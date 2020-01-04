public class Monster {
    int attackDamage;
    public moveType movingType;


    public String toMove() {
        return movingType.move();

    }

    public void setFlyingAbility(moveType newMoveType){
        movingType = newMoveType;

    }

    public void setWalkingAbility(moveType newMoveType){
        movingType = newMoveType;

    }
}