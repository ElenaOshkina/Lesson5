package ru.oshkina.demo1;

/**
 * Перегрузка методов
 */
public class MyClass {
    //Закрытые поля
    private int first;
    private int second;

    //Метод с двумя аргументами для присваивания значений полям
    void set(int a, int b) {
        first = a;
        second = b;
    }

    //Метод с одним аргументом для присваивания значений полям
    void set(int n) {
        first = n;
        second = n;
    }

    //Метод без аргументов для присваивания значений полям
    void set() {
        first = 100;
        second = 200;
    }

    //Метод без аргуменов для отображения значений полей
    void show() {
        System.out.println("Поле first:" + first);
        System.out.println("Поле second:" + second);
    }

    //Метод с одним аргументом для отображения значений полей
    void show(boolean t) {
        if (t) {
            System.out.println("Поле first:" + first);
        } else {
            System.out.println("Поле second:" + second);
        }
    }
}
