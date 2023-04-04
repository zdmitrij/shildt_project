package com.zdmitrij.javacore.chapter9;

interface IntStack {
    void push(int item); //сохранить элемент в стеке

    int pop(); //извлечь элемент из стека
}

//реализация наращиваемого стека
class DynStack implements IntStack {
    private int stck;
    private int tos;

    // выделить память и инициализировать стек
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //разместить элемент в стеке
    public void push(int item) {
        //если стек заполнен, выделить память под стек большего размера
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; // удвоить размер стека
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else {
            stck[++tos] = item;
        }
    }

    //извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загуржен");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}


//создать переменную интерфейса и обратиться к стекам через нее
public class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack; //создать переменную ссылки на интерфейс
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds; // загрузить динамический стек
        // разместить числа в стеке
        for (int i = 0; i < 12; i++) mystack.push(i);

        mystack = fs; // загрузить фиксированный стек
        for (int i = 0; i < 8; i++) mystack.push(i);

        mystack = ds;
        System.out.println("Значения в динамическом стеке");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack.pop());

        mystack = fs;
        System.out.println("Значения в фиксированном стеке");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack.pop());
    }
}