public class Unit {
    private int attack;
    private int defense;



    public int 

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
    //set
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    
}
