package lesson_16_collections_more;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        // Set - УНИКАЛЬНОСТЬ ЗНАЧЕНИЙ
        useBasicSet();
    }

    public static void useBasicSet(){
        // !!! HASH !!! - УНИКАЛЬНОЕ ЧИСЛОВОЕ ЗНАЧЕНИЕ ОБЪЕКТА
        HashSet<String> names = new HashSet<>();
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        TreeSet<Character> letters = new TreeSet<>();

        // TRUE || FALSE
        // 1. Только уникальное значения
        System.out.println(names.add("Archil"));
        System.out.println(names.add("Natalia"));
        System.out.println(names.add("Andrey"));
        System.out.println(names.add("Vadim"));
        System.out.println(names.add("Yulia"));
        System.out.println(names.add("Johnny"));
        System.out.println(names.add("Jack"));
        System.out.println(names.add("Jack")); // false ALREADY EXISTS

        // 2. Нарушен ПОРЯДОК ВСТАВКИ !!! ЗАВИСИТ ОТ РАСПРЕДЛЕНИЯ УНИКАЛЬНОГО ЗНАЧЕНИЯ ВАШЕГО ОБЪЕКТА
        System.out.println(names);

        // 3. Если у меня не сохраняется порядок вставки элементов, то на что это также указывает? НЕТ ИНДЕКСОВ
        names.forEach(System.out::println);
        System.out.println(names.contains("Archil"));

        System.out.println("------------------------LINKED HASH SET");
        System.out.println(numbers.add(100));
        System.out.println(numbers.add(-1));
        System.out.println(numbers.add(0));
        System.out.println(numbers.add(-1)); // Не дает возможности повтора значений
        System.out.println(numbers.add(-5));
        System.out.println(numbers.add(101));
        System.out.println(numbers.add(-78));

        // ПОСЛЕДОВАТЕЛЬНО ОСТАЛАСЬ ! LINKED - должен вам подсказать, что ЕСТЬ КОЕ-КАКИЕ АДРЕСА
        // АДРЕС ПЕРВОГО И ПОСЛЕДНЕГО ЭЛЕМЕНТА
        System.out.println(numbers);
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        // SortedSet
        // Дубликаты не допускаются
        System.out.println(letters.add('J'));
        System.out.println(letters.add('h'));
        System.out.println(letters.add('a'));
        System.out.println(letters.add('a'));
        System.out.println(letters.add('K'));
        System.out.println(letters.add('w'));
        System.out.println(letters.add('A'));

        // ОТСОРТИРОВАН
        // Есть адреса на первый и последний элементы
        System.out.println(letters);
        letters.pollFirst(); // Удалить первое
        letters.pollLast(); // Удалить последнее
    }

    // Словарь - Key - Value (Дом - House)
}
