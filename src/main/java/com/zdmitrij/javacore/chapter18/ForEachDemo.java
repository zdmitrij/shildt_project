package com.zdmitrij.javacore.chapter18;
//Применение цикла for в стиле foreach
//для перебора элементов коллекции

import java.util.*;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<Integer>();

        //ввести числовые значения в списочный массив
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        //организовать цикл для вывода числовых значений
        System.out.println(
                "Исходное содержимое списочного массива vals: ");
        for (int v : vals) {
            System.out.println(v + " ");
        }
        //суммировать числовые значения в цикле for
        int sum = 0;
        for (int v : vals) {
            sum += v;
        }
        System.out.println("Сумма числовых значений: " + sum);
    }
}