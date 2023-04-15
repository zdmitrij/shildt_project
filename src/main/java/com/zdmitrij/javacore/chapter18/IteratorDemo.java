package com.zdmitrij.javacore.chapter18;
//Продемонстрировать применение итераторов
import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        //создать списочный массив
        ArrayList<String> al = new ArrayList<String>();
        //ввести элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        //Использовать итераторы для вывода содержимого
        // списочного массива al
        System.out.println(
                "Исходное содержимое списочного массива al ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //видоизменить  перебираемые объекты
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }

        System.out.println(
                "Измененное содержимое списочного массива al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();
        // а теперь отобразить список в обратном порядке
        System.out.println("Измененный в обратном порядке список: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.println(element + " ");
        }
        System.out.println();
    }
}