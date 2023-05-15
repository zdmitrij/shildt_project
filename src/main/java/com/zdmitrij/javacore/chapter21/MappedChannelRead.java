package com.zdmitrij.javacore.chapter21;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelRead {
    public static void main(String[] args) {

        //получить канал к файлу  в блоке оператора try с ресурсами
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))) {
            //получить размер файла
            long fSize = fChan.size();

            //а теперь сопоставить файл с буфером
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            //читать байты из буфера и выводить их на экран
            for (int i = 0; i < fSize; i++)
                System.out.println((char) mBuf.get());
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути nb" + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}