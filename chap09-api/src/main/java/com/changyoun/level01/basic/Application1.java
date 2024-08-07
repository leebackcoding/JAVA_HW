package com.changyoun.level01.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) throws Exception{
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        int count = s.length;
        for (String str : s) {
            sb.append(Character.toUpperCase(str.charAt(0))).append(str.substring(1)).append(" ");
        }

        System.out.println(sb.toString().trim());
        System.out.println();
        System.out.println("총 단어 개수 : " + count);

    }
}
