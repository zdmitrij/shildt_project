package com.zdmitrij.javacore.chapter9;
import MyPack.*;
class TestBalance {
    public static void main(String[] args) {
        //Класс Balanxe объявлен как Public, поэтому им можно воспользоваться и
        // вызвать его конструктор
        Balance test = new Balance("J.J.Jaspers", 99.88);
        test.show();//можно также вызвать метод show
    }
}
