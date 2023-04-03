package com.zdmitrij.javacore.chapter8;

class RefDemo {
    public static void main(String args[]) {
        BoxWeight weihghtbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weihghtbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox  равен " + weihghtbox.weight);
        System.out.println();

        //присвоить ссылке на объект BoxWeight
        plainbox = weihghtbox;
        vol = plainbox.volume();//Верно, т.к. метод volume определен в классе Box
        System.out.println("Объем plainbox равен " + vol);
        /* Следующий оператор ошибочен, поскольку член plainbox не определяет
        член weight. */
        //System.out.println("Вес plainbox равен " + plainbox.weight);
    }
    }