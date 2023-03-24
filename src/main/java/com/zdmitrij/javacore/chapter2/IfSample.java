package com.zdmitrij.javacore.chapter2;
/* Продемонстрировать применение условного оператора if.
Присвоить исходному файлу имя "IfSample.java"
 */
class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x = x * 2;
        if(x == y) System.out.println("x теперь равно y");

        x = x * 2;
        if(x > y) System.out.println("x теперь больше y");

        // Этот оператор не будет ничего выводить
        if(x == y) System.out.println("Вы не увидите этого");
    }
}