package org.example.exercises;

import java.util.*;

public class Ex {
    private static List<Integer> nums = new ArrayList<>(List.of(1,1,2,3,4,5,1,2,3,4,5,6));
    private static List<String> words =  new ArrayList<>(List.of("one", "two", "two", "three", "three", "three"));
        public static List<Integer> ex1() {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        return result;
    }
    public static List<Integer> ex2() {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 1 && !result.contains(num)) {
                result.add(num);
            }
        }
        Collections.sort(result);
        return result;
    }
    public static Set<String> ex3() {
        return new HashSet<>(words);
    }
    public static Collection<Integer> ex4() {
        HashMap<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
                continue;
            }
            result.put(word, 1);
        }
        return result.values();
    }
}
