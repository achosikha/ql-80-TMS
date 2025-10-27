package lesson_9_abstracts;

import lesson_9_abstracts.cars.*;

import java.util.Scanner;

public class MyJava {
    // Модификаторы - доступа, модифицирует право внешних объектов получать доступ, public, private,
    // protected, package-private

    // Арифметические операторы - +, -, * ...
    // Условные операторы - if, else if, switch
    // Бинарные - <<, >> -> 00000000 (0) -> 00000010 (2)

    // this, static, void -> просто КЛЮЧЕВЫЕ СЛОВА
    // if, else, switch - ТОЖЕ КЛЮЧЕВЫЕ СЛОВА
    public static void main(String[] args) {
        // CODE

        /*
        System.out.print("Please, enter an option from 1 to 3 or 4 for a general: ");
        int option = new Scanner(System.in).nextInt();

        Cars car = switchExpressionFabricMethod(option);
        System.out.println(car);
         */

        // useVarArgs(new String[]{"Archil"...})
        useVarArgs("Archil", "Vasily", "Darya", "Natalya", "...");
        System.out.println("-".repeat(50));
        useVarArgs(28.9, 36, -9, 10, 111, 0, -1);
    }

    // variable arguments -> varargs - массив неопределенной длины
    // имя_типа... название_переменной - я сейчас передам тебе целую цепочку переменных типа String
    // Возьми их и преврати в одномерный массив
    // 1. Нельзя массив переменной длины вставлять в начало или в середине вместе с другими переменными
    // 2. Одно должно быть или одно в списке или же в конце
    public static void useVarArgs(int value, String... names){
        System.out.println(value);
        for(String name : names){
            System.out.println(name);
        }
    }

    public static void useVarArgs(double value, int age, int... numbers){
        System.out.println(value);
        System.out.println(age);
        for (int number : numbers){
            System.out.println(number);
        }
    }

    public static void useVarArgs(String... names){ // String[] names
        // Java все массивы определенной длины
        for(String name : names){
            System.out.println(name);
        }
    }

    public static Cars switchExpressionFabricMethod(int option){
        // Cars
        return switch (option){
            case 1 -> new BMW("BMW", 2022);
            case 2 -> new Mercedes("Mercedes", 2019);
            case 3 -> new Opel("Opel", 2011);
            default -> new Cars("Unknown", 0);
        };
    }

    public static Object switchExpressionFabricMethodObject(int option){
        // Cars
        return switch (option){
            case 1 -> new BMW("BMW", 2022);
            case 2 -> new Mercedes("Mercedes", 2019);
            case 3 -> new Opel("Opel", 2011);
            default -> new Cars("Unknown", 0);
        };
    }

    public static void useBreakAsGoto(){
        boolean isLabel1 = false;

        label1: {
        label2:{
            label3:{
            for (int index = 1; ; index++){
                System.out.println("This is label 3: " + index);
                if (index == 5) break label2; // goto - NEVER USER
            }
            }
            }
            System.out.println("You came to LABEL 1");
        }
    }

    // JDK stabilized 14
    // LTS - long-term support - ВСЕ ЧТО ЗДЕСЬ больше не удаляется, но может быть DEPRECATED
    // STS - short-term support ПРОСТО ДЛЯ ТЕСТИРОВАНИЕ МОЖЕТ БЫТЬ УДАЛЕНО
    // switch expression - yield чтобы вернуть БЛОК
    public static String getSwitchExpression(String msg){
        return switch (msg){
            case "JAVA" -> "JAVA - OAK";
            case "KOTLIN" -> "KOTLIN - ANDROID";
            case "ORACLE" -> "JAVA";
            default -> "No such value";
        };
    }
}