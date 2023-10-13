//Напишите метод бинарного поиска в одномерном массиве.
//        В случае, если массив не отсортирован,
//        метод должен бросать проверяемое исключение.

package org.example.task4_binarySearch;

import org.example.task4_binarySearch.array.MyArray;
import org.example.task4_binarySearch.exceptions.MyExceptions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        System.out.println(array);
        try{
            array.sortArray();
        } catch (MyExceptions e){
            System.out.println(e.getMessage());
        }
        Arrays.sort(array.getArray());
        System.out.println(array);
        System.out.println(Arrays.binarySearch(array.getArray(), 5));
    }
}
