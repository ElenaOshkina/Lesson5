package ru.oshkina.demo7;

/**
 * Главный класс
 */
public class Demo {
    public static void main(String[] args) {
        //дерево объектов
        ObjectTree tree = new ObjectTree(4, 'A', 1);
        System.out.println("\tПроверка дерева объектов");
        //проверка структуры дерева объектов
        tree.firstReference.secondReference.firstReference.show();
    }
}
