public class Unit {
    private int attack;
    private int defense;
    private boolean fly;


    public int attackPoint(Unit u) {    // u 에게 공격시 들어가는 데미지
        if (u.getFly()) {
            return 0;
        } else {
            return attack;
        }

    }
    public void damage(int n) {
        defense = defense - n;
    }

    // TODO 여기다 method로 양쪽 둘다 대미지를 계산할수 있지 않을까???

    //get
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public boolean getFly() {
        return fly;
    }
    
    //set
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public void setFly(boolean fly) {
        this.fly = fly;
    }
}
