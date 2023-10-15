package org.example.task2_incomingNumber.method;

import org.example.task2_incomingNumber.exceptions.MyCheckedException;
import org.example.task2_incomingNumber.exceptions.MyUncheckedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SetNumberTest {

    @Test
    void setNumberNegative() {
        SetNumber st = new SetNumber();
        boolean ex = false;
        try{
            st.SetNumber(-4);
        } catch (MyCheckedException f){
            ex = true;
        }
        assertTrue(ex);
    }

    @Test
    void setNumberMoreThen100() throws MyCheckedException {
        SetNumber st = new SetNumber();
        boolean ex = false;
        try{
            st.SetNumber(120);
        } catch (MyUncheckedException f){
            ex = true;
        }
        assertTrue(ex);
    }
}