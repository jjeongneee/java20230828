package ch11exception.lecture;

public class C24custom {
    public static void main(String[] args) {
        int money = 300;
        if(money<10000) {
            throw new LackOfMoneyException();
        }
    }
}
