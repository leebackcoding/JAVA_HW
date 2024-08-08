package com.changyoun.level01.basic;

import com.changyoun.level01.basic.exception.Not20Ex;
import com.changyoun.level01.basic.exception.WrongDateFormatEx;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
         *
         * ----- 출력 예시 -----
         *
         * 만 20세 미만은 입장 불가입니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
         *
         * ----- 출력 예시 -----
         *
         * 입장하셔도 됩니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
         *
         * ----- 출력 예시 -----
         *
         * 날짜 양식을 잘못 입력하셨습니다.
         */
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            String date = sc.nextLine();
            LocalDate localDate = null;
            try {
                localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            } catch (DateTimeParseException e) {
                throw new WrongDateFormatEx("날짜 양식을 잘못 입력하셨습니다.");
            }


            LocalDate now = LocalDate.now();
            LocalDate age = localDate.plusYears(20);
            if (now.isBefore(age)) throw new Not20Ex("만 20세 미만은 입장 불가입니다.");
            System.out.println("입장하셔도 됩니다.");

        } catch (WrongDateFormatEx e) {
            System.out.println(e.getMessage());
        } catch (Not20Ex e) {
            System.out.println(e.getMessage());
        }



    }
}
