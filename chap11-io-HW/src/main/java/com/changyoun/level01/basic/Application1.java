package com.changyoun.level01.basic;

import com.changyoun.level01.basic.exceptions.NoFileNameEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * (존재하는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : hello.txt
         *
         * ----- 출력 예시 -----
         *
         * ===== 파일 내용 출력 =====
         * 안녕하세요. 반갑습니다. 제 이름은 홍길동입니다.
         *
         * ----- 입력 예시 -----
         *
         * (존재하지 않는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : unknown.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 해당 이름을 가진 파일이 없습니다.
         *
         */

        Scanner sc = new Scanner(System.in);
        String fileName = "";
        FileReader fr = null;
        try {
            System.out.print("파일 이름을 입력하세요 : ");
            fileName = sc.next();
            try {
                fr = new FileReader(fileName);
            } catch (FileNotFoundException e) {
                throw new NoFileNameEx("오류 : 해당 이름을 가진 파일이 없습니다.");
            }
            int value;
            while ((value = fr.read()) != -1) {
                System.out.print((char) value);
            }

        } catch (NoFileNameEx e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
