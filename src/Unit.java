public class Unit {
    private int attack;
    private int defense;
    private boolean fly;


    public void damage(int n) {
        defense = defense - n;
    }

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
