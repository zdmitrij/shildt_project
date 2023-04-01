package com.zdmitrij.javacore.chapter7;
//продемонстрировать перегрузку методов
public class OverloadDemo {

    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    //перегружающий метод, проверяющий наличие двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b " + a + " " + b);

    }

    //перегружаемый методв, проверяющий наличие параметра типа double
    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове  test(double) a: " + a);
    }
}

    class Overload {
        public static void main(String[] args) {
            OverloadDemo ob = new OverloadDemo();
            int i = 88;

            //вызываем все варианты метода test
            ob.test();
            ob.test(10, 20);
            ob.test(i);//здесь вызывается вариант метода test(double)
            ob.test(123.25); // а здесь вызвыается вариант метода  test(double)

        }
    }
