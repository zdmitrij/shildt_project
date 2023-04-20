package com.zdmitrij.javacore.chapter18;
import java.util.*;
class HashMapDemo {
    public static void main(String[] args) {
        //создать хеш отображение
        HashMap<String, Double> hm = new HashMap<String, Double>();

        //ввести элементы в хеш отображение
        hm.put("Джон Доу", new Double(3434.34));
        hm.put("Том Смит", new Double(123.34));
        hm.put("Джейн Бейкер", new Double(1378.00));
        hm.put("Тод Холл", new Double(99.34));
        hm.put("Ральф Смит", new Double(19.08));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        //вывести множество записей
        for(Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести сумму 1000 на сумму Джона Доу
        double balance = hm.get("Джон Доу");
                hm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " +
                hm.get("Джон Доу"));
                    }
    }