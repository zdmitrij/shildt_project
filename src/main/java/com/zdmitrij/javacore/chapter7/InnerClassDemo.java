package com.zdmitrij.javacore.chapter7;
//Продемонстрировать применение внутреннего класса
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }
        //это внутренний класс
        class Inner {
            void display() {
                System.out.println("Вывод:  outer_x = " + outer_x);
            }
        }
    }
    class InnerClassDemo {
        public static void main(String[] args) {
            Outer outer = new Outer();
            outer.test();
        }
}
