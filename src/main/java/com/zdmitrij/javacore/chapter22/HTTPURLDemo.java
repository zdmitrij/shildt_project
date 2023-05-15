package com.zdmitrij.javacore.chapter22;
//Продемонстрировать применение класса HTTPURLConnection

import javax.net.ssl.HttpsURLConnection;
import java.net.*;
import java.io.*;
import java.util.*;

public class HTTPURLDemo {
    public static void main(String[] args) throws Exception {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        //вывести метод запроса
        System.out.println("Метод запроса: " + hpCon.getRequestMethod());

        //вывести код ответа
        System.out.println("Код ответа: " + hpCon.getResponseCode());

        //вывести ответное сообщение
        System.out.println("Ответное сообщение " + hpCon.getResponseMessage());

        //получить список полей и множество ключей из заголовка
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nДалее следует заголовок: ");

        //Вывести все ключи и значения из заголовка
        for(String k: hdrField) {
            System.out.println("Ключ: " + k + " Значение " + hdrMap.get(k));
        }
    }
}