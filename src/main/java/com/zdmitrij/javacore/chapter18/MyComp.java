package com.zdmitrij.javacore.chapter18;
//Использовать специальный компаратор
import java.util.*;

//Компаратор для сравнения символьных строк в обратном порядке
class MyComp implements Comparator<Sring> {
public int compare(String a, String b) {
    String aStr, bStr;
    aStr = a;
    bStr = b;
    //Выполнить сравнение в обратном порядке
    return bStr.compareTo(aStr);
}
//переопределить метод equals не требуется

}

class CompDemo {
    public static void main(String[] args) {
        //создать древовидное множество тип TreeSet
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        //ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //вывести элементы из древовидного множества
        for(String element : ts) {
            System.out.println(element + " ");
            System.out.println();
        }
    }
}
