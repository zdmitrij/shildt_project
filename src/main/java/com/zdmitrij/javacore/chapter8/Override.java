package com.zdmitrij.javacore.chapter8;
//Переопределение метода
//Здесь вызовется переопределенный метод дочернего класса
// При необходимости вызвать метод родительского класса необходимо
// вызвать super.show();

class A5 {
    int i, j;
    A5(int a, int b) {
        i = a;
        j = b;
    }

    //вывести содержимое переменных i и j
    void show() {
        System.out.println("i  и j: " + i + " " + j);

    }
}
class B5 extends A5 {
    int k;
    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    //вывести содержимое переменной k с помощью метода
    // переопределяющего  метод show() из класса A5
    void show() {
        System.out.println("k = " + k);
    }
}
public class Override {
    public static void main(String[] args) {
        B5 subOb = new B5(1, 2, 3);
        subOb.show(); //здесь вызывается метод show() из класса B
    }
}
