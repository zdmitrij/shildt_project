package com.zdmitrij.javacore.chapter6;

class BoxDemo3 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth =  15;

        /* присвоить другие значения переменным экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //вывести объем первого параллелипипеда
        mybox1.volume();

        //вывести объем второго параллелипипеда
        mybox2.volume();
    }
}