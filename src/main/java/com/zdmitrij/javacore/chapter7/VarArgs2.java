package com.zdmitrij.javacore.chapter7;
//Использовать аргументы переменной длины вместе
//со стандартными аргументами

public class VarArgs2 {
    //В данном примере msg - обычный параметр
    // а v - параметр переменной длины
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + "  Содержимое; ");

        for(int x : v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один параметр переменной длины: ", 10);
        vaTest("Три параметра переменной длины: ", 1, 2, 3);
        vaTest("Без параметров переменной длины: ");
    }

}
