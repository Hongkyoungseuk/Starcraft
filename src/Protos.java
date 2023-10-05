
public class Protos extends Tribe {
    Protos() {

        for (int i = 0 ; i < 4 ; i++) {

            int a = (int)(5 * Math.random());
            while (a >= 5) {
                a = (int)(5 * Math.random());
            }
            
            switch(a) {
                case 0 :
                addUnit(new Zergling());
                break;
                case 1 :
                addUnit(new Hydralisk());
                break;
                case 2 :
                addUnit(new Ultralisk());
                break;
                case 3 :
                addUnit(new Mutalisk());
                break;
                case 4 :
                addUnit(new Guardian());
                break;
            }
        }
            
    }

}

