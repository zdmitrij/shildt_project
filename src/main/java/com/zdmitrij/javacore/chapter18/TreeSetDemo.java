package com.zdmitrij.javacore.chapter18;
//Продемонстрировать применение класса Treeset
import java.util.*;


public class TreeSetDemo {
    public static void main(String[] args) {
        //создать древовидное множество типа TreeeSet
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
    }
}
