package com.changyoun.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Application4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> studentNames = new HashSet<>();

        while (true) {
            String name = "";
            try {
                System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
                name = br.readLine();
                if (name.equals("exit")) break;
                if (studentNames.contains(name))
                    System.out.println("이미 등록 된 ID입니다.");
                else {
                    studentNames.add(name);
                    System.out.println("ID가 추가 되었습니다.");
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("모든 학생의 ID : " + studentNames);
    }
}
