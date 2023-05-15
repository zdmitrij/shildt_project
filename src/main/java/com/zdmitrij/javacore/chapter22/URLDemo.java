package com.zdmitrij.javacore.chapter22;
//Продемонстрировать применение класса URL
import java.net.*;
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException{
        URL hp = new URL("http://www.primatologia.ru/index.html");

        System.out.println("Протокол: " + hp.getProtocol());
        System.out.println("Порт: " + hp.getPort());
        System.out.println("Хост: " + hp.getHost());
        System.out.println("Файл: " + hp.getFile());
        System.out.println("Полная форма " + hp.toExternalForm());
    }
}
