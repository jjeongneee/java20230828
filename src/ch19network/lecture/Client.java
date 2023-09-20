package ch19network.lecture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            // 클라이언트 소켓 생성 및 서버에 연결
            Socket socket = new Socket("172.30.1.81", 7000);

            // 입력 스트림 및 출력 스트림 생성
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter outputWriter = new PrintWriter(socket.getOutputStream(), true);

            // 사용자 입력을 받아 서버로 전송
            while (true) {
                System.out.print("메시지 입력: ");
                String message = inputReader.readLine();
                outputWriter.println(message);
                if (message.equals("bye")) {
                    break;
                }
            }

            // 소켓 및 스트림 닫기
            inputReader.close();
            outputWriter.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
