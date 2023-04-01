package com.zdmitrij.javacore.chapter7;
//теперь метод vaTest объявляется с аргументами переменной длины
public class VarArgs {
    static void vaTest(int ... v) {
        System.out.println("Количество аргументов:  " + v.length +
                "Содержимое: ");

        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        //Обратите внимание на возможные способы вызова
        // метода vaTest() c аргументами переменной длины
        vaTest(10); //1 аргумент
            vaTest(1, 2, 3); // 3 аргумента
        vaTest(); //без аргументов
    }
}