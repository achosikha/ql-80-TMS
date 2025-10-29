package lesson_10_objects_this.interf;

// Интерфейс, который имеет лишь ОДИН МЕТОД и поэтому называется ФУНКЦИОНАЛЬНЫМ
// ПРОВЕРЬ ЯВЛЯЕТСЯ ЛИ НИЖЕ ДАННЫЙ ИНТЕРФЕЙС ФУНКИОНАЛЬНЫМ
@FunctionalInterface
public interface ComparePerson {
    // У меня метод принимает переменную типа Person и возвращает логическое значение
    boolean compare(Person person);
}