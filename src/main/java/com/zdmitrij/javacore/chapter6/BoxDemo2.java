package com.zdmitrij.javacore.chapter6;

//В этой программе объявляются два объекта класса Box

class BoxDemo2 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //присвоить значения переменным экземпляра mybox
        mybox1.width = 10;
        mybox1.height = 6;
        mybox1.depth = 15;

        //присвоить значение переменным экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // Рассчитать объем первого параллелипипеда
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);

        //Рассчитать объем второго параллелипипеда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем равен " + vol);
    }
}
