package ch16lambda.book.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        action((x,y) -> {
            int result = x + y;
            System.out.println("result = " + result);
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println("result = " + result);
        });


//  위에와 동일한 식을 작성
//        action(new Calculable() {
//            @Override
//            public void calculate(int x, int y) {
//                int result = x + y;
//                System.out.println("result = " + result);
//            }
//        });
//
//        action(new Calculable() {
//            @Override
//            public void calculate(int x, int y) {
//                int result = x - y;
//                System.out.println("result = " + result);
//            }
//        });
    }

    public static void action(Calculable calculable) {
        // 데이터
        int x = 10;
        int y = 4;

        //데이터 처리
        calculable.calculate(x,y);
    }
}
