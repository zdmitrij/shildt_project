package com.zdmitrij.javacore.chapter5;
//Объявить переменную циклом в самом цикле for
public class ForTickRe {
    public static void main(String[] args) {
        //здесь переменная n объявляется в самом цикле for
        for(int n = 10; n > 0; n--) {
            System.out.println("такт " + n);
        }
    }
}
