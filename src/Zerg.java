
public class Zerg extends Tribe {
    Zerg() {
        setName(getClass().getName());
        
        for (int i = 0 ; i < 8 ; i++) {
            
            int a = (int)(5 * Math.random());
            while (a >= 5) {
                a = (int)(5 * Math.random());
            }
            
            switch(a) {
                case 0 :
                addUnit(new Zealot());
                break;
                case 1 :
                addUnit(new Dragoon());
                break;
                case 2 :
                addUnit(new HighTempler());
                break;
                case 3 :
                addUnit(new Scout());
                break;
                case 4 :
                addUnit(new Corsair());
                break;
            }
        }
    }
        
        
}

