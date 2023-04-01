package com.zdmitrij.javacore.chapter6;

class BoxDemo6 {
    public static void main(String args[]) {
        //объявить, выделить память и инициализировать объекты
        // типа Box
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        //получить объем первого параллелипипеда
        vol = mybox1.volume();
        System.out.println("Объем равен = " + vol);

        //получить объем второго параллелипипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
            }
 }