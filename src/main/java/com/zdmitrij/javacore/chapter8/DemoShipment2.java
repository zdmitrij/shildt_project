package com.zdmitrij.javacore.chapter8;
//расширение класса BoxWeight включением в него
//поля стоимости доставки

//создать сначала класс Box
class Box3 {
    private double width;
    private double height;
    private double depth;

    //сконструировать клон объекта
    Box3(Box3 ob) {//передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, применяемый при указании всех размеров
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор, применяемый при отсутствии размеров
    Box3() {
        width = -1; //Значение -1 служит для обозначения
        height = -1; //неинициализированного параллелипипеда
        depth = -1;
    }

    //конструктор, применяемый при создании куба
    Box3(double len) {
        width = height = depth = len;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

//Добавить поле веса
class BoxWeight3 extends Box3 {
    double weight; //вес параллелипипеда

    //сконструировать клон объекта
    BoxWeight3(BoxWeight3 ob) {
        super(ob);
        weight = ob.weight;
    }

    //Конструктор применяемый при указании всех параметров
    BoxWeight3(double w, double h, double d, double m) {
        super(w, h, d); // вызвать конструктор суперкласса
        weight = m;
    }

    //конструктор применяемый по умолчанию
    BoxWeight3() {
        super();
        weight = -1;
    }
}

//Добавить поле стоимости доставки
class Shipment3 extends BoxWeight3 {
    double cost;

    //сконструировать клон объекта
    Shipment3(Shipment3 ob) {
        super(ob);
        cost = ob.cost;
    }

    //конструктор, используемый при указании всех параметров
    Shipment3(double w, double h, double d, double m, double c) {
        super(w, h, d, m);//вызвать конструктор суперкласса
        cost = c;
    }

    //конструктор, применяемый по умолчанию
    Shipment3() {
        super();
        cost = -1;
    }

    // Конструктор применяемый при создании куба
    Shipment3(double len, double m, double c) {
        super();
        cost = c;
    }
}

public class DemoShipment2 {
    public static void main(String[] args) {
        Shipment3 shipment1 = new Shipment3(10, 20, 15, 10, 3.41);
        Shipment3 shipment2 = new Shipment3(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Объем Shipment1 равен " + vol);
        System.out.println("Вес Shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки $ " + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Объем Shipment2 равен " + vol);
        System.out.println("Вес Shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки $ " + shipment2.cost);
    }
}


