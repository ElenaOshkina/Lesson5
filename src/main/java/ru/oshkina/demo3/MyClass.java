package ru.oshkina.demo3;

public class MyClass {
    //поля класса
    int number;
    char symbol;

    //метод для отображения значений полей
    void show() {
        System.out.println("Число:" + number);
        System.out.println("Символ:" + symbol);
    }

    //Конструктор
    MyClass() {
        //Присваивание значений полям
        number = 100;
        symbol = 'A';
        //Отображение значений полей
        show();
    }
}
