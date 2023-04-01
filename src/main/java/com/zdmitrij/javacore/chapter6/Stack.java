package com.zdmitrij.javacore.chapter6;

//в этом классе определяется целочисленный стек, в котором можно хранить до 10 целочисленных значений
class Stack {
    int stck[] = new int[10];
    int tos;

    //инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    //разместить элемент в стеке
    void push(int item) {
        if (tos == 9) {
            System.out.println("Стэк заполненю ");
        } else
            stck[++tos] = item;
    }

    //извлечь элемент из стэка

    int pop() {
        if (tos < 0) {
            System.out.println(" Стэк не загружен");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
