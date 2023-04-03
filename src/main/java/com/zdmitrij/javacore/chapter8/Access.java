package com.zdmitrij.javacore.chapter8;
/* в иерархии классов закрытые члены остаются закрытыми в
пределах своего класса
Эта программа содержит ошибку, поэтому скомпилировать ее не удастся
 */

class A2 {
    int i; // этот член открыт по умолчанию
    //private int j; // а этот член закрыт в классе А2
    int j; // закомментировал private, т.к. иначе код постоянно висит с ошибкой

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}
//член j класса А в этом классе недоступен
class B2 extends A2 {
    int total;
    void sum() {
        total = i + j;// Ошибка - член j в этом классе недоступен
    }
}
public class Access {
    public static void main(String[] args) {
        B2 subOb = new B2();
        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}