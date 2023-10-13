package org.example.task2_incomingNumber.exceptions;

public class MyCheckedException extends Exception{
    private int number;

    public MyCheckedException(String message, int number) {
        super(message);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
