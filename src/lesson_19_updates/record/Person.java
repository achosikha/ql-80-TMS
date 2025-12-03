package lesson_19_updates.record;

// record используется специально для сохранения времени и пространства
// когда нужен просто базовый класс, никакие серьезные классы не пишутся через record
// NEW
// Methods can be added, но тогда надо задуматься не стоит ли использовать стандартный класс == LOMBOK
public record Person(String name, String surname, int age) {}

// OLD
class ITStaff{
    private final String name;
    private final String surname;
    private final int age;

    ITStaff(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}