package ch17stream.lecture;

import java.util.List;
import java.util.OptionalDouble;

public class C21reference {
    public static void main(String[] args) {
        List<String> list1 = List.of("java", "spring", "css");
        Integer length = list1.stream()
                .map(String::length)
                .reduce(Integer::sum)
                .get();

        System.out.println("length = " + length);

        // 참조타입 stream -> 기본타입 stream
        int sum = list1.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("sum = " + sum);

        // 평균 구하기
        OptionalDouble avg = list1.stream()
                .mapToDouble(String::length)
                .average();
        System.out.println("avg = " + avg);

    }
}
