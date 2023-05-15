package com.zdmitrij.javacore.chapter22;

import java.io.OutputStream;
import java.net.*;
import java.io.*;

//Использовать блок оператора  try c ресурсами для закрытия сокета
public class WhoIsAutoClose {
    public static void main(String[] args) throws Exception {
        int c;

        //создать сокетное соединение с веб-сайтом internic.net через порт 43
        // Этим сокетом управляет блок оператора  try с ресурсами

        try (Socket s = new Socket("whois.internic.net",  43)) {
            //получить  потоки ввода-вывода
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            //сформировать строку запроса
            String str = (args.length == 0 ? "yahoo.com" : args[0]) +
            "\n";

            //преобразовать строку в байты
            byte[] buf = str.getBytes();

            //послать запрос
            out.write(buf);

            //прочитать запрос
            while((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        }
    }
}
