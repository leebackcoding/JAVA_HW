package com.ohgiraffers.level01.basic;

import java.util.Objects;

public abstract class Shape implements Resizable{

    public double radius;

    /* 넓이 계산 메소드 */
    abstract double calculateArea();
    /* 둘레 계산 메소드 */
    abstract double calculatePerimeter();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Double.compare(radius, shape.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }
}

