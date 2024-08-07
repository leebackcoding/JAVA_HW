package com.ohgiraffers.level01.basic;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index;

    public ShapeManager() {
        this.index = 0;
    }

    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
        if (this.index < 10) {
            this.shapes[index++] = shape;
        } else {
            System.out.println("더 이상 추가할 수 없습니다.");
        }
    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        int idx = -1;
        for (int i = 0; i < this.index; i++) {
            if (this.shapes[i].equals(shape)) idx = i;
        }
        if (idx == -1) {
            System.out.println("제거하려는 shape 가 존재하지 않습니다.");
            return;
        }

        for (int i = idx; i < this.index; i++) {
            this.shapes[i] = this.shapes[i + 1];
        }

    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for (int i = 0; i < this.index; i++) {
            System.out.println("Shape : " + shapes[i].getClass().getSimpleName());
            System.out.println("Area : " + shapes[i].calculateArea());
            System.out.println("Perimeter : " + shapes[i].calculatePerimeter());
        }
    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double sum = 0;
        for (Shape shape : this.shapes) {
            sum += shape.calculateArea();
        }

        return sum;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double sum = 0;
        for (Shape shape : this.shapes) {
            sum += shape.calculatePerimeter();
        }

        return sum;
    }
}
