package org.example.task3_triangle.triangle;

import org.example.task3_triangle.exceptions.MyExceptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void testTriangle() {
        boolean ex = false;
        try {
            Triangle t = new Triangle(200, 12, 13);
        } catch (MyExceptions f){
            ex = true;
        }
        assertTrue(ex);
    }
}