public abstract class Unit {
    private int attack;
    private int defense;
    private boolean fly;
    private boolean flyAttack;
    

    public int attackPoint(Unit u) {
        if (getFly()) {
            return attack;
        }
        if (getFlyAttack()) {
            return attack;
        }
        if (u.getFly()) {
            return 0;
        } else {
            return attack;
        }
    }
    public void damage(int n) {
        defense = defense - n;
        if (defense < 0) {
            defense = 0;
        }
    }

    // 여기다 method로 양쪽 둘다 대미지를 계산할수 있지 않을까???

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
    public boolean getFlyAttack() {
        return flyAttack;
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
    public void setFlyAttack(boolean flyAttack) {
        this.flyAttack = flyAttack;
    }
}
