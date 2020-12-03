package ru.oshkina.demo4;

/**
 * Перегрузка конструктора
 */
public class MyClass {
    int number;
    char symbol;

    void show() {
        System.out.println("Число:" + number);
        System.out.println("Символ:" + symbol);
    }

//    //Конструктор с двумя аргументами
//    MyClass(int n, char s) {
//        System.out.println("Создается объект");
//        //Полям присваиваются значения:
//        number = n;
//        symbol = s;
//    }

//    //Конструктор без аргументов
//    MyClass() {
//        this(100, 'A');
//        System.out.println("Объект создан");
//    }

//    //Конструктор с целочисленным аргументом
//    MyClass(int n) {
//        //Вызов конструктора с двумя аргументами
//        this(n, 'B');
//    }

    //Конструктор с символьным аргументом
//    MyClass(char s){
//        System.out.println("Новый объект:");
//        //Полям присваиваются значения
//        number = 300;
//        symbol = s;
//    }
}
