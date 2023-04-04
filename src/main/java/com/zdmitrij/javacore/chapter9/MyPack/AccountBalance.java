package com.zdmitrij.javacore.chapter9.MyPack;

//Простой пакет
class Balance {
    String name;
    double bal;

    Balance(String n, double d) {
        name = n;
        bal = d;
    }

    void show() {
        if (bal < 0) {
            System.out.print("-->");
            System.out.println(name + ": $" + bal);
        }
    }
}

public class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("K.M.Fielding", 123.23);
        current[1] = new Balance("Will Tell", 157.02);
        current[2] = new Balance("Tom Jackson", -12.33);
        for (int i = 0; i < 3; i++) current[i].show();
    }
}