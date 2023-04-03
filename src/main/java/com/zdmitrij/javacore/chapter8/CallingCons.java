package com.zdmitrij.javacore.chapter8;

//Продемонстрировать порядок вызова конструкторов
class A4 {
    A4() {
        System.out.println("В конструкторе А");
    }
}

//создать подкласс путем расширения класса A
class B4 extends A {
    B4() {
        System.out.println("в КОНСТРУКТОРЕ в");
    }
}

class C4 extends A {
    C4() {
        System.out.println("В конструкторе C");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C4 c = new C4();
    }
}