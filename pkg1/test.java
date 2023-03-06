package pkg1;
import java.util.Scanner;

class StudentInfo {
    // stdlist = new [studentinfoNUM_OFSU](10)
    int id; // 입력
    int seqNum; 
    String name; // 입력
    int scoreKor; // 입력
    int scoreEng; // 입력
    int scoreMath; // 입력
    int sum;
    float avg;
    
    StudentInfo(int argA, String argB) {
        id = argA;
        name = argB;
        seqNum = (text.count) + 1;
    }

    void ScoreInput(int argA, int argB, int argC) {
        scoreKor = argA;
        scoreEng = argB;
        scoreMath = argC;

        sum = GetSum();
        avg = GetAvg();
    }

    void show() {
        System.out.println("학번 : " + id + " 이름 : " + name + 
             " 국어 : " + scoreKor + " 영어 : " + scoreEng + " 수학 : " + scoreMath + 
             " 합 : " + sum + " 평균 : " + avg   + " 순서 번호 : " + seqNum);
    }

    // 합계 메서드
    int GetSum() {
        return scoreKor + scoreEng + scoreMath;
    }
    // 평균 메서드
    float GetAvg() {
        return sum / 3.0f;
    }

    
}
class text {
    float allAvg;
    float sumAllAvg;
    static int count;
    int selectNum;
    Scanner scn = new Scanner(System.in);
    StudentInfo stdList[] = new StudentInfo[10];

    void InputAlgorithm() {
        
        System.out.println("학번을 입력하세요");
        int id = scn.nextInt();
        System.out.println("이름을 입력하세요");
        String name = scn.next();
        System.out.println("국어 성적을 입력하세요");
        int scoreKor = scn.nextInt();
        System.out.println("영어 성적을 입력하세요");
        int scoreEng = scn.nextInt();
        System.out.println("수학 성적을 입력하세요");
        int scoreMath = scn.nextInt();
        // 학새 정보 클래스에 넘기기
        StudentInfo stdInfo = new StudentInfo(id, name);
        stdInfo.ScoreInput(scoreKor, scoreEng, scoreMath);
        // 배열에 주소값 넣기
        stdList[count] = stdInfo;
        count++;

        sumAllAvg += stdInfo.avg;
        allAvg = sumAllAvg / count;

    }

    void printMenu() {
        System.out.println("=======================");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 학생 목록 출력(입력 순)");
        System.out.println("3. 프로그램 종료");
        System.out.println("");
        System.out.println("현 입력 데이터 갯수 : " + count);
        System.out.println("전체 학생 평균 값 : " + allAvg);
        System.out.println("=======================");
    }

    void run() {
        while(true) {
            printMenu();

            selectNum = scn.nextInt();

            if(selectNum == 1) {
                InputAlgorithm();
            }
            else if(selectNum == 2) {
                for (int i = 0; i < count; i++){
                    stdList[i].show();
                }
            }
            else if(selectNum == 3) {
                System.out.println("프로그램 종료");
                break;
            }
        }
        
        

    }
}
public class test {
    public static void main(String[] args) {
        
        new text().run();
        
    }
}
