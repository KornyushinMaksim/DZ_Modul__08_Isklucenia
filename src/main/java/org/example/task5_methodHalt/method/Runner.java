package org.example.task5_methodHalt.method;

import java.io.IOException;
import java.util.Random;

public class Runner {
    private static final Random rnd = new Random();

    public String halt() throws IOException {
        if(rnd.nextBoolean()){
            throw new RuntimeException("halt");
        } else {
            throw new IOException("исключение брошено вверх");
        }
    }

    @Override
    public String toString() {
        return "Runner{}";
    }
}
