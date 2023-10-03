import java.util.ArrayList;

public class Terran {
    private String name = "Terran";
    private ArrayList<Unit> group = new ArrayList<>();

    Terran() {
        for (int i = 0 ; i < 5 ; i++) {

            int a = (int)(5 * Math.random());
            while (a >= 5) {
                a = (int)(5 * Math.random());
            }
            
            switch(a) {
                case 0 :
                group.add(new Marine());
                case 1 :
                group.add(new Tank());
                case 2 :
                group.add(new Goliath());
                case 3 :
                group.add(new Wraith());
                case 4 :
                group.add(new Valkyrie());
            }
        }
            
    }
    
    public String getName() {
        return name;
    }
    public ArrayList<Unit> getGroup() {
        return group;
    }
    public Unit getGroup(int i) {
        return group.remove(i);
    }
}

