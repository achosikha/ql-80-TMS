package lesson_19_updates;

import lesson_19_updates.defmethod.Person;
import lesson_19_updates.defmethod.DefaultImplementation;

import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        // Java 1.8 == Java 8
        // Java 1.25 == Java 25
        // Java 25
        String name = DefaultImplementation.getGeneralInformation();

        List.of("Archil", "Andrey", "Rita", "Dasha").forEach(e -> System.out.println("Your name is: " + e));

        System.out.println(List.of(11, 99, -6, 10, 0, -1, -7, 15, 10, 56, 9, -100, 4, 5).
                            stream().
                            filter(element -> element > 0). // elements > 0
                            filter(element -> element > 10). // elements > 10
                            count());

        System.out.println(List.of(11, 99, -6, 10, 0, -1, -7, 15, 10, 56, 9, -100, 4, 5).
                            stream().
                            filter(element -> element > 0). // elements > 0
                            filter(element -> element > 10). // elements > 10
                            toList());

        System.out.println("-".repeat(80));

        filterByGenderAndSalary();

        System.out.println("-".repeat(100));
        useMapAPIStream();
        useJoin();
    }

    public static void filterByGenderAndSalary(){
        // Female
        // > 2000 USD
        List<Person> female = List.of(new Person("Archil", "Sikharulidze", "Male", 2000),
                        new Person("Jessica", "Simpson", "Female", 1500),
                        new Person("John", "Wilson", "Male", 2500),
                        new Person("Jennifer", "Kingston", "Female", 2340),
                        new Person("Kristina", "Ivanova", "Female", 2001),
                        new Person("Katya", "Kotaeva", "Female", 1980)).
                        stream().
                        filter(person -> person.getGender().equals("Female")).
                        toList();
        System.out.println("Get all female workers.");
        female.forEach(System.out::println);

        List<Person> femaleHighSalary = List.of(new Person("Archil", "Sikharulidze", "Male", 2000),
                        new Person("Jessica", "Simpson", "Female", 1500),
                        new Person("John", "Wilson", "Male", 2500),
                        new Person("Jennifer", "Kingston", "Female", 2340),
                        new Person("Kristina", "Ivanova", "Female", 2001),
                        new Person("Katya", "Kotaeva", "Female", 1980)).
                        stream().
                        filter(person -> person.getGender().equals("Female")).
                        filter(person -> person.getSalary() > 2000).
                        toList();
        System.out.println("Get all female workers with high salary, above 2000:");
        femaleHighSalary.forEach(System.out::println);
    }

    public static void useMapAPIStream(){
        List.of("Archil", "Andrey", "dasha", "katya", "rita").
                stream().
                sorted().
                map(String::toUpperCase). // Позволяет обратиться к методу для каждого элемента
                toList().
                forEach(System.out::println);
    }

    public static void useJoin(){
        // Динамическая строчка тогда используем StringBuilder
        String joined = String.join(":", "Archil", "Natasha", "Jenya", "Yulia");
        System.out.println(joined);
    }
}
