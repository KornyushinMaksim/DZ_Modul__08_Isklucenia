package org.example.task6_methodRead.method;

import java.util.Arrays;

public class MyArray {
    private XmlReader[] xmlReaders;

    public XmlReader[] getXmlReaders() {
        return xmlReaders;
    }

    public void setXmlReaders(XmlReader[] xmlReaders, int size){
        this.xmlReaders = Arrays.copyOf(xmlReaders, size);
    }

}
