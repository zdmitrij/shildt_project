package com.zdmitrij.javacore.chapter10;

/* эта программа содержит ошибку
в последовательности  операторов catch подкласс исключений должен быть указан перед его суперклассом,
иначе это приведет в недостижимому коду и ошибке во время компиляции.
 */
public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        }
        catch (ArithmeticException e) {//Ошибка - недостижимый код!
            System.out.println("Этот код вообще недостижим");
        }
        catch (Exception e) {
            System.out.println(
                    "Перехват исключений общего класса Exception.");
        }
        /* Этот оператор catch вообще не будет достигнут, т.к. подкласс ArythmeticException является производным от
        класса Exception
         */
            }
}