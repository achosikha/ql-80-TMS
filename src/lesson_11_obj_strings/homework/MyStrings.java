package lesson_11_obj_strings.homework;

import java.util.Scanner;

public class MyStrings {
    public static void main(String[] args) {
        // CODE
        realizationTwo();
    }

    // 1. Compare three Strings
    public static void compareStrings(){
        /*
        // Enter Strings and COMPARE
        String[] strings;

        System.out.print("How many Strings are you going to insert? ");
        strings = new String[getInput().nextInt()];
        System.out.println("Please, start entering strings.");

        for(int index = 0; index < strings.length; index++){
            System.out.print("String " + (index + 1) + ": ");
            strings[index] = getInput().nextLine();
        }

        // Взять каждый элемент и сравнить

        System.out.println("-".repeat(50));

         */

        System.out.print("Please, enter string: ");
        String str1 = getInput().nextLine();
        System.out.print("Please, enter string: ");
        String str2 = getInput().nextLine();
        System.out.print("Please, enter string: ");
        String str3 = getInput().nextLine();

        // str1 <= str?
        // str1 > str2, str1 == str?

        // STR1 > STR2, STR2 с STR3
        // STR1 ? STR3
        // STR2 ? (STR1 - STR3)
        String maximumLength = (str1.length() > str2.length()) ? str1 :
                (str1.length() == str2.length()) ? "STR1 EQUALS STR2" : str2;

        // WHAT IF? Я верну длину максимальную
        int tempMaxLength = (str1.length() > str2.length()) ? str1.length() :
                (str1.length() == str2.length()) ? str1.length() : str2.length();
        tempMaxLength = Math.max(tempMaxLength, str3.length());

        // STR1 = 5, STR2 = 6, STR3 = 4
        // temMaxLength = MAXIMUM_LENGTH

        System.out.println("Which String is bigger? " + maximumLength);

        // str1 > str2 (max, str1, min str2)
        // str1 > str2 -> str1 ? max ? str3
        // str1 == str2 -> str3 (str1/str2 ? str3)

        // Найменьшая строчка: min ? str3

        // int max, min
        // String[] values
        //
    }

    public static void realizationTwo(){
        System.out.println("Задача 1: Введите 3 строки:");
        String[] strings1 = new String[3];
        for (int i = 0; i < 3; i++) {
            strings1[i] = new Scanner(System.in).nextLine();
        }

        String shortest = strings1[0];
        String longest = strings1[0];
        for (String str : strings1) {
            if (str.length() <= shortest.length()) shortest = str;
            if (str.length() > longest.length()) longest = str;
        }

        System.out.println("Самая короткая строка: \"" + shortest + "\" (длина: " + shortest.length() + ")");
        System.out.println("Самая длинная строка: \"" + longest + "\" (длина: " + longest.length() + ")");
    }

    public static void realization(){
        String[] arr = new String[10]; // 10 - null x length

        // Son, father, son, dog - min - DOG (Dasha, Son)
        String minString = arr[0];
        String maxString = arr[0];

        for (String str: arr) {
            if (str.length() < minString.length()) minString = str;
            if (str.length() > maxString.length()) maxString = str;
        }

        System.out.println("Минимальная строка: " + minString + "\nДлина: " + minString.length());
        System.out.println("Максимальная строка: " + maxString + "\nДлина: " + maxString.length());
    }

    public static Scanner getInput(){
        return new Scanner(System.in);
    }
}
