package com.changyoun.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) throws IOException {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문자열 입력 : ");

        String[] str = br.readLine().toLowerCase().replaceAll("[^a-z]+", " ").split("\\s+");

        String[] answer = new String[str.length];
        int idx = 0;
        String maxStr = "";
        int maxCount = 0;

        label:
        for (int i = 0; i < str.length; i++) {
            for (int k = 0; k < idx; k++) {
                if(str[i].equals(answer[k])) continue label;
            }
            answer[idx++] = str[i];
            int count = 0;
            for (int j = i; j < str.length; j++) {
                if(str[i].equalsIgnoreCase(str[j])) {
                    count++;
                }
            }
            System.out.println(str[i] + ": " + count);
            if (count > maxCount) {
                maxStr = str[i];
                maxCount = count;
            }
        }

        System.out.println("가장 빈도 높은 단어 : " + maxStr + " (" + maxCount + " 번)");

    }
}
