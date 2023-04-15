package com.zdmitrij.javacore.chapter18;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        //создать списочный массив
        ArrayList<String> al = new ArrayList<String>();

        System.out.println(
                "Начальный размер списочного массива al: " + al.size());

        //ввести элементы в списочный массив
        al.add("С");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println(
                "Размер списочного массива al после ввода элементов: " + al.size());

        //вывести списочный массив
        System.out.println("Содержимое списочного массива al: " + al);

        //Удалить элементы из списочного массива
        al.remove("А");
        al.remove(2);
        System.out.println(
                "Размер списочного массива al после удаления  элементов " +
                        al.size());
        System.out.println("Содержимое списочного массива al: " + al);


    }
}
