package ch11exception.lecture;

public class C09catch {
    public static void main(String[] args) {

        try {
            int[] arr = {1, 0};
            int i = 3 / arr[2];

            System.out.println("try내의 흐름");
            // try block 에서
            // 여러 exception이 발생할 수 있으면
            // 여러 catch 블럭을 작성하면 됨
        } catch (ArithmeticException e) {
            System.out.println("잘못된 산술연산이지롱");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("잘못된 인덱스 참조~~~~~~");
        }

        System.out.println("실행 흐름 이어감...");
    }
}
