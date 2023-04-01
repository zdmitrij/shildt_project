package com.zdmitrij.javacore.chapter7;
//В этом классе определяется целочисленный стек
// который может содержать 10 значений
class Stack {
    /* теперь переменные stck и tos являются закрытыми.
    Это означает, что они не могут быть случайно или намеренно
    быть изменены  таким образом, чтобы нарушить стек.
     */
    private int stck[] = new int [10];
    private int tos;
    //инициализировать вершину стека
    Stack() {
        tos = -1;
    }
    // разместить элементы в стеке
    void push(int item) {
        if (tos == 9) {
            System.out.println("Стэк заполнен");
        } else stck[++tos] = item;
        }

        //извлечь элемент из стека
        int pop() {
            if(tos < 0) {
                System.out.println("Стэк не загружен ");
                return 0;
            }
            else return stck[tos--];
        }
    }