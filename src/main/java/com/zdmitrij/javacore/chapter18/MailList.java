package com.zdmitrij.javacore.chapter18;
//Простой пример обработки списка почтовых адресов

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.*;

class Adress {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Adress(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " +code;
    }
}

class MailList {
    public static void main(String[] args) {
        LinkedList<Adress> ml = new LinkedList<Adress>();
        //ввести элементы в связный список
        ml.add(new Adress("West", "Ave Oak", "Urbana", "IL", "61801"));
        ml.add(new Adress("Ralph Baker", "Ave Oak", "Urbana", "IL", "61801"));
        ml.add(new Adress("Tom Karlton", "867 Elm", "Champaign", "IL", "61820"));

        //вывести список почтовых адресов
        for (Adress element : ml) System.out.println(element + "\n");
        System.out.println();
    }
}