import java.util.ArrayList;

public abstract class Tribe {
    private ArrayList<Unit> group = new ArrayList<>();

    public ArrayList<Unit> getGroup() {
        return group;
    }
    public void addUnit(Unit u) {
        group.add(u);
    }
}
