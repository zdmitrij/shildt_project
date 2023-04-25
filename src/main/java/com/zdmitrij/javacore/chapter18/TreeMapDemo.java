package com.zdmitrij.javacore.chapter18;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        //ввести элементы в древовидное отображение
        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(323.22));
        tm.put("Тод Халл", new Double(23.22));
        tm.put("Ральф Смит", new Double(-19.22));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }


                //внести сумму 1000 на счет Джона Доу
        Double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу " + tm.get("Джон Доу"));
    }
}