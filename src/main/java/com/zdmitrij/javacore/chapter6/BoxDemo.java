package com.zdmitrij.javacore.chapter6;

/* Программа использующая класс BOX
Присвоить исходному классу имя BoxDemo.java
 */
class Box {
    double width;
    double height;
    double depth;


    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    // вывести объем параллелипипеда
    double volume() {
        return width * height * depth;
    }

    //установить размеры параллелипипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

// В этом классе объявляется объект типа Box
class BoxDemo {
    public static void main(String args[]) {
        Box mybox = new Box();
        double vol;
        // присвоить значенипе переменным экземпляра mybox;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // рассчитать объем параллелипипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }


}
