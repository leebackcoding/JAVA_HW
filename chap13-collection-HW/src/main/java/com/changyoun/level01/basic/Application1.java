package com.changyoun.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        String ans = "";
        do {

            try {
                System.out.print("학생 성적 : ");
                list.add(Integer.parseInt(br.readLine()));
                System.out.print("추가 입력하려면 y : ");
                ans = br.readLine();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }


        } while (ans.equalsIgnoreCase("y"));

        for (int score : list) {
            sum += score;
        }
        double avg = Math.round(((double) sum / list.size() * 10)) / 10.0;

        System.out.println("학생 인원 : " + list.size());
        System.out.printf("평균 점수 : %.1f%n", avg);
    }
}
