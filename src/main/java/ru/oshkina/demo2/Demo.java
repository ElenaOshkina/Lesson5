package ru.oshkina.demo2;

/**
 * Главный класс
 */
public class Demo {
    public static void main(String[] args) {
        //Создание объекта
        MyClass obj = new MyClass();
        //Операция с объектом
      //  obj.set( 'A', 100);
        obj.show();
        obj.set(200);
        obj.show();
        obj.set('B');
        obj.show();
        //Используется автоматическое приведение типа
        obj.set('A', 'D');
        obj.show();
    }
}
