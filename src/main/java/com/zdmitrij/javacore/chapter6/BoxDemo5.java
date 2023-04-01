package com.zdmitrij.javacore.chapter6;

class BoxDemo5 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        //инициализировать каждый экземпляр класса Box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        //получить объем первого параллелипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        //получить объем второго праллелипипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);

    }
}
