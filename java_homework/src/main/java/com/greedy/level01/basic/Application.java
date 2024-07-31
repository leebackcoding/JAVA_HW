package com.greedy.level01.basic;

public class Application {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 5;

        Calculator calculator = new Calculator();
        calculator.checkMethod();
        System.out.println("1부터 10까지의 합 : " + calculator.sum1to10());
        calculator.checkMaxNumber(num1, num2);
        System.out.println(num1 + "과 " + num2 + "의 합은 : " + calculator.sumTwoNumber(num1, num2));
        System.out.println(num1 + "과 " + num3 + "의 차는 " + calculator.minusTwoNumber(num1, num2));
    }
}
