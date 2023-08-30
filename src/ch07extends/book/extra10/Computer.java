package ch07extends.book.extra10;

public class Computer extends Machine{
//    @Override
//    public void powerOn() {
//        super.powerOn();
//    }
//
//    @Override
//    public void powerOff() {
//        super.powerOff();
//    }

    @Override
    public void work() {
        System.out.println("컴퓨터...");
    }
}
