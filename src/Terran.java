
public class Terran extends Tribe {
    Terran() {
        
        for (int i = 0 ; i < 5 ; i++) {
            
            int a = (int)(5 * Math.random());
            while (a >= 5) {
                a = (int)(5 * Math.random());
            }
            
            switch(a) {
                case 0 :
                    addUnit(new Marine());
                    break;
                case 1 :
                    addUnit(new Tank());
                    break;
                case 2 :
                    addUnit(new Goliath());
                    break;
                case 3 :
                    addUnit(new Wraith());
                    break;
                case 4 :
                    addUnit(new Valkyrie());
                    break;
            }
        }
    }
}

