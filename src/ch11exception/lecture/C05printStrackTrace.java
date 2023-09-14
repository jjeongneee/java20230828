package ch11exception.lecture;

public class C05printStrackTrace {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i = 0;
            int j = 3 / i;
            System.out.println("code2");
        } catch (ArithmeticException e) {
            // catch 블록에 아무것도 안쓰면 나중에 코드 수정하기 힘듦
            // e.printStackTrace(); 사용해서 흔적을 남겨라
            e.printStackTrace();
        }
        System.out.println("code3");
    }
}

