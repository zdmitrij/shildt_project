package com.zdmitrij.javacore.chapter7;
// в этой версии класса Box один объект допускается инициализировать другим объектом
class Box {
    double width;
    double height;
    double depth;

    //В этом конструкторе в качестве параметров используется объект
    // типа Box

    Box(Box ob) { //передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // это конструктор используемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор используемый когда ни один из размеров не указан
    Box() {
        width = -1; //использовать значение -1 для обозначения
        height = -1; // неинициализированного параллелипипеда
        depth = -1;  //
    }

    // конструктор используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        //создать параллелипипеды, используя разные
        // конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        //получить объем первого параллелипипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // плоучить объем второго параллелипипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        //получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);

    }
}
