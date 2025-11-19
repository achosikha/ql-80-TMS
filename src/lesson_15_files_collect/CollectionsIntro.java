package lesson_15_files_collect;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionsIntro {
    public static void main(String[] args) {
        // Collections
        // List - список
        // Set - данность
        // Queue - очередь
        int age = 36;
        String name = "Archil";

        int[] numbers = {1, 0, 100, 19};

        IT[] staff = new IT[]{
                new IT("Java"),
                new IT("Python"),
                new IT("C#")
        };

        createList();
    }

    // Collections
    public static void createList(){
        // List - список
        // Это по сути концепция МАССИВА, только его можно расширять и сужать

        // БАНАЛЬНО РАСШИРЯЕМЫЕ МАССИВ
        // int -> Integer, boolean -> Boolean, char -> Character, float -> Float...
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-1);
        numbers.add(100);
        System.out.println(numbers);

        for(int index = 0; index < numbers.size(); index++){
            System.out.println(numbers.get(index));
        }

        numbers.remove(0);

        System.out.println(numbers);

        // LinkedList
        LinkedList<String> names = new LinkedList<>(Arrays.asList("Archil", "Andrey", "Yulia", "Dasha", "Vova"));

        System.out.println(names);
        names.add("Masha");
        names.add("Ilya");
        System.out.println(names);

        for(var el : names){
            System.out.printf("Name: %s.\n", el);
        }
    }

    public static void useSet(){
        // List - это список,
        // А вот Set - данность
        // НЕТ ИНДЕКСАЦИИ
        // Хранятся данные по другому формату - это не банальный массив или что-то типа массива
        // HashSet, LinkedHashSet, TreeSet
        HashSet<String> hastSetNames = new HashSet<>();
        TreeSet<Boolean> booleans = new TreeSet<>();
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
    }
}

class IT{
    private final String occupation;

    IT(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "IT{" +
                "occupation='" + occupation + '\'' +
                '}';
    }
}
