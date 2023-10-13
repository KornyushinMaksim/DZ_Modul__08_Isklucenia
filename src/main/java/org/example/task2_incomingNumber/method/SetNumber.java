package org.example.task2_incomingNumber.method;

import org.example.task2_incomingNumber.exceptions.MyCheckedException;
import org.example.task2_incomingNumber.exceptions.MyUncheckedException;

public class SetNumber {
    private int number;

    public SetNumber() {
    }

    public int getNumber() {
        return number;
    }

    public void SetNumber(int number) throws MyCheckedException, MyUncheckedException {
        if (number < 0){
            throw new MyCheckedException("Число отрицательное", number);
        } else {
            this.number = number;
        }
        if (number > 100){
            throw new MyUncheckedException("Число > 100");
        } else {
            this.number = number;
        }
    }

}
