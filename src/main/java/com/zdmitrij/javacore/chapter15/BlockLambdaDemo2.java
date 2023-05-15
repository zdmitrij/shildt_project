package com.zdmitrij.javacore.chapter15;
//Блочное выражение, изменяющее на обратный порядок следования символов в строке

interface StringFunc {
    String func(String n);
}

class BlockLambdaDemo2 {
    public static void main(String[] args) {
        //это блочное выражение изменяет на обратный порядок следования символов в строке
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (int j = str.length() - 1; j >= 0; j--)
                result += str.charAt(j);
            return result;
        };
        System.out.println("Лямбда обращается на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " + reverse.func("Выражение"));
    }
}