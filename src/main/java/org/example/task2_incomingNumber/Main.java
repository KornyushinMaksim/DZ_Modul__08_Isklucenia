//Создать метод, принимающий на вход число. В случае,
//        если число отрицательное, в методе должно быть брошено проверяемое исключение.
//        Если число больше 100, должно быть брошено непроверяемое исключение.
//        Создать свои исключения для данного примера.
//        Протестируйте метод с помощью JUnit-тестов.

package org.example.task2_incomingNumber;

import org.example.task2_incomingNumber.exceptions.MyCheckedException;
import org.example.task2_incomingNumber.method.SetNumber;

public class Main {
    public static void main(String[] args) {

        SetNumber set = new SetNumber() ;

        //отрабатывает проверяемое исключение
        try {
            set.SetNumber(-10);
            System.out.println(set.getNumber());
        } catch (MyCheckedException e){
            System.out.println(e.getMessage());
        }

        //отрабатывает без исключений
        try {
            set.SetNumber(10);
            System.out.println(set.getNumber());
        } catch (MyCheckedException e){
            System.out.println(e.getMessage());
        }

        //отрабатывает непроверяемое исключение
        try {
            set.SetNumber(105);
            System.out.println(set.getNumber());
        } catch (MyCheckedException e){
            System.out.println(e.getMessage());
        }
    }
}
