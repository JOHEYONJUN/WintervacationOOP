import java.util.Scanner;

// import pkg1.StudentInfo;

class StudentInfo {
    int id;
    String name;
    int scoreKor;
    int scoreEng;
    int scoreMath;
    int sum;
    int seqNum;
    float avg;
    
    // 생성자 학번,이름
    StudentInfo(int avgA, String avgB) {
       id = avgA;
       name = avgB;
       seqNum = (GpaManager.count)+1;
    }
    
    // 성적 함수
    void scoreInput(int avgA, int avgB, int avgC) {
       scoreKor = avgA;
       scoreEng = avgB;
       scoreMath = avgC;
       
       sum = getSum();
       avg = getAvg();
    }
    
    // 출력 함수
    void show() {
       System.out.println("학번 : " + id + " 이름 : " + name + 
             " 국어 : " + scoreKor + " 영어 : " + scoreEng + " 수학 : " + scoreMath + 
             " 합 : " + sum + " 평균 : " + avg   + " 순서 번호 : " + seqNum);
    }
    
    // 합 구하기 함수
    int getSum() {
       return scoreKor + scoreEng + scoreMath;
    }
    // 평균 구하기 함수
    float getAvg() {
       return getSum() / 3.0f;
    }
 }
 
 // 매니저 클래스
 class GpaManager {
    static int count; // 카운트
    float allAvg; // 전체 평균
    float sumAllAvg;
    Scanner scn = new Scanner(System.in);
    StudentInfo stdList[] = new StudentInfo[10]; 
    
    void run() {
       
       while(true) {
          
          printMenu();
          
          int start = scn.nextInt();
          
          if(start == 1) {
             inputScore();
          }
          else if(start == 2) {
             for (int i = 0; i < count; i++) {
                stdList[i].show();
             }
          }
          else if(start == 3) {
             System.out.println("프로그램 종료");
             break;
          }
       }
       
    }
    
    // 값 입력받기
    void inputScore() {
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
       
       // 학생 정보 클래스에 값 넘기기
       StudentInfo stuinfo = new StudentInfo(id, name);
       stuinfo.scoreInput(scoreKor, scoreEng, scoreMath);
       
       // 배열에 주소값 넣기
       stdList[count] = stuinfo;
       count ++;
       
       sumAllAvg += stuinfo.avg;
       allAvg = sumAllAvg / count;
    }
    
    // 출력 함수
    void printMenu() {
       System.out.println("==============");
       System.out.println("1. 학생 성적 입력");
       System.out.println("2. 학생 목록 출력(입력 순)");
       System.out.println("3. 프로그램 종료");
       System.out.println();
       System.out.println("현 입력 데이터 개수 : " + count);
       System.out.println("전체 학생 평균 값 : " + allAvg);
       System.out.println("==============");
    }
 }
 
 public class mo {
 
    public static void main(String[] args) {
       
       new GpaManager().run();
       
    }
 }