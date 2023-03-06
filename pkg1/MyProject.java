package pkg1;
import java.util.Scanner;

// // class Scv {

// //     String name;
// //     int hp;

// //     // default constructor
    
    
// // }
// // public class MyProject {    
// //     public static void main(String[] args) {
// //         Scv s1 = new Scv();
// //     }
// // }

// // Overloading(오버로딩) : 구조적 언어에서 시작 된 개념
// // 적용 대상 : 두개
// //  1. 생성자
// //  2. 매소드
// // 동일한 이름의 생성자 또는 메서드가 존재하고
// // 매개변수의 자료형과 개수에 따라 적합한 생성자/메서드를 호출하는 방법
// // 어떤 자료형이 들어오더라도 그에 맞는 매소드가 호출된다.

// // class ErrorCode {
// //     static final int UNKNOWN_ERROR = 1;
// // }
// // class Bar {
    
// //     static int doSomething() {
// //         if(3 > 2)
// //             return ErrorCode.UNKNOWN_ERROR;

// //         return 0;
// //     }
// // }
// // class StdInfo {

// // }

// // class Foo {
// //     int x = 3;
// // }


// // class Bar {
// //     static void doSomething(Foo argrefrence) {
// //         argrefrence.x = 10;
// //     }
// // }
// // class Foo {
// //     int x = 3;
// // }
// // public class MyProject {
// //     public static void main(String[] args) {

// //         Foo f1 = new Foo();

// //         Bar.doSomething(f1);

// //         System.out.println(f1.x);
// //     }
// // }

// // class Bar {

// //     static int[] arr = new int[10]; // 명시적 초기화

// //     {
// //         System.out.println("인스턴스 초기화 블록 호출");
// //     }

// //     static {
// //         for (int i = 0; i < 10; i++) {
// //             arr[i] = (int)(Math.random()*10) + 1; // 복잡한 초기화
// //         }
// //         for (int j = 0; j < 10; j++) {
// //             System.out.print(arr[j] + " ");
// //         }
// //         System.out.println();
// //     }

// //     Bar() {
// //         System.out.println("생성자 호출"); // 英語の文法を学ぶこと。YBMで基礎を築くこと。AWSの資格を取ること。
// //     }

// // }
// // public class MyProject {
// //     public static void main(String[] args) {
// //         Bar b1 = new Bar();
        
// //     }
// // }


// // class Bar {
// //     static int x = 3;
    
// //     static{
// //         System.out.println("클래스 초기화 블록");
// //     }

// //    {
// //     System.out.println("인스턴스 초기화블럭");
// //    }
// //    Bar() {
// //     System.out.println("생성자 초기화");
// //    }

// // }

// // public class MyProject {
// //     public static void main(String[] args) {
// //         Bar b1 = new Bar(); 
// //     }
// // }
// // public class MyProject {
// //     public static void main(String[] args) {
        
// //     }
// // }

// // class a {
// //     int a;
// // }

// // class b extends a {
// //     int b;
// // }

// // class c extends b {
// //     int c;
// // }

// // public class MyProject {
// //     public static void main(String[] args) {
        

// //     }
// // }

// // class Player {

// // }

// // class Center extends Player {

// // }

// // class Forward extends Player {

// // }

// // class SF extends Forward {

// // }

// // class PF extends Forward {

// // }

// // class Guard extends Player {

// // }

// // class PG extends Guard {

// // }

// // class FG extends Guard {

// // }

// // class Terran {}

// // class Scv extends Terran {}

// // class Marine extends Terran {}

// // class Tank extends Terran {}    

// // public class MyProject {
// //     public static void main(String[] args) {
        
// //         Terran unitList[] = new Terran[200];

// //         unitList[0] = new Scv();
// //         unitList[0] = new Marine();
// //         unitList[0] = new Tank();
// //     }
// // }

// // class A {
// //     int x = 3;

// //     void prtX() {
// //         System.out.println(x);
// //     }
// // }

// // class B extends A {
// //     int x = 4;
// //     int y = 5;
// // }

// // public class MyProject {
// //     public static void main(String[] args) {
// //         A obj = new B();
// //         System.out.println(obj.x);
// //         System.out.println( ((B)obj).y );
// //     }
// // }

// class Terran { int hp; }

// class Scv extends Terran { int mineral;}

// class Marine extends Terran { boolean sPack; }

// class Tank extends Terran { boolean sMode; }    

// public class MyProject {
//     static void prtStatusOfsMode(Terran argObj) {
//         if(argObj instanceof Scv) {
//             System.out.println(((Scv)argObj).mineral);
//         }
//         else if(argObj instanceof Marine) {
//             System.out.println(((Marine)argObj).sPack);
//         }
//         else if(argObj instanceof Tank) {
//             System.out.println(((Tank)argObj).sMode);
//         }
//     }
//     public static void main(String[] args) {
        
//         Scv o1 = new Scv();
//         Marine o2 = new Marine();
//         Tank o3 = new Tank();
//     }
// }



// 다형성
//  1) Visibility of a reference variable
//  2) Dynamic binding for an overriding method

// class A { 
//    int x = 3;
//    void prtX() {
//       System.out.println("prtX of A is invoked");
//    }
// }
// class B extends A { 
//    int x = 5; 
   
//    void prtX() {
//       super.prtX();
//       System.out.println("prtX of B is invoked");
//    }
// }


// public class MyProject {
//    public static void main(String[] args) {
//       new B().prtX();
//    }

// }


// class Terran {
//     void prtSMode() {
        
//     }
// }

// class Scv extends Terran {
//     int mineral = 20;
//     void prtSMode() {
//         System.out.println(mineral);
//     }
// }

// class Marine extends Terran {
//     boolean sPack = false;
//     void prtSMode() {
//         System.out.println(sPack);
//     }
// }

// class Tank extends Terran {
//     boolean sMode = false;
//     void prtSMode() {
//         System.out.println(sMode);
//     }
// }

// public class MyProject {
//     public static void main(String[] args) {
//         Terran unitList[] = new Terran[200];

//         unitList[0] = new Scv();
//         unitList[1] = new Marine();
//         unitList[2] = new Tank();

//         unitList[0].prtSMode();
//         unitList[1].prtSMode();
//         unitList[2].prtSMode();
//     }
// }


// abstract class c {
    
// }
// class Terran { int hp; }

// class Scv extends Terran { int mineral;}

// class Marine extends Terran { boolean sPack = true; }

// class Tank extends Terran { boolean sMode; }    


// class Run extends Terran{
//     static void prtStatusOfsMode(Terran argObj) {
//     if(argObj instanceof Scv) {
//         System.out.println(((Scv)argObj).mineral);
//     }
//     else if(argObj instanceof Marine) {
//         System.out.println(((Marine)argObj).sPack);
//     }
//     else if(argObj instanceof Tank) {
//         System.out.println(((Tank)argObj).sMode);
//     }
// }
// }


// public class MyProject {
//     public static void main(String[] args) {
//         Scv o1 = new Scv();
//         Marine o2 = new Marine();
//         Tank o3 = new Tank();

//         Run.prtStatusOfsMode(o2);
//     }
// }


// class A {
//     static { System.out.println("스태틱 초기화A"); }
//     { System.out.println("초기화A"); }
//     A() {System.out.println("생성자A");}
// }

// class B extends A {
//     static int x = 3;
//     static { System.out.println("스태틱 초기화B"); }
//     { System.out.println("초기화B"); }
//     B() {System.out.println("생성자B");}
// }

// class C extends B {
//     static int y = 3;
//     static { System.out.println("스태틱 초기화C"); }
//     { System.out.println("초기화C"); }
//     C() {System.out.println("생성자C");}
// }

// public class MyProject {
//     public static void main(String[] args) {
//         System.out.println(C.y);
//         System.out.println("=============");
//         new C();
//     }
// }

// class A {
//     A(int argA, int argB) {
//         super();
//         System.out.println("생성자A " + " argA : " + argA + " argB : " + argB);
//     }
// }
// class B extends A {
//     B(int argA) {
//         super(1, 2);
//         System.out.println("생성자B " + " argA : " + argA);
//     }
// }
// class C extends B {
//     C(int argA, int argB) {
//         super(2);
//         System.out.println("생성자C " + " argA : " + argA + " argB : " + argB);
//     }
// }

// public class MyProject {
//     public static void main(String[] args) {
//         new C(3, 4);
//     }
// }


// class Std {
//     int kor;
//     int eng;
//     int math;

//     Std(int arg_k, int arg_e, int arg_m) {
//         kor = arg_k;
//         eng = arg_e;
//         math = arg_m;
//     }
//     int sum() {
//         System.out.println("합계 : " + (kor + eng + math));
//         return kor + eng + math;
//     }
    
//     @Override
//     public String toString() {
//         // TODO Auto-generated method stub
//         return super.toString();
//     }

// }

// public class MyProject {
//     public static void main(String[] args) {
//         Std betty = new Std(100,90,50);
//         System.out.println("참조 변수의 주소 값 : " + betty);
//         betty.sum();
//     }
// }

// class B {
//     void prt() {
//         System.out.println("B");
//     }
// }
// class C extends B{
//     void prt() {
//         System.out.println("C");
//     }
// }
// class D extends C{
//     void prt() {
//         System.out.println("D");
//     }
// }


// public class MyProject {
//     public static void main(String[] args) {
//         D obj = new D();
        
//     }
// }

// abstract class Unit { // 추상 클래스
//     int x, y;
//     abstract void move(int x, int y);
//     void stop() { System.out.println("멈춥니다." ); }

// }

// interface Fightable { // 인터페이스
//     void move(int x, int y);  // public abstract가 생략됨
//     void attack(Fightable f); // public abstract가 생략됨
// }

// class Fighter extends Unit implements Fightable {
//     public void move(int x, int y) {    // 오버라이딩시 조상보다 접근제어자가 좁을 수 없기때문에 public을 써줘야한다.
//         System.out.println("[" + x + "," + y + "]로 이동");
//     }
//     public void attack(Fightable f) {
//         System.out.println(f + "를 공격");
//     }

//     Fightable getFighterable() {
//         Fightable f = (Fightable)new Fighter();
//         return f;
//     }
// }

// public class MyProject {
//     public static void main(String[] args) {
//         Fighter b = new Fighter();
//         Fightable f2 = b.getFighterable();
        
        
//     }
// }   


// interface A {
//     public abstract void prtx();
// }
// interface B extends A{
//     public abstract void prtx();
// }
// interface C extends A {
//     public abstract void prtx();
// }
// interface D extends B, C {
//     public abstract void prtx();
// }

// class Myfoo implements D {
//     public void prtx() {
//         System.out.println("prtx()");
//     }
// }

// public class MyProject {
//     public static void main(String[] args) {
//         Myfoo obj = new Myfoo();
//         obj.prtx();
        
//     }
// }

// class MyProject {
//     public static void main(String[] args) {
//         Car car = null;
//         FireEngine fe = new FireEngine();
//         FireEngine fe2 = null;

//         fe.water();
//         car = fe; // car = (Car)fe; 에서 형변환 생략됨
//         fe2 = (FireEngine)car; // 조상타입 -> 자손타입 형변환 필수
//         fe2.water();
//     }
// }

// class Car {
//     String color;
//     int door;

//     void drive() {
//         System.out.println("drive, brrr");
//     }

//     void stop() {
//         System.out.println("stop!");
//     }
// }

// class FireEngine extends Car {
    
//     void water() {
//         System.out.println("물 발사");
//     }
// }

// public class MyProject {
//     public static void main(String[] args) {
//         int base = 0;
//         int height = 0;

//         float area = 0.0f;

//         Scanner scn = new Scanner(System.in);

        

//         height = scn.nextInt();

//         area = base * height / 2;
//         System.out.println(area);
//     }
// }

// public class MyProject {

//     public static int getPositiveNum() throws Exception {
//         Scanner scn = new Scanner(System.in);
        
//         int base = scn.nextInt();
        
//         if(base <= 0)
//             throw new Exception("0이하 값");
        
//             return base;
//         }
        
//     public static void main(String[] args) {
//         int base = 0;
//         int height = 0;
//         float area = 0.0f;

        

//         try {
//             try {
//                 base = MyProject.getPositiveNum();

//                 height = MyProject.getPositiveNum();
//             }
//         } catch (Exception e) {
//             System.out.println("예외발생, MSG : " + e.getMessage());
//         }
//     }
// }

// public class MyProject {
//     public static void main(String[] args) {
//         int base = 0;
//         int height = 0;
//         float area = 0.0f;

//         Scanner scn = new Scanner(System.in);

//         try {
//             base = scn.nextInt();

//             if(base <= 0)
//                 throw new Exception("밑변 0 이하");
                
//             height = scn.nextInt();

//             if(height <= 0)
//                 throw new Exception("높이 0 이하");
//         } catch (Exception e) {
//             System.out.println("예외발생, MSG : " + e.getMessage());
//         }
//     }
// }

// public class MyProject {
//     public static void main(String[] args) {
//         int base = 0;
//         int height = 0;

//         float area = 0.0f;

//         Scanner scn = new Scanner(System.in);

//         while (true) {
//             base = scn.nextInt();

//             if (base <= 0) {
//                 System.out.println("0이상 값을 입력하세요");
//             }
//             else {
//                 break;
//             }
//         }

//         height = scn.nextInt();

//         area = base * height / 2;
//         System.out.println(area);
//     }
// }

// public class MyProject {
//     public static void main(String[] args) {
//         int base = 0;
//         int height = 0;
//         float area = 0.0f;

//         Scanner scn = new Scanner(System.in);

//         try {
//             base = scn.nextInt();

//             if(base <= 0)
//                 throw new Exception("밑변 0 이하");
                
//             height = scn.nextInt();

//             if(height <= 0)
//             throw new Exception("높이 0 이하");
//         } catch (Exception e) {
//             System.out.println("예외발생, MSG : " + e.getMessage());
//         }

       
//     }
// }
// public class MyProject {
//     private   int prv; // 같은 클래스
//               int dft; // 같은 패키지
//     protected int prt; // 같은 패키지 + 자손(다른 패키지)
//     public    int pub; // 접근제한 없음.

//     public void printMembers() {
//         System.out.println(prv);
//         System.out.println(dft);
//         System.out.println(prt);
//         System.out.println(pub);
//     }
// }

// public class MyProject {
//     private   int prv; // 같은 클래스
//               int dft; // 같은 패키지
//     protected int prt; // 같은 패키지 + 자손(다른 패키지)
//     public    int pub; // 접근제한 없음.
//     public static void main(String[] args) {
//         MyProject p = new MyProject();
//         System.out.println(p.prv);
//         System.out.println(p.dft);
//         System.out.println(p.prt);
//         System.out.println(p.pub);
        
//     }
// }


public class MyProject {
    public static void main(String[] args) {
        System.out.println("ごめんなさい");
    }
}