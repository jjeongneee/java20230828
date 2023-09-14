package ch11exception.lecture;

public class C04try {
    public static void main(String[] args) {
        System.out.println("code1");
        System.out.println("code2");

        try{
            int i = 3;
            int j = 3 / i; // exception 발생
            System.out.println("code3"); // 출력 안됨 (int = 0 일때)
            System.out.println("code4");
        } catch (ArithmeticException e) { // exception 발생 시 실행 코드
            System.out.println("exception code1");
            System.out.println("exception code2");
        }
        System.out.println("code5");
    }
}
