package ru.oshkina.demo6;

//главный класс
public class Demo {
    //перегруженный метод
    static void change(int n) {
        System.out.println("Исходное значение переменной: " + n);
        //попытка изменение значение аргумента:
        n++;
        System.out.println("Конечное значение переменной: " + n);
    }

    static void change(MyClass obj) {
        System.out.println("Исходное значение переменной: " + obj.code);
        obj.code++;
        System.out.println("Конечное значение переменной: " + obj.code);
    }

    //главный метод
    public static void main(String[] args) {
        //переменная
        int code = 100;

        //Объект
        MyClass obj = new MyClass();
        obj.code = 200;

        //Попытка изменить аргумент метода
        System.out.println("До вызова метода: code=" + code);
        change(code);
        System.out.println("После вызова метода: code=" + code);

        System.out.println("До вызова метода: obj.code=" + obj.code);
        change(obj);
        System.out.println("После вызова метода: obj.code=" + obj.code);

        System.out.println("Еще одна попытка");
        change(obj.code);
        System.out.println("После вызова метода: obj.code=" + obj.code);
    }
}
