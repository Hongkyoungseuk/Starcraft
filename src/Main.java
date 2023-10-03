import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("종족을 선택해 주세요 (T/Z/P) : ");
        Scanner scanner = new Scanner(System.in);
        String myTeam = scanner.next();


        if (myTeam.equals("T")) {
            Terran TeamA = new Terran();
        } else if (myTeam.equals("Z")) {
            Zerg TeamA = new Zerg();
        } else if (myTeam.equals("P")) {
            Protos TeamA = new Protos();
        } else {

        }

        
            
        



    }

    // TODO 대결 매서드(유닛list,유닛list)
    // 유닛 랜덤으로 매칭
    // 두 유닛 싸우기 : 새로 매서드 만들어도 좋을듯
    // 유닛 싸운후 삭제

}
