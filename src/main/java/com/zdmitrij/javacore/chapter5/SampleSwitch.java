package com.zdmitrij.javacore.chapter5;
//Простой пример примененеия оператора Switch
class SampleSwitch {
    public static void main(String args[]) {
        for(int i = 0; i < 6; i++)
            switch(i) {
                case 0:
                    System.out.println("i равно нулю.");
                    break;
                case 1:
                    System.out.println("i равно единице.");
                    break;
                case 2:
                    System.out.println("i равно двум.");
                    break;
                case 3:
                    System.out.println("i равно трём.");
                    break;
                case 4:
                    System.out.println("i больше трех.");
                    break;
                default:
                    System.out.println("i больше трёх");

            }
    }
}
