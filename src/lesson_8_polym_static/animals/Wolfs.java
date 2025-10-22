package lesson_8_polym_static.animals;

// final в описании класса ЗАПРЕЩАЮТ ОТ НЕГО НАСЛЕДОВАТЬСЯ
public final class Wolfs extends Animal{
    public Wolfs(String type, String color, int age, double weight, String sex) {
        super(type, color, age, weight, sex);
    }
}
