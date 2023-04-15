package com.zdmitrij.javacore.chapter18;
//Продемонстрировать применение класса ArrayDeque

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        //создать двустороннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<String>();
        // Использовать класс ArrayDeque для создания стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Извлечение из стека " );
        while(adq.peek() != null)
            System.out.println(adq.pop() + "");
        System.out.println();
    }
}