package com.ljs.study.programers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Programmers: https://programmers.co.kr/learn/courses/30/lessons/81301
 * Descriptions:
 *   - 문자열 or 숫자 입력받아서 숫자로 변경하는 프로그램
 * In/Out
 *   - one4seveneight -> 1478
 *   - 23four5six7 -> 234567
 *   - 2three45sixseven -> 234567
 *   - 123 -> 123
 */
public class Programmers01 {

    public static HashMap<String, String> map;

    public static void main(String args[]) {
        initMap();
        System.out.println(convert("one4seveneight"));
        System.out.println(convert("23four5six7"));
        System.out.println(convert("2three45sixseven"));
        System.out.println(convert("123"));
    }

    private static void initMap() {
        map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        map.put("0", "0");
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");
        map.put("7", "7");
        map.put("8", "8");
        map.put("9", "9");
    }

    public static String convert(String input) {
        String[] arr = input.split("");
        Queue<String> queue = new LinkedList<>(Arrays.asList(arr));

        String result = "";
        String key = "";
        while (!queue.isEmpty()) {
            key += queue.poll();
            if (map.containsKey(key)) {
                result += map.get(key);
                key = "";
            }
        }

        return result;
    }

}
