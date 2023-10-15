package org.example.task6_methodRead.method;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Arrays;
import java.util.Random;

public class XmlReader {
    private XmlReader[] xmlReaders;
    private static final Random rnd = new Random();

    public void read () throws IOException {
        switch (rnd.nextInt(4)){
            case 1:
                throw new NullPointerException("case1");
            case 2:
                throw new Error("case2");
            case 3:
                throw new FileNotFoundException("case3");
            default:
                FileSystemAlreadyExistsException e = new FileSystemAlreadyExistsException("default");
                e.initCause(new FileNotFoundException("redirection"));
                throw e;
        }
    }
}
