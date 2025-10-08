package lesson_4_oper_array;

import java.util.Random;
import java.util.Scanner;

public class MyOperatorsMore {
    public static void main(String[] args) {
        // CODE
        useMathLibrary();
    }

    public static void useMathLibrary(){
        // Class Math - библиотека для математических операций
        // Math.____
        // Math.floor() - округляет число правильно, что с обойх сторон возможность округления было равным
        // Math.round() - округляет тупо, по простому 4.567 - 4.6
        // Math.random() - случайное число, но возвращает тип double - 0.01 по 0.9999
        // Надо знать формулу, которая будет возвращать уже целочисленное значение

        // ПОСМОТРЕТЬ: int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        for (int counter = 1; counter <= 10; counter++){
            System.out.println((int) (Math.random() * 10)); // А что если я хочу: от 101 по 201 ???
        }

        System.out.println("-".repeat(50));

        // Random
        Random number = new Random();

        for (int counter = 1; counter <= 10; counter++){
            System.out.println("Random number: " + number.nextInt(1, 11)); // 1 - 10
        }

        System.out.println();

        // Math.pow(?, ?)
        // Math.sqrt(?)
        for (int value = 10; value <= 100; value += 10){
            System.out.println("Sqrt(" + value + "): " + Math.sqrt(value)); // 10 to 20
        }
    }

    public static void getWeekDay(){
        Scanner input = new Scanner(System.in);
        int day = 0;
        int duplicate = -10;

        // Проверка ввода одного и того же дня два раза подряд
        while (true){
            while(true){
                System.out.print("Please, enter a digital representation of a week day (1-7), enter -1 to exit: ");
                day = input.nextInt();

                if (day > 0 && day < 8 || day == -1){
                    break;
                } else {
                    System.out.println("You have entered a WRONG VALUE!");
                }
            }

            if (duplicate == day){
                System.out.println("YOU HAVE ALREADY ENTERED SUCH NUMBER BEFORE. GOODBYE!");
                return;
            }

            // duplicate -> сохранить КАЖДОЕ введенное число
            // 1, duplicate == 1, 5, duplicate == 5...
            // Array - String letter = letter + day, 1-5-6
            // char -> '5' + '1' + '2'
            // String -> массив символов
            // if(...) else {}
            // String - array

            // array[1000] -> array[1000] -> extends array[2000]
            duplicate = day;

            if (day == 1){
                System.out.println("Today is MONDAY.");
            } else if (day == 2){
                System.out.println("Today is TUESDAY.");
            } else if (day == 3){
                System.out.println("Today is WEDNESDAY.");
            } else if (day == 4){
                System.out.println("Today is THURSDAY.");
            } else if (day == 5){
                System.out.println("Today is FRIDAY.");
            } else if (day == 6){
                System.out.println("Today is SATURDAY.");
            } else if (day == 7){
                System.out.println("Today is SUNDAY.");
            } else if (day == -1){
                System.out.println("YOU HAVE ENTERED -1 - EXIT. GOODBYE!");
                return;
            } else {
                System.out.println("THERE IS NO SUCH DAY IN A WEEK!");
            }

            day = 0;
        }
    }

    public static void useStringSwitch(){
        // MON to FRI - дни рабочие
        // SAT to SUN - выходные
        // if (....)...
        String weekDay = "SAT";

        // ОБНОВЛЕННАЯ КОНСТРУКЦИЯ switch
        switch (weekDay){
            case "MON", "TUE", "WEN", "THU", "FRI" -> {
                System.out.println("THESE ARE WORKING DAYS!");
                System.out.println("Welcome to MODERN SWITCH.");
            }
            case "SAT", "SUN" -> System.out.println("DAY OFF!");
            default -> System.out.println("NO SUCH DAY!");
        }

        /*
        switch (weekDay){
            case "MON":
            case "TUE":
            case "WEN":
            case "THU":
            case "FRI":
                System.out.println("THESE ARE WORKING DAYS!");
                break;
            case "SAT":
            case "SUN":
                System.out.println("DAY OFF!");
                break;
            default:
                System.out.println("There is no such day in a week.");
                break;
        }
         */
    }

    public static void useSwitchWeekDay(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter a digital representation of a week day (1-7), enter -1 to exit: ");
        int day = input.nextInt();

        // switch()
        switch (day){
            case 1:
                System.out.println("Today is MONDAY.");
                break;
            case 2:
                System.out.println("Today is TUESDAY.");
                break;
            case 3:
                System.out.println("Today is WEDNESDAY.");
                break;
            case 4:
                System.out.println("Today is THURSDAY.");
                break;
            case 5:
                System.out.println("Today is FRIDAY.");
                break;
            case 6:
                System.out.println("Today is SATURDAY.");
                break;
            case 7:
                System.out.println("Today is SUNDAY.");
                break;
            default:
                System.out.println("There is no such day in a week.");
                break;
        }
    }

    public static void useBrackets(){
        boolean isEmployed = true;
        boolean isAdult = true;

        // if (____) - автоматом проверяет на ИСТИНУ
        if(isEmployed){ // isEmployed == (isEmployed == true)
            System.out.println("You are not EMPLOYED!");
        }

        if (!isAdult){ // !isAdult == (isAdult == false) -> ! НЕ
            System.out.println("You are NOT AN ADULT!");
        }

        int age = 36;

        if (age >= 36) {
            // без { он ответом воспринимает только дальнейшую первую строчку, остальное как просто код
            System.out.println("Your age is above or equals 36: " + age);
            System.out.println("И это строчка также является частью ответа на логический вопрос.");
        }
    }

    public static void useContinueKeyWord(){
        // Я хочу сделать - ПРОПУСК ИТЕРАЦИИ, пропуск одного шага цикла
        for(int counter = 1; counter < 11; counter++){
            if (counter == 4 || counter == 8) continue; // continue - заставляет цикл пропустить один раз тело
            System.out.println("Counter: " + counter);
        }
    }

    public static void drawTable(){
        for(int rows = 0; rows < 3; rows++){
            for(int cols = 0; cols < 3; cols++){
                if (cols == 2) break;
                System.out.print("*\t"); // \t - табуляция
            }
            System.out.println();
        }
    }

    public static void useKeyPoints(){
        // Чтобы сломать что-то изнутри у нас два ключевых слова - break, return
        for(int counter = 1; counter < 6; counter++){
            System.out.println("Counter: " + counter);
        }

        System.out.println("-".repeat(50));

        for(int counter = 1; ; counter++){
            if(counter == 6) break;
            System.out.println("Counter: " + counter);
        }

        System.out.println("CODE AFTER keyword - break.");

        System.out.println("-".repeat(50));

        for(int counter = 1; ; counter++){
            if(counter == 6) return;
            System.out.println("Counter: " + counter);
        }

        // System.out.println("THIS CODE WON'T BE AVAILABLE!"); - ПОСЛЕ ключевого слова return вы захлопываете ВЕСЬ
        // МЕТОД. Это ключевое слово убивает МЕТОД полностью.
    }

    public static void localVariables(){
        // Блок или ареал видимости
        // Local variables

        // Java - GLOBAL VARIABLES, НЕТ ПОНЯТИЯ ГЛОБАЛЬНЫХ ПЕРЕМЕННЫХ
        // Есть ПЕРЕМЕННЫЕ УРОВНЯ КЛАСС и есть ЛОКАЛЬНЫЕ ПЕРЕМЕННЫЕ

        // String name, int age - принадлежат методу, создаются только когда вызывается метод, и умирают,
        // вместе с методом
        String name = "Archil";
        int age = 36;

        // СОЗДАЙ МНЕ ВНУТРИ МЕТОДА ЕЩЕ ОТДЕЛБНОЕ ЛОКАЛЬНОЕ ПРОСТРАНСТВО
        // ТАМ ПРОВЕДИ ОПЕРАЦИИ, А ПОТОМ ЗАХЛОПНИСЬ
        {
            // String name = "Vova";
            String surname = "Sikharulidze";
            System.out.println(age);
            System.out.println(surname);
        }

        // System.out.println(surname); - surname был удален после того, как кавычка закрылась
    }

    public static void useScanner(){
        Scanner input = new Scanner(System.in); // in -> позволь ввести с клавиатуры
        int value = input.nextInt();

        input.close(); // Убей ресурс, который связывает мою программу с клавиатурой
    } // JVM сам закроет ваш ресурс, поскольку он в одном экземпляре, уровень метод, а в Джаве все вещи созданные
    // в методе захлопываются
}