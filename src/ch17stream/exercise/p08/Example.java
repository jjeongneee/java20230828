package ch17stream.exercise.p08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );


        // 내 풀이
        System.out.println("[개발자]");
        List<Member> job = list.stream()
                .filter(s -> s.getJob().equals("개발자"))
                .collect(Collectors.toList());
        System.out.println("job = " + job);

        // 선생님 풀이
        list.stream()
                        .filter(m->m.getJob().equals("개발자"))
                                .forEach(System.out::println);

        System.out.println("[디자이너]");
        List<Member> job2 = list.stream()
                .filter(s -> s.getJob().equals("디자이너"))
                .collect(Collectors.toList());
        System.out.println("job2 = " + job2);

        // 선생님 코드
        Map<String, List<Member>> map = list.stream()
                .collect(Collectors.groupingBy(m -> m.getJob()));

        System.out.println("[개발자]");
        map.get("개발자").forEach(System.out::println);
        System.out.println();

        System.out.println("[디자이너]");
        map.get("디자이너").forEach(System.out::println);



    }
}
