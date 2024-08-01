package com.changyoun.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
         *
         * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
         * 지폐외 동전을 구분하여 단위를 표기하세요
         *
         * -- 입력 예시 --
         * 받으신 금액을 입력하세요 : 100000
         * 상품 가격을 입력하세요 : 22340
         *
         * -- 출력 예시 --
         * ============================
         * 50000원권 지폐 1장
         * 10000원권 지폐 2장
         * 5000원권 지폐 1장
         * 1000원권 지폐 2장
         * 500원권 동전 1개
         * 100원권 동전 1개
         * 50원권 동전 1개
         * 10원권 동전 1개
         * ============================
         * 거스름돈 : 77660원
         * */
        Scanner sc = new Scanner(System.in);

        System.out.print("받으신 금액을 입력하세요 : ");
        int get = sc.nextInt();

        System.out.print("상품 가격을 입력하세요 : ");
        int price = sc.nextInt();
        int give = get - price;

        int p50000 = give / 50000;
        give %= 50000;
        System.out.println("50000원권 지폐 " + p50000 + "장");


        int p10000 = give / 10000;
        give %= 10000;
        System.out.println("10000원권 지폐 " + p10000 + "장");


        int p5000 = give / 5000;
        give %= 5000;
        System.out.println("5000원권 지폐 " + p5000 + "장");


        int p1000 = give / 1000;
        give %= 1000;
        System.out.println("1000원권 지폐 " + p1000 + "장");


        int p500 = give / 500;
        give %= 500;
        System.out.println("500원권 지폐 " + p500 + "장");


        int p100 = give / 100;
        give %= 100;
        System.out.println("100원권 지폐 " + p100 + "장");


        int p50 = give / 50;
        give %= 50;
        System.out.println("50원권 지폐 " + p50 + "장");


        int p10 = give / 10;
        give %= 10;
        System.out.println("10원권 지폐 " + p10 + "장");


        System.out.println("거스름 돈 : " + give + "원");


    }
}
