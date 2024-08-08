package com.changyoun.level01.basic;

import com.changyoun.level01.basic.exception.DivideZeroEx;
import com.changyoun.level01.basic.exception.NotIntEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 2
         *
         * ----- 출력 예시 -----
         *
         * 결과 : 5
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 십
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 유효한 정수를 입력하세요.
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 0
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 0으로 나누는 것은 허용되지 않습니다.
         * 실행이 완료되었습니다.
         */
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("분자 입력 : ");
            int top = isNumber(sc);


            System.out.print("분모 입력 : ");
            int bottom = isNumber(sc);
            if (bottom == 0) {
                throw new DivideZeroEx("0으로 나누는 것은 허용되지 않습니다.");
            }

            System.out.println("결과 : " + top / bottom);
        } catch (DivideZeroEx | NotIntEx e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("실행이 완료되었습니다.");
        }


    }

    public static int isNumber(Scanner sc) throws NotIntEx {
        String str = sc.next();
        try {
            int num = Integer.parseInt(str);
            return num;
        } catch (NumberFormatException e) {
            throw new NotIntEx("유효한 정수를 입력하세요.");
        }
    }
}
