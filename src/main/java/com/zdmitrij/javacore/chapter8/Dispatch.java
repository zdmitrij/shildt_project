package com.zdmitrij.javacore.chapter8;

//Динамическая диспетчеризация методов
class A6 {
    void callme() {
        System.out.println("В методе callme из класса A");
    }
}

class B6 extends A6 {
    //переопределить класс callme
    void callme() {
        System.out.println("В методе callme из класса B");
    }
}

class C6 extends A6 {
    //переопределить метод callme
    void callme() {
        System.out.println("В методе callme из класса C");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A6 a = new A6();
        B6 b = new B6();
        C6 c = new C6();

        A6 r; //получить ссылку на объект типа А6, ни на что не ссылается пока

        r = a; // переменная r ссылается на объект типа А6
        r.callme(); // вызвать вариант метода callme определенный в классе А6

        r = b; //переменная r ссылается на объект типа B6
        r.callme();// вызвать вариант метода callme, определенный в классе B6

        r = c; // переменная r ссылается на объект типа С6
        r.callme(); //вызвать вариант метода callme определенный в классе C6
    }
}