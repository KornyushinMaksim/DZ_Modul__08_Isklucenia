//Напишите код, который создает объекты данного класса и вызывает метод halt.
//        В случае, если в методе было брошено RuntimeException, вывести в консоль halt;
//в противном случае – пробросить исключение наверх.

package org.example.task5_methodHalt;

import org.example.task5_methodHalt.method.Runner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        try {
            runner.halt();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
