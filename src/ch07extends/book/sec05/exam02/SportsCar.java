package ch07extends.book.sec05.exam02;

public class SportsCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }

    //오버라이딩 불가!
//    public void stop{}
}
