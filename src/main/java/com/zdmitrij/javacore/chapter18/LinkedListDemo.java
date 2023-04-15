package com.zdmitrij.javacore.chapter18;
//Продемонстрировать применение  класса  Linked List
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        //создать связный список
        LinkedList<String> ll = new LinkedList<String>();

        //ввести элементы в связный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Исходное содержимое связного списка ll: " +
                ll);

        //удалить элементы из связного списка
        ll.remove("F");
        ll.remove(2);
        System.out.println("Содержимое связного спика ll " +
                "после удаления элементов: " + ll);
        //удалить первый и последний элементы из связного списка
        ll.removeFirst();
        ll.removeLast();

        System.out.println(
                "Содержимое связного списка ll  после удаления  " + "первого" +
                        "и последнего элементов  " + ll);
        //получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено ");

        System.out.println("Содержимое связанного списка ll после изменения " +
                ll);
    }
}