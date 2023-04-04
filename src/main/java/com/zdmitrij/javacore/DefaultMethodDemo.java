package com.zdmitrij.javacore;

public interface MyIF {
    // Это объявление обычного метода в интерфейсе.
    // он не предоставляет реализацию по умолчанию

    int getNumber();

    //а это объявление метода по умолчанию, он имеет реализацию по умолчанию
    default String getString()
    //{
      //  return "Объект типа String по умолчанию";
    //}
}

// реализовать интерфейс MyIF
class MyIFmp implements MyIF {
    public int getNumber() {
        return 100;
    }
}

// использовать метод по умолчанию
public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFmp obj = new MyIFmp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
    }
}
