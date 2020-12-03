package ru.oshkina.demo2;

/**
 * Перегрузка метода и приведение типов
 */
public class MyClass {
    //Закрытые поля
    private int number;
    private char symbol;

    //Метод с одним аргументом для присваивания значения
    // целочисленному полю
    void set(int n) {
        number = n;
    }

    //Метод с одним аргументом для присваивания значения
    // символьному полю
    void set(char s) {
        symbol = s;
    }

    //Метод с двумя аргументами для присваивания
    // значений полям
    void set(int n, char s) {
        set(n);
        set(s);
    }

//    void set(char s, int n) {
//        set(n);
//        set(s);
//    }

    //Метод для отображения значений полей
    void show() {
        System.out.println("Поля объекта");
        System.out.println("Число: " + number);
        System.out.println("Символ: " + symbol);
    }
}
