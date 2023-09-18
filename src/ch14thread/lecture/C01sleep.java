package ch14thread.lecture;

public class C01sleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("code1");
        Thread.sleep(1000); // 1초 동안 스레드를 일시 중지
        System.out.println("code2");
        Thread.sleep(1000);
        System.out.println("code3");
    }
}
