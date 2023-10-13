//Задание 3
//        Создать класс, объекты которого будут неизменяемыми.
//        Класс инкапсулирует в себе информацию о треугольнике на плоскости
//        (длины каждой из его ребер). Длины сторон задаются в конструкторе.
//        Если по заданным сторонам нельзя построить треугольник,
//        в конструктор должно бросаться исключение.
//        Протестируйте класс с помощью JUnit-тестов.

package org.example.task3_triangle;

import org.example.task3_triangle.exceptions.MyExceptions;
import org.example.task3_triangle.triangle.Triangle;

public class Main {
    public static void main(String[] args) {

        //check exception
        try{
            Triangle triangle1 = new Triangle(299,12,15);
        } catch (MyExceptions e){
            System.out.println(e.getMessage());
        }

        //not exception
        Triangle triangle = new Triangle(20, 25,11);
        System.out.println(triangle);

        //uncheck exception
        Triangle triangle2 = new Triangle(299,12,15);
    }
}
