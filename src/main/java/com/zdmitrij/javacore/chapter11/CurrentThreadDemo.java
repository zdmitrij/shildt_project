package com.zdmitrij.javacore.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Текущий поток исполнения " + t);

        // изменить имя потока исполнения
        t.setName("My Thread");
        System.out.println("После изменения потока " + t);

        try {
            for (int i = 5; i < 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток в исполнении прерван");
        }
    }
}