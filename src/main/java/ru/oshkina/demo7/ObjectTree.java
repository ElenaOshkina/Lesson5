package ru.oshkina.demo7;

/**
 * Класс для реализации бинарного дерева
 */
public class ObjectTree {
    //количество цифр в id-коде объекта
    private static final int ID_LENGTH = 8;

    //уровень объекта (буква)
    private final char level;

    //номер объекта на уровне
    private final int number;

    //код объекта (массив цифр)
    private int[] id;

    //ccылка на первый объект
    ObjectTree firstReference;

    //ccылка на второй объект
    ObjectTree secondReference;

    //Метод для генерирования id-кода объекта
    private void getId() {
        id = new int[ID_LENGTH];
        for (int i = 0; i < ID_LENGTH; i++) {
            id[i] = (int) (Math.random() * 10);
        }
    }

    //конструктор для создания бинарного дерева
    ObjectTree(int k, char l, int n) {
        System.out.println("\tСоздан новый объект");
        level = l;
        number = n;
        getId();
        show();
        if (k == 1) {
            firstReference = null;
            secondReference = null;
        } else {
            //рекурсивный вызов конструктора
            firstReference = new ObjectTree(k - 1, (char) (l + 1), 2 * n - 1);
            secondReference = new ObjectTree(k - 1, (char) (l + 1), 2 * n);
        }
    }

    //метод для отображения id-кода объекта
    private void showId() {
        for (int i = 0; i < ID_LENGTH; i++) {
            System.out.print("|" + id[i]);
        }
        System.out.print("|");
    }

    //метод для отображения параметров объекта
    void show() {
        System.out.println("Уровень объекта: \t" + level);
        System.out.println("Номер на уровне: \t" + number);
        System.out.println("ID-код объекта: \t");
        showId();
    }
}
