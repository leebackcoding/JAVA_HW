package com.ohgiraffers.level01.basic;

public class Circle extends Shape {


    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


    @Override
    public void resize(double factor) {

    }
}
