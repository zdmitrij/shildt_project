package com.zdmitrij.javacore.chapter7;

public class OverloadCons2 {
    public static void main(String[] args) {
        //создать паралеллипипеды используя
        // разные конструкторы
        Box mybox1= new Box(1, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);
        //создать копию объекта mybox1
        double vol;

        //получить объем первого параллелипипедаа
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        //получить объем второго параллелипипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        //получить объем куба
        vol = mycube.volume();
        System.out.println("Объем куба равен " + vol);

        //получить объем Клона
        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);

    }
}