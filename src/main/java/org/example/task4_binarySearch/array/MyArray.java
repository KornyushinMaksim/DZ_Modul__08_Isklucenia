package org.example.task4_binarySearch.array;

import org.example.task4_binarySearch.exceptions.MyExceptions;

public class MyArray {
    private int[] array;

    public MyArray() {
        int sizeRand = (int) (Math.random() * 10 + 1);
        this.array = new int[sizeRand];
        for (int i = 0; i < this.array.length; i++){
            this.array[i] = (int) (Math.random() * 10);
        }
    }

    public void sortArray() throws MyExceptions {
        for (int i = 1; i < this.array.length; i++){
            if (this.array[i - 1] > this.array[i]){
                throw new MyExceptions("Необходимо отсортировать массив!");
            }
        }
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.array.length; i++){
            str += this.array[i] + " ";
        }
        return str;
    }
}
