package com.zdmitrij.javacore.chapter7;

//В этой программе демонстрируется отличие модификаторов public и private
class Test5 {
    int a; //доступ определяемый по умолчанию
    public int b; //открытый доступ
    private int c; //закрытый доступ

    //методы доступа к члену с данного класса
    void setc(int i) {//установить значение члена c данного класса
        c = i;
    }

    int getc() {//получить значение c данного класса
        return c;
    }
}

class AccessTest {
    public static void main(String args[]) {
        Test5 ob = new Test5();

        //Эти операторы правильны, поэтому
        // члены a и b данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;
        // а этот оператор неверен и может вызвать ошибку
        // ob.c = 100; //ОШИБКА

        // доступ к члену c данного класса должен осуществляться с
        //помощью методов её класса
        ob.setc(100); // верно
        System.out.println("a, b, c:  " + ob.a + " " + ob.b + " " + ob.getc());
    }
}