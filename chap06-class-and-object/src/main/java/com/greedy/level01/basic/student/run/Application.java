package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentDTO[] students = new StudentDTO[10];

        int cur = 0;
        do {

            System.out.print("학년 : ");
            int grade = sc.nextInt();

            System.out.print("반 : ");
            int classroom = sc.nextInt();

            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("국어점수 : ");
            int kor = sc.nextInt();

            System.out.print("영어점수 : ");
            int eng = sc.nextInt();

            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            students[cur++] = new StudentDTO(grade, classroom, name, kor, eng, math);

            System.out.print("계속 추가하실 겁니까? (y / n) : ");

        } while (sc.next().charAt(0) == 'y');

        for (int i = 0; i < students.length; i++) {
            if(students[i] == null) break;
            System.out.println(students[i].getInformation());
        }
    }
}
