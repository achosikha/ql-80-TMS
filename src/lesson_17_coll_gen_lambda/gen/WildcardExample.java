package lesson_17_coll_gen_lambda.gen;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    // Метод, принимающий список элементов, наследующих от Number (Integer, Double и т.д.)
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num.doubleValue());
        }
    }

    // Метод, добавляющий Integer в список, который может содержать супертипы Integer (Number, Object)
    public static void addInteger(List<? super Integer> list) {
        list.add(42);  // Добавляем Integer
    }

    public static void main(String[] args) {
        // Пример с ? extends
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        printNumbers(intList);  // OK, Integer extends Number

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        printNumbers(doubleList);  // OK, Double extends Number

        // Пример с ? super
        List<Number> numberList = new ArrayList<>();
        addInteger(numberList);  // OK, Number - супертип Integer
        System.out.println("Добавлено в numberList: " + numberList.get(0));

        List<Object> objectList = new ArrayList<>();
        addInteger(objectList);  // OK, Object - супертип Integer
        System.out.println("Добавлено в objectList: " + objectList.get(0));
    }
}
