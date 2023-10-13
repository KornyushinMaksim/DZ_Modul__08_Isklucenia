package org.example.task3_triangle.triangle;

import org.example.task3_triangle.exceptions.MyExceptions;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        if(sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideB + sideA ) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            throw new MyExceptions("Треугольник нельзя построить");
        }
    }

    @Override
    public String toString() {
        return "Triangle" +
                "\nsideA = " + sideA +
                "\nsideB = " + sideB +
                "\nsideC = " + sideC;
    }
}
