package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03trywithresource {
    public void method1() {
        OutputStream os = null;
        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.close(); // io stream을 꼭 닫아야함
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method2() {

        // try-with-resource 문법
        // 변수의 타입은 AutoCloseable이어야 함
        try ( OutputStream os = new FileOutputStream("");){
            os.write(33);
            os.write(67);
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void method3() {
        try (
                FileOutputStream fos = new FileOutputStream("");
                FileInputStream fis = new FileInputStream("");
                ){
            fos.write(234);
            fis.read();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method4() {
        Scanner scanner = new Scanner("");
        try (scanner){
            scanner.hasNext();
            scanner.next();
        }
    }

    public void method5() {
        try {
            FileInputStream fio = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");

            try(fio;fos;) {
                fio.read();
                fos.write(33);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void method6() throws IOException {
        // 안좋은 코드임...
        // 예외처리 부족해 코드를 다 읽지 못하고 닫혀버릴수도 있음

        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");

        fos.write(33);
        fis.read();

        fos.close();
        fis.close();
    }
}
