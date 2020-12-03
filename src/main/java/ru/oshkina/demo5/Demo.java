package ru.oshkina.demo5;

/**
 * Главный класс
 */
public class Demo {

    //метод для создания объекта
    static MyClass create(int n) {
        //Локальный объект
        return new MyClass(n);
    }

    //Гланый метод
    public static void main(String[] args) {
        //создание объектов
        MyClass a = new MyClass(100);
        MyClass b = new MyClass(a);
        MyClass c = create(200);
        MyClass d = a.get(c);
        //изменение значение поля
        a.code--;
        //отображение значения поля code
        a.show();
        b.show();
        c.show();
        d.show();
    }
}
