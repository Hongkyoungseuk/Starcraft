import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tribe teamA;
        Tribe teamB;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("팀을 고르시오. (T/Z/P) : ");
        String teamAname = sc.next();
        while(true) {
            if (teamAname.equals("T")) {
                teamA = new Terran();
                break;
            } else if (teamAname.equals("Z")) {
                teamA = new Zerg();
                break;
            } else if (teamAname.equals("P")) {
                teamA = new Protos();
                break;
            } else {
                System.out.print("다시 입력하세요. (T/Z/P) : ");
                teamAname = sc.next();
            }
        }
        
        int teamBnumber = (int)(3 * Math.random());
        switch(teamBnumber) {
            case 0 :
            teamB = new Terran();
            break;
            case 1 :
            teamB = new Zerg();
            break;
            case 2 :
            teamB = new Protos();
            break;
            default :   // Why? 이친구는 없으면 teamB가 생성이 안된걸로 인식이 되는거지??
            teamB = new Terran();
        }

        while(true) {
            mapString(teamA, teamB);
            myAttackUnit(teamA, teamB);
            if (teamA.getGroup().size() == 0 && teamB.getGroup().size() == 0){
                System.out.println("무승부 하였습니다.");
                break;
            } else if (teamA.getGroup().size() == 0) {
                System.out.println("패배 하였습니다.");
                break;
            } else if (teamB.getGroup().size() == 0) {
                System.out.println("승리 했습니다.");
                break;
            } else {}

        }
        System.out.println("Game Over");
    }
    
    
    public static void vs(Unit a, Unit b) {
        b.damage(a.attackPoint(b));
        a.damage(b.attackPoint(a));
    }

    public static void mapString(Tribe a, Tribe b) {
        System.out.println("적군: " + b.getName());
        for(int i = 0 ; i < b.getGroup().size() ; i++) {
            System.out.println(i + ". " + b.getGroup().get(i).getClass().getName() + " (현재방어력: " + b.getGroup().get(i).getDefense() + ")");
        }
        System.out.println("아군: " + a.getName());
        for(int i = 0 ; i < a.getGroup().size() ; i++) {
            System.out.println(i + ". " + a.getGroup().get(i).getClass().getName() + " (현재방어력: " + a.getGroup().get(i).getDefense() + ")");
        }
    }

    public static void myAttackUnit(Tribe a, Tribe b) {
        System.out.print("유닛을 선택하세요 (int) : ");
        Scanner sc = new Scanner(System.in);
        int myIndex = sc.nextInt();
        while(myIndex < 0 || myIndex >= a.getGroup().size()){
            System.out.println("다시 입력하세요 (int) : ");
            myIndex = sc.nextInt();
        }
        Unit unitA = a.getGroup().get(myIndex);
        int enemyIndex = (int)(b.getGroup().size() * Math.random());
        Unit unitB = b.getGroup().get((int)(enemyIndex));
        
        System.out.println(myIndex + ". " + unitA.getClass().getName() + " VS " + enemyIndex + ". " + unitB.getClass().getName());
        vs(unitA, unitB);
        if (unitA.getDefense() == 0) {
            a.getGroup().remove(myIndex);
        }
        if (unitB.getDefense() == 0) {
            b.getGroup().remove(enemyIndex);
        }
    }

}
