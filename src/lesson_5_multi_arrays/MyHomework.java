package lesson_5_multi_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MyHomework {
    public static void main(String[] args) {
        // CODE
        setNewValuesArray();
    }

    public static void setNewValuesArray() {
        /*
        Имеется массив из неотрицательных чисел(любой). Представьте что массив
        представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        содержит нуля в начале, кроме самого числа 0.

        Пример:
            Input: [1,4,0,5,6,3] -> 140_563 + 1 = 140_564
            Output: [1,4,0,5,6,4]

            Input: [9,9,9] -> 999 + 1000
            Output: [1,0,0,0] -> {1, 0, 0, 0}

            ЦЕЛЫЕ ПОЛОЖИТЕЛЬНЫЕ ЧИСЛА В МАТЕМАТИКЕ - 0 по 9
         */

        // Algorithms:
        // 1. Мы создаем сами массив без права пользователю вводить самостоятельно числа
        // 2. Создаем массив из любых значений - неотрицательных
        Scanner scanner = new Scanner(System.in);

        // 1. Я создаю цикл, который позволит мне N раз ввести целое число в массив
        // 2. Должна быть проверка на отрицатальность - если число отрицательное, тогда заново введи его
        // 3. Первый элемент не может быть - 0

        int value;

        // Какой длины должен быть ваш массив?
        System.out.print("Какой длины массив вы будете вставлять? ");
        int length = scanner.nextInt();

        int[] values = new int[length];

        for (int index = 0; index < values.length; ){
            System.out.print("Введите любое положительное число, 0 включительно: ");
            if ((value = scanner.nextInt()) < 0 || value > 9 || index == 0 && value == 0){
                System.out.println("Вы ввели неправильное значение! Или же попытались ввести первое число 0.");
                continue;
            }
            values[index] = value;
            index++;
        }

        // Arrays -> toString() - строковое представление массива
        System.out.println("You have entered the following array: " + Arrays.toString(values));

        // Если последнее ЧИСЛО не ЯВЛЯЕТСЯ 9
        // Тогда просто добавь последнему элементы массива 1
        if (values[values.length - 1] != 9) {
            values[values.length - 1] = values[values.length - 1] + 1;
        } else {
            // CODE
            // 19 + 1 = 20 -> ПРОВЕРИТЬ А ЧИСЛО ТО КАКОЕ????
            // 199 + 1 = 200
            // 999 + 1 = 1_000 + 1 элемент добавить МАССИВУ
            // 19_999 + 1 = 20_000

            // Проверить САМО ЧИСЛО ? Если оно переходит уже в другую систему, тогда ОДИН ЭЛЕМЕНТ +
            // Если же нет = ТОГДА ПРОСТО УВЕЛИЧИТЬ
            System.out.println("You should create new array with ONE element added and values changed!");
        }

        System.out.println("You have added 1 to the last element of your array: " + Arrays.toString(values));
        String strValue = Arrays.toString(values);
        System.out.println(strValue);

        String strValueConcat = "";
        for (int index = 0; index < values.length; index++){
            strValueConcat = strValueConcat + values[index];
        }
        System.out.println(strValueConcat);
        int valueFromString = Integer.parseInt(strValueConcat);
        System.out.println(valueFromString);
    }
}
