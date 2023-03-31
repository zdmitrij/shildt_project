package com.zdmitrij.javacore.chapter5;

//Продемонстрировать применение оператора цикла do-while
class DoWhile {
    public static void main(String args[]) {
        int n = 10;
        do {
            System.out.println("такт" + n);
            n--;
        } while (n > 0);
    }
}