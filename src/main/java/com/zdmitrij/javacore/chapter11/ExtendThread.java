package com.zdmitrij.javacore.chapter11;

//создать второй поток исполнения расширив класс Thread
class NewThread3 extends Thread {

    NewThread3() {
        //создать новый поток исполнения
        super("Демонстрационный поток ");
        System.out.println("Дочерний поток " + this);
        start(); //запустить поток на исполнение
    }

    //точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}
class ExtendThread {
    public static void main(String[] args) {
        new NewThread3(); //создать новый поток

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Главный поток завершен");
    }
}

