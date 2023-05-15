package com.zdmitrij.javacore.chapter21;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.io.*;
import java.nio.file.*;

/* эта программа выводит текстовый файлы, используя код
потокового ввода-вывода на основе системы NIO.
Требуется установка JDK начиная с версии 7
Чтобы воспользоватьс этой программой , укажите имя файла, который требуется просмотреть
Напрмер,  чтобы просмотреть файл TEST.TXT , введите в режиме командной строки следующую команду:
java ShowFile TEST.TXT
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        // сначала удостоверимся, что указано имя файла
        if (args.length != 1) {
            System.out.println("Применение - ShowFile имя_файла ");
            return;
        }

        //открыть  файл и получить связанный с ним поток ввода-вывода
        try (InputStream fin = Files.newInputStream(Paths.get(args[0]))) {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути" + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}