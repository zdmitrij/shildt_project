package com.zdmitrij.javacore.chapter8;

//Применение абстрактных методов и классов
abstract class Figure2 {
    double dim1;
    double dim2;

    Figure2(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    //теперь метод area является абстрактным
    abstract double area();
}
class Rectangle2 extends Figure2 {
    Rectangle2(double a, double b) {
        super(a, b);
    }
    //переопределить метод area() Для четырехугольника
    double area() {
        System.out.println("В области четырехугольника ");
        return dim1 * dim2;
    }
}
class Triangle2 extends Figure2 {
    Triangle2(double a, double b) {
        super(a, b);
    }
    //переопределить метод area() для прямоугольного треугольника
    double area() {
        System.out.println("В области треугольника");
        return dim1 * dim2 / 2;
            }
}
class AbstractAreas {
    public static void main(String args[]) {
        //Figure f = new Figure(10, 10);// теперь недопустимо
        Rectangle2 r = new Rectangle2(9, 5);
        Triangle2 t = new Triangle2(10, 8);
                Figure2 figref; //верно, но объект не создается


        figref = r;
        System.out.println("Площадь равна" + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}