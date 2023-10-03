import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("종족을 선택해 주세요 (T/Z/P) : ");
        Scanner scanner = new Scanner(System.in);
        String myTeam = scanner.next();
        
        while(true) {
            if (myTeam.equals("T")) {
                Terran teamA = new Terran();
                break;
            } else if (myTeam.equals("Z")) {
                Zerg teamA = new Zerg();
                break;
            } else if (myTeam.equals("P")) {
                Protos teamA = new Protos();
                break;
            } else {
                System.out.println("다시 입력해 주세요. (T/Z/P)");
                myTeam = scanner.next();
            }
        }

        int teamNumber = (int) (3 * Math.random());

        if (teamNumber == 0){
            Terran teamB = new Terran();
        } else if (teamNumber == 1) {
            Zerg teamB = new Zerg();
        } else if (teamNumber == 2) {
            Protos teamB = new Protos();
        } else {}
        
        mapString();



    }

    public static void mapString() {
        System.out.println("적군 : " + teamB.getClass());
        for (int i = 0 ; i < teamB.getGroup())
        
    }
    // TODO 대결 매서드(유닛list,유닛list)
    // 유닛 랜덤으로 매칭
    // 두 유닛 싸우기 : 새로 매서드 만들어도 좋을듯
    // 유닛 싸운후 삭제

}
