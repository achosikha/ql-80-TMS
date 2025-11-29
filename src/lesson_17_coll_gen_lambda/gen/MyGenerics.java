package lesson_17_coll_gen_lambda.gen;

import java.util.Arrays;
import java.util.List;

// Создать ОБОБЩЕНИЕ, КОТОРОЕ ПРИНИМАЕТ ТОЛЬКО ЧИСЛА
// ДОБАВИТЬ МЕТОД, КОТОРЫЙ ПРИНИМАЕТ INTEGER
// ДОБАВИТЬ МЕТОД, КОТОРЫЙ ПРИНИМАЕТ НЕЦЕЛОСИЧЛЕННОЕ ЗНАЧЕНИЕ

public class MyGenerics {
    public static void main(String[] args) {
        // Сымитировать коллекцию
        // Что такое коллекция? Это специальный класс, который принимает тип, как параметр
        // Generics - ОБОБЩЕНИЯ

        // WildCard ?
        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        System.out.println("Total sum is:" + sumGeneric(list1));

        // Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

        System.out.print("Total sum is:" + sumGeneric(list2));
    }

    // ? Какое в рамках ЧИСЛА
    // super ТИП (super Integer): ! Byte, Short ! но МОЖНО Integer, Double, Long, Number
    private static double sumGeneric(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }

    private static void sumInteger(List<? super Integer> list)
    {
        for (var i : list) {
            System.out.println(i);
        }
    }

    public static void createGenericType(){
        UseGenerics<String> name = new UseGenerics<>("Archil");
        UseGenerics<Integer> age = new UseGenerics<>(36);
        UseGenerics<Double> weight = new UseGenerics<>(56.45);
        UseGenerics<Character> letter = new UseGenerics<>('A');
        UseGenerics<Person> archil = new UseGenerics<>(new Person("Archil", "Sikharulidze"));

        System.out.println(name.getT());
        System.out.println(age.getT());
        System.out.println(weight.getT());
        System.out.println(letter.getT());
        System.out.println(archil.getT());

        System.out.println("-".repeat(50));
        DoubleGenerics<String, String> keyValue = new DoubleGenerics<>("House", "Дом");
        DoubleGenerics<Integer, Character> intLetter = new DoubleGenerics<>(1, 'A');

        System.out.println(keyValue);
        System.out.println(intLetter);
    }

    public static void simulateArrayList(){
        GenericArrayList<Integer> values = new GenericArrayList<>(new Integer[]{1, 5, 19, 10});
        System.out.println(values);

        GenericArrayList<String> names = new GenericArrayList<>(new String[]{"Archil", "Vova", "Katya"});
        System.out.println(names);
    }

    public static void useNumberGeneric(){
        GenericWildCards<Number> number = new GenericWildCards<>(100);
        GenericWildCards<Integer> integer = new GenericWildCards<>(-198);
        GenericWildCards<Double> doubleD = new GenericWildCards<>(100D);
        GenericWildCards<Float> floatF = new GenericWildCards<>(100F);

        System.out.println(number);
        System.out.println(integer);
        System.out.println(doubleD);
        System.out.println(floatF);

        FruitGeneric<Fruits> fruit = new FruitGeneric<>(new Fruits("Fruit"));
        FruitGeneric<Apple> apple = new FruitGeneric<>(new Apple("Apple"));
        FruitGeneric<Orange> orange = new FruitGeneric<>(new Orange("Orange"));
        System.out.println(fruit);
        System.out.println(apple);
        System.out.println(orange);
    }
}