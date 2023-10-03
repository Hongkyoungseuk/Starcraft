import java.util.ArrayList;

public class Protos extends Unit {

    ArrayList<Unit> group = new ArrayList<>(4);

    Protos() {
        for (int i = 0 ; i < 4 ; i++) {

            int a = (int)(5 * Math.random());
            while (a >= 5) {
                a = (int)(5 * Math.random());
            }
            
            switch(a) {
                case 0 :
                group.add(new Zealot());
                case 1 :
                group.add(new Dragoon());
                case 2 :
                group.add(new HighTempler());
                case 3 :
                group.add(new Scout());
                case 4 :
                group.add(new Corsair());
            }
        }
            
    }
}

