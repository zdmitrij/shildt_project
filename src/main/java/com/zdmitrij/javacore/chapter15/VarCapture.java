package com.zdmitrij.javacore.chapter15;
//Пример захвата локальной переменной из объемлющей области действия

interface MyFunc {
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        //Локальная переменная, которая может быть захвачена
        int num = 10;

        MyFunc myLambda = (n) -> {
            //Такое применение переменной num допустимо, поскольку она не видоизменяется
            int v = num +n;

            //Но следующая строка кода недопустима, поскольку в ней
            // предпринимается попытка  видоизменить значение переменной num
            //num++;
            return v;
        };

        // и следующая строка кода приведет к ошибке, поскольку в ней
        // нарушается  действительно завершенное состояние переменной num
        //тгь = 9;
    }
}
