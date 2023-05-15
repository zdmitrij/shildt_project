package com.zdmitrij.javacore.chapter29;
//Применить итератор в потоке данных

import java.util.*;
import java.util.stream.*;

public class StreamDemo8 {
    public static void main(String[] args) {
        //создать список символьных строк
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");
        //получить поток данных для списочного массива
        Stream<String> myStream = myList.stream();
        //получить итератор для потока данных
        Iterator<String> itr = myStream.iterator();
        //перебрать элементы в потоке данных
        while (itr.hasNext()) System.out.println(itr.next());
    }
}