package lesson_3_operators;

import java.util.Scanner;

public class MyOperators {
    public static void main(String[] args) {
        // CODE
        getLoop();
    }

    //  Я хочу позволить моему пользователю ввести значение с клавиатуры
    // Сохранить это значение целочисленное в переменной и вывести на экран
    public static void getIntegerValue(){
        // Scanner позволяет вводить значение с клавиатуры
        Scanner input = new Scanner(System.in); // Я создал объект типа Сканнер, который будет брать данные с клавы
        // Я прикрепил название переменной input к этому объекту
        System.out.print("Please enter an integer value: ");
        int value = input.nextInt();

        System.out.println("You have entered an integer value: " + value);
    }

    public static void compareName(){
        // Пусть пользователь введет с клавиатуры строчку - ИМЯ и сравнит введенное имя с вашим именем, который
        // будет хранится в локальной переменной
        String name = "Archil";
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter name to compare: ");
        String enteredName = input.nextLine();
        System.out.println("You have entered the name: " + enteredName);

        // == ТОЛЬКО ПРИМИТИВНЫЕ ТИПЫ
        // ЧТОБЫ СРАВНИТЬ СТРОЧКИ имя_строки.equals()
        // БЕЗ УЧЕТА РЕГИСТРА - equalsIgnoreCase()
        System.out.println("Does your name equal to a hidden one with REGISTER CHECK? " +
                name.equals(enteredName)); // false || true
        System.out.println("Does your name equal to a hidden one WITHOUT REGISTER CHECK? " +
                name.equalsIgnoreCase(enteredName)); // false || true
    }

    public static void compareAge(){
        // Введите ваш возраст, если он меньше 18 - вывести НЕСОВЕРШЕННОЛЕТНИЙ
        // Если он выше 18 до 65 - СОВЕРШЕННОЛЕТНИЙ
        // Если 65+ по 120 - ПЕНСИОНЕР
        // Если меньше 0 или больше 120 - НЕАДЕКВАТНЫЙ ВВОД

        // if, else if, switch
        System.out.print("Please enter your age. It must not be below 0 or above 120: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        /*

        if(age >= 0 && age < 18){
            System.out.println("Вам " + age + " лет. Вы НЕСОВЕРШЕННОЛЕТНИЙ.");
        }

        if (age >= 18 && age < 65){
            System.out.println("Вам " + age + " лет. Вы СОВЕРШЕННОЛЕТНИЙ.");
        }

        if (age >= 65 && age <= 120){
            System.out.println("Вам " + age + " лет. Вы ПЕНСИОНЕР.");
        }

        if (age > 120){
            System.out.println("Вам " + age + " лет. СТОЛЬКО ЛЮДИ НЕ ЖИВУТ.");
        }

        if (age < 0){
            System.out.println("ВАМ НЕ МОЖЕТ БЫТЬ МЕНЬШЕ 0!");
        }

         */

        boolean isMarried = false;

        if (age >= 0 && age < 18){
            System.out.println("Вам " + age + " лет. Вы НЕСОВЕРШЕННОЛЕТНИЙ.");
        } else if (age >= 18 && age < 65){
            System.out.println("Вам " + age + " лет. Вы СОВЕРШЕННОЛЕТНИЙ.");

            if (isMarried == true){
                System.out.println("Да, вы еще и состоится в ОФИЦИАЛЬНЫХ ОТНОШЕНИЯХ!");
            }
        } else if (age >= 65 && age <= 120){
            System.out.println("Вам " + age + " лет. Вы ПЕНСИОНЕР.");
        } else if (age > 120){
            System.out.println("Вам " + age + " лет. СТОЛЬКО ЛЮДИ НЕ ЖИВУТ.");
        } else {
            System.out.println("ВАМ НЕ МОЖЕТ БЫТЬ МЕНЬШЕ 0!");
        }
    }

    public static void getLoop(){
        // ЦИКЛ - это код, который будет повторяться до выполнения определенного условия
        // while, do while, for - ВСЕГДА В ОСНОВНОМ ИСПОЛЬЗУЕТСЯ С МАССИВАМИ, ОБЪЕКТАМИ

        int counter = 1;

        // while ВСЕГДА ПОКА ПРОВЕРЯЕТ ЛОГИЧЕСОЕ УСЛОВИЕ
        // ЕСЛИ ОНО НА МОМЕНТ НАЧАЛА УЖЕ ВЕРНО - НИЧЕГО НЕ БУДЕТ
        while(counter <= 10){
            System.out.println("Counter: " + counter);
            counter++;
        }

        System.out.println("-".repeat(50));

        counter = 1;

        // ОНО ВСЕГДА ХОТЯ БЫ ОДИН РАЗ ВЫПОЛНИТСЯ, ПОСКОЛЬКУ У НАС ПОКА ТЕЛО
        // А ПОТОМ ПРОВЕРКА УСЛОВИЯ
        do{
            System.out.println("Counter: " + counter);
            counter++;
        } while (counter <= 10);

        System.out.println("-".repeat(50));

        // for (переменные цикла; логическое условие; изменение переменной цикла)
        // Можно опустить любую часть
        // for (; index != 10;)
        // for (int index = 10; ; index--)
        // for (; ;) - > без переменных, без логических условий, без изменения переменных
        // ЕСЛИ В ВАШЕМ ЦИКЛЕ ЛОГИЧЕСКОЕ УСЛОВИЕ НЕ БУДЕТ ДОКАЗУЕМЫМ - У ВАС ЦИКЛ БУДЕТ БЕСКОНЕЧНЫЙ
        for(int index = 1; index <= 10; index++){
            System.out.println("Counter: " + index);
        }
    }

    // switch() - классический, обновленный и ВЫРАЖЕНИЕ
}