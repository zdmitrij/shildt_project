package com.zdmitrij.javacore.chapter9.p1;

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктор этого же пакета");
        System.out.println(("n = " + p.n));

        //доступно только для класса
        //System.out.println("n_pri = " + p.n_pri);

        System.out.println("n+pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
