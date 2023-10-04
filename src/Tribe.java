import java.util.ArrayList;

public abstract class Tribe {
    private String name ;
    private ArrayList<Unit> group = new ArrayList<>();

    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public ArrayList<Unit> getGroup() {
        return group;
    }
    public void addUnit(Unit u) {
        group.add(u);
    }
}
