package ru.oshkina.demo5;

/**
 * Объект как аргумент и результат метода
 */
public class MyClass {
    //Целочисленное поле
    int code;

    //Метод для отображения значения поля:
    void show() {
        System.out.println("Поле:" + code);
    }

    //Конструктор с одним аргументом
    MyClass(int n) {
        code = n;
    }

    //Конструктор создания копии
    MyClass(MyClass obj){
        code = obj.code;
    }

    //Результат метода и аргумент - объекты
    MyClass get(MyClass obj) {
        //Создание локального объекта
        MyClass temp = new MyClass(code);
        //Уточнение значения поля
        temp.code += obj.code;
        //результат метода
        return temp;
    }
}
