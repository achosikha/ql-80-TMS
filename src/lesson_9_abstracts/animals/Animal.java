package lesson_9_abstracts.animals;

// OOP - encapsulation, inheritance, polymorphism
// OOP - ABSTRACTION
// 00001100 -> int ap8
// int, void, temp - C
// C++ - Java -> Python, JS

// abstract говорит компилятору - этот класс ЛИШЬ ШАБЛОН
// ЕГО НЕЛЬЗЯ ИСПОЛЬЗОВАТЬ ДЛЯ СОЗДАНИЯ НЕПОСРЕДСТВЕННО ЭКЗЕМПЛЯРА КЛАССА
public abstract class Animal {
    private final String name;
    private final String type;
    private final int born;

    public Animal(String name, String type, int born) {
        this.name = name;
        this.type = type;
        this.born = born;
    }

    // Абстрактный метод может быть ЛИШЬ в АБСТРАКТОМ КЛАССЕ НИКАК ПО-ДРУГОМУ
    // абстрактны метод не может иметь тело в абстрактом классе
    // оно просто объявляется и передается на выполнение НЕ АБСТРАКТНЫМ КЛАССАМ
    public abstract void makeNoise();

    public final void getAnimalMsg(){
        System.out.println("This is an ANIMAL TREE that contains only those animals who can make NOISE.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", born=" + born +
                '}';
    }
}
