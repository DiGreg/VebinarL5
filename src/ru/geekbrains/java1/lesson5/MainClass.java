package ru.geekbrains.java1.lesson5;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "white", 5);
        Cat cat2 = new Cat("Мурзик",  7);

        cat1.info();
        cat2.info();
        cat1.run();
        cat2.voice();
    }
}
