package com.ljs.study.programers;

/**
 * Programmers: https://programmers.co.kr/learn/courses/30/lessons/12916
 * Descriptions:
 *   - 문자열내 p와 y의 갯수가 같으면 true, 다르면 false (대소문자 구분 없음)
 * In/Out
 *   - pPoooyY -> true
 *   - Pyy -> false
 */
public class Programmers02 {

    public static void main(String args[]) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }

    public static boolean solution(String input) {
        int cnt = 0;

        for (char c : input.toUpperCase().toCharArray()) {
            if (c == 'P') cnt++;
            else if (c == 'Y') cnt--;
        }

        return cnt == 0;
    }
}
