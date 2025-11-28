package lesson_16_collections_more;

import java.util.*;

public class MyList {
    public static void main(String[] args) {
        // List
        // Wrappers
        // ArrayList
        // LinkedList
        useLinkedList();

        // !!!! ПОСМОТРЕТЬ, ПРОЧИТАТЬ, не переживать - Big(O) нотация java
        // То сколько ВРЕМЕНИ и ПАМЯТИ ПРИШЛОСЬ ПОТРАТИТЬ НА ТО ИЛИ ИНОЕ ДЕЙСТВИЕ
    }

    public static void useLinkedList(){
        LinkedList<Character> letters = new LinkedList<>(Arrays.asList('A', 'b', 'c', 'c', 'd', 'R', 'K'));

        System.out.println(letters);

        // LinkedList - СВЯЗАННЫЙ СПИСОК
        for (int index = 0; index < letters.size(); index++){
            System.out.println(letters.get(index));
        }
    }

    public static void useWithArrayList(){
        ArrayList<Number> numbers = new ArrayList<>(Arrays.asList(19, 0, 1, -1, 0));
        numbers.add(8);
        numbers.add((numbers.size() / 2) - 1, 111);

        System.out.println(numbers);
    }

    public static void basicListRules(){
        // List - WHAT DOES IT MEAN?
        // Это по сути - расширяемые список/массив
        // Он ничем особенным не выделяется, кроме того, что может более эффективно сокращаться или увеличиваться
        // Один тип на один контейнер
        // У нас есть индексация
        // Если есть индексы, значит ПОРЯДОК ВСТАВКИ ЭЛЕМЕНТОВ СОХРАНЯЕТСЯ
        // Есть длина - количество элементов, которые присутствуют в контейнере
        // Array - length() == List - size()
        // Как и в массиве - НЕТ ОГРАНИЧЕНИЙ НА ЛЮБЫЕ ЗНАЧЕНИЯ В РАМКАХ УКАЗАННОГО ТИПА
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(19, 0, 1));
        numbers.add(0);
        numbers.add(14);
        numbers.add(21);
        numbers.add(-1);
        numbers.add(100);

        System.out.println(numbers.getFirst());

        // array[array.length - 1] == numbers.getLast()
        System.out.println(numbers.get(0));

        System.out.println(numbers);
        System.out.println(numbers.size());

        // ArrayList names -> 100 elements
        // ArrayList names = 10, STOP -> extend memory + 10... repeat...
        // ArrayList[100] names - FULL CAPACITY
        // SIZE -> сколько непосредственно памяти - ЭЛЕМЕНТОВ ДОБАВЛЕНЫ
        // Capacity - 100, size -> 80, ОН СРОЧНО НЕ ПОЗВОЛЯЯ ВАМ ДОЙТИ ДО ГРАНИ ВАШЕГО РАСШИРЯЕМОГО МАССИВА
        // ВИДЕЛИТ ЕЩЕ ПАМЯТЬ С ЗАПАСКОЙ, изначальная память * 1.2...
        // Capacity 100, SIZE 80, capacity * 1.2 = 130

        System.out.println("-".repeat(50));

        ArrayList<String> names = new ArrayList<>(
                Arrays.asList(
                        "Archil",
                        "Dasha",
                        "Masha",
                        "Yulia"
                ));

        names.forEach(name -> System.out.println("Name: " + name));
    }

    // ПОДАВИТЬ ЛЮБЫЕ НЕЖЕЛАЕМЫЕ УКАЗАНИЯ И ПОДСКАЗКИ КОМПИЛЯТОРА
    @SuppressWarnings("removal")
    public static void createList(){
        // List
        // Wrappers - обертки

        // Чтобы указать тип данных, которые мы вложим в контейнер нужен КЛАСС
        // <_CLASS> - int, byte ARE NOT CLASSES
        // Primitive type class WRAPPER - обертка примитивного типа int - Integer

        // Object -> Boolean, Character, Number (Integer, Byte, Short, Double, Float)
        List<Integer> integerList = List.of(12, 5, 10, 11);
        List<Double> doubleList = List.of(12D, 5D, 10D, 11D); // 12, 5, 10, 11 - ERROR, 12.0, 5.0, 10.0, 11.0
        List<Character> characterList = List.of('a', 'b', 'c', 'd', 'e');

        // List<Integer, Double, Float, Byte, Short, Long>
        // Number - означает ВСЕ, ЧТО ЕСТЬ ЧИСЛО
        List<Number> numberList = List.of(13, 14.5, 1, 0);

        // Wrapper - обертка класса
        boolean inProgress = true;
        int age = 36;

        Boolean isWorking = new Boolean(true);
        Boolean isWalking = false;
        Integer ageWrapper = new Integer(45);
        Integer ageWrapperNoNew = 45;

        for (int el = 0; el < integerList.size(); el++){
            System.out.println(integerList.get(el));
        }

        System.out.println("-".repeat(50));
        characterList.forEach(System.out::println); // System.out.println(el)
        System.out.println("-".repeat(50));

        // Double == double
        for (double el : doubleList){
            System.out.println("Double: " + el);
        }
    }

    public static void createConstList(){
        // КОНСТАНТА - ЕЕ НЕЛЬЗЯ РАСШИРЯТЬ!

        // ПО СУТИ - ЭТО МАССИВ, можно свободно заменить
        List<String> names = List.of("Archil", "Andrey", "Nikita", "Dasha", "Masha");
        names.forEach(e -> System.out.println("Name: " + e));

        names.add("Nikita"); // ERROR
        names.remove(0); // ERROR
    }

    public static void createArrayListOnList(){
        List<String> names = new ArrayList<>(Arrays.asList("Archil", "Vanya", "Johnny"));

        names.forEach(name -> System.out.println("Name: " + name));
        names.add("Rita");
        names.add("Nikita");
        System.out.println("-".repeat(50));
        names.forEach(name -> System.out.println("Name: " + name));

        // В чем отличие: List<String> ... = new ArrayList() vs. ArrayList<String> ... = new ArrayList()
        ArrayList<String> arrayOfNames = new ArrayList<>();

        // Animal (data, functions) -> Lion (data, functions) -> BlackLions (data, functions)
        // Animal lion = new Lion() -> data & functions from ANIMAL
        // BlackLions lions = new BlackLions() -> ALL DATA AND FUNCTIONS FROM ALL INHERITED CLASSES
    }

    public static void createArrayList(){
        // ArrayList
    }

    public static void createLinkedList(){
        // LinkedList
    }

    public static void createVector(){
        // Vector не используется в современном Джаве с 1.2
        // Официально, устаревший подход, ключевое слово synchronized
        // Вместо него - ArrayList
        Vector<String> names = new Vector<>();
        names.add("Archil");
        names.add("Archil");
        names.add("Archil");
        names.add("Archil");
        names.add("Archil");

        names.forEach(System.out::println);
    }

    public static void createStack(){
        // Officially had been replaced by DEQUE from SET
        Stack<String> names = new Stack<>();
        names.add("Archil");

        names.forEach(System.out::println);
    }
}
