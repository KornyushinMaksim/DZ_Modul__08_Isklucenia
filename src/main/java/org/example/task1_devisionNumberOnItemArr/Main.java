//      Создать метод, который выводит в консоль результат целочисленного деления числа,
//        введенного с клавиатуры, на значения элементов одномерного массива целых чисел,
//        заполненный случайным образом – от -10 до 10. Длина массива случайная – от 1 до 10.
//        Обработать все возможные исключительные ситуации в данном методе.

package org.example.task1_devisionNumberOnItemArr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyArray myArray = new MyArray();
        MyArray myArray1 = null;

        System.out.println(myArray);
        System.out.println();

        System.out.println("Введите число");
        int v = in.nextInt();

        try {
            myArray1 = myArray.divisionOnItemArray(v);
        } catch (ArithmeticException e) {
            System.err.println("Деление на ноль");
        }
        System.out.println(myArray1);

    }
}