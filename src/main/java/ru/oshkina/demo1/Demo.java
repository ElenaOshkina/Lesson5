package ru.oshkina.demo1;

public class Demo {
    public static void main(String[] args) {
        //Создание объекта
        MyClass obj = new MyClass();
        //Операции с объектом
        obj.set();
        obj.show();
        obj.set(111, 222);
        obj.show(false);
        obj.show(true);
        obj.set(123);
        obj.show();
    }
}
