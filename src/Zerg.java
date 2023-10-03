import java.util.ArrayList;

public class Zerg extends Unit {

    ArrayList<Unit> group = new ArrayList<>(8);

    Zerg() {
        for (int i = 0 ; i < 8 ; i++) {

            int a = (int)(5 * Math.random());
            while (a >= 5) {
                a = (int)(5 * Math.random());
            }
            
            switch(a) {
                case 0 :
                group.add(new Zergling());
                case 1 :
                group.add(new Hydralisk());
                case 2 :
                group.add(new Ultralisk());
                case 3 :
                group.add(new Mutalisk());
                case 4 :
                group.add(new Guardian());
            }
        }
            
    }
}

