package ch14thread.lecture;

import javax.swing.*;

public class Ex13_5 {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력해");
        System.out.println("입력값"+input+"입니다");
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {}
        }
    }
}
