package com.changyoun.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Application5 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while (true) {
            String action = "";
            try {
                System.out.print("단어 입력 ('exit' 입력 시 종료): ");
                action = br.readLine();
                if (action.equals("exit")) break;
                list.add(action);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        list.sort(String::compareTo);

        System.out.println("정렬 된 단어 : " + list);
    }
}
