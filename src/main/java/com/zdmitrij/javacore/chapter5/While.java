package com.zdmitrij.javacore.chapter5;

//Продемонстрировать применение оператора цикла while
class While {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.println("такт " + n);
            n--;
        }
    }
}
