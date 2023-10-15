//Создайте метод, который принимает массив объектов данного класса,
//        и вызывает у каждого объекта метод read. Если при исполнении
//        будет брошено исключение File SystemAlreadyExistsException,
//        поймать исключение и бросить исключение FileNotFoundException.

package org.example.task6_methodRead;

import org.example.task6_methodRead.method.MyArray;
import org.example.task6_methodRead.method.XmlReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MyArray myArray = new MyArray();

        XmlReader xmlReader = new XmlReader();
        XmlReader xmlReader1 = new XmlReader();
        XmlReader xmlReader2 = new XmlReader();
        XmlReader xmlReader3 = new XmlReader();
        XmlReader xmlReader4 = new XmlReader();

        XmlReader[] arr = new XmlReader[]{xmlReader, xmlReader1, xmlReader2, xmlReader3, xmlReader4};
        myArray.setXmlReaders(arr, arr.length);
        for (XmlReader xml : myArray.getXmlReaders()) {
            try {
                xml.read();
            } catch (FileAlreadyExistsException e){
                System.out.println(1);
                System.out.println(e.getMessage());
                System.out.println(e.getCause().getMessage());
            } catch (IOException i){
                System.out.println(i.getMessage());
            }

        }
    }
}
