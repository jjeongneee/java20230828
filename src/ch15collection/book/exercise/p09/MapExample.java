package ch15collection.book.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        int sum = 0;
        int max = 0;
        String id = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
            if (max < entry.getValue()) {
                max = entry.getValue();
                id = entry.getKey();
            }
        }


        System.out.println("sum = " + sum);
        System.out.println("avg = " + (sum / (double) map.size()));
        System.out.println("max = " + max);
        System.out.println("id = " + id);

//        String name = null;
//        int maxScore = 0;
//        int totalScore = 0;
//
//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        for(Map.Entry<String, Integer> entry : entrySet) {
//            if(entry.getValue()>maxScore) {
//                name = entry.getKey();
//                maxScore = entry.getValue();
//            }
//            totalScore += entry.getValue();
//        }
//        int avgScore = totalScore / map.size();
//        System.out.println("avgScore = " + avgScore);
//
//        System.out.println("maxScore = " + maxScore);
//        System.out.println("name = " + name);
    }
}
