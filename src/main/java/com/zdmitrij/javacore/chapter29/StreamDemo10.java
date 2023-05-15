package com.zdmitrij.javacore.chapter29;
//продемонстрировать применение метода trySplit()

import java.util.*;
import java.util.stream.*;

public class StreamDemo10 {
    public static void main(String[] args) {
        //создать список отдельных строк

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        //получить поток данных для списочного массива
        Stream<String> myStream = myList.stream();

        //получить итератор разделитель
        Spliterator<String> splitItr = myStream.spliterator();

        //а теперь разделить первый итератор
        Spliterator<String> splitItr2 = splitItr.trySplit();

        //использовать сначала  итератор splitItr2, если нельзя разделить итератор splitItr
        if (splitItr2 != null) {
            System.out.println("Результат, выводимый итератором splitItr2: ");
            splitItr2.forEachRemaining((n) -> System.out.println(n));
        }
        //а теперь воспользоваться итератором splitItr
        System.out.println("\nРезультат выводимый итератором SplitItr ");
        splitItr.forEachRemaining((n) -> System.out.println(n));
    }
}