package com.zdmitrij.javacore.chapter5;
//Переменная в цикле в стиле for each доступна только для чтения
class NoChange {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            System.out.println(x + " ");
            x = x * 10; //этот оператор не оказывает никакого влияния на массив nums

        }
        System.out.println();

        for (int x : nums)
            System.out.println(x + " ");
        System.out.println();
    }
}