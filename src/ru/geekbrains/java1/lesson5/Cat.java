package ru.geekbrains.java1.lesson5;

public class Cat {
    String name;
    String color;
    int weight;

    public Cat(String _name, String _color, int _weight) {
        name = _name;
        color = _color;
        weight =_weight;
    }
    public Cat(String _name, int _weight) { //Т.н. Перегрузка конструктора - для разных вариантов неполного ввода информации в конструктор
        name = _name;
        color = "Неизвестно";
        weight =_weight;
    }
    public Cat (int _weight) {
        name = "Неизвестно";
        color = "Неизвестно";
        weight =_weight;
    }
    public Cat () {
        name = "Неизвестно";
        color = "Неизвестно";
        weight = 1;
    }

    public void voice() { //метод с пом. которого Кот мяукает
        System.out.println(name + " Мяяяу!!!");
    }

    public void run () { //метод с пом. которого Кот бегает
        System.out.println(name + " бежит");
    }

    public void info() { //метод информирования об объекте
        System.out.println(name + " " + color + " " + weight);
    }
}
