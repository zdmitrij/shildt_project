package com.zdmitrij.javacore.chapter13;
//Простейший текстовый редактор

import java.io.*;

public class TinyEdit {
    public static void main(String[] args) throws Exception {
        //создать поток ввода типа BufferedReader
        //исползуя стандартный поток ввода  System.in
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Введите строки текста. ");
        System.out.println("Введите 'Стоп для завершения'");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("стоп")) break;
            System.out.println();
        }
        System.out.println("\nСодержимое вашего файла: ");
        //вывести текстовые строки
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("стоп")) break;
            System.out.println(str[i]);
        }

    }

}
