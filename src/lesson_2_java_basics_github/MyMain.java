package lesson_2_java_basics_github;

// В Джаве ВСЕ ОБЪЕКТ
// НЕЛЬЗЯ НАПИСАТЬ КОД ВНЕ ОБЪЕКТА
// А ОБЪЕКТ У НАС СОЗДАЕТСЯ ЧЕРЕЗ КЛЮЧЕВОЕ СЛОВО - class
// Объект - MyMain
// Внутри - ТОЧКА ДОСТУПА/ВХОДА - ENTRY-POINT

// ГРУППА ЯЗЫКОВ ТИПА С: С, С++, Java, C#, JS, KOTLIN
// ОНИ ВСЕ, в разное время и под копотом имеют метод - main

// Есть ЯЗЫКИ программирования с разными парадигмами, т.е. в каком стиле вы можете писать
// Например, в С нет ОБХЕКТА, НЕТ КЛАССОВ, вы пишите только в ФУНКЦИОНАЛЬНОМ СТИЛЕ

// Правила именования объектов - ВСЕГДА СУЩЕСТВИТЕЛЬНОЕ
// Дом, Человек, Рабочий, Машина, Камень - ГородскойСуд, МояМашина, ДомЛевый
// Upper Camel Case, первая бука каждого слова должна писаться с большой буквы
// House, MyHouse, Staff, StaffMembers, Garden, SoftDeveloperIT
public class MyMain {
    // Lower Camel Case - main, get, set, use, run, jump - setValue, getValue, calculate
    // calculateSum, getUserHeight
    public static void main(String[] args){ // method - говорит компилятору, что должен начать с него
        // public static void main - psvm + ENTER
        System.out.println("Welcome to JAVA!"); // sout + ENTER
        System.out.println();

        getVariables();

        // STACK -> int x = 100;
        // x указывает на пространство в STACK где прямо хранится значение 100
        // HEAP - ВСЕ ОБЪЕКТЫ ЯВЛЯЮТСЯ ССЫЛОЧНЫМИ И ВСЕГДА ХРАНЯТСЯ В КУЧЕ (HEAP)
        // MyMain, String name = "Archil", name -> STACK - хранится ссылка на HEAP (кучу), и уже в куче непосредственно
        // живет ваш объект
    }

    public static void getVariables(){
        // Data types - типы данных в ДЖАВА

        // from BYTE to boolean - ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ
        byte byteValue = -128; // В памяти занимает 8 битов (1 байт) минимальная единица памяти в компьютере, -128 по 127
        byte secondByteValue = 20;
        // byteValue = byteValue + secondByteValue; // -128 + 500, ОШИБКА ЗНАЧЕНИЯ, НЕОПРЕДЕЛЕННОЕ ПОВЕДЕНИЯ, 372 - 128
        // 127 + 20, -128.... -157

        short shortValue = 30_234; // 2 bytes
        int intValue = -1_345_456_456; // 4 bytes, JAVA дефолтное целочисленное значение INT
        long longValue = 3_345_345_445_3434L; // 8 bytes

        char letter = '*';

        float floatValue = 34.56F; // .+7 numbers
        double doubleValue = 56.2049458695812; // .+15numbers, JAVA double by default

        boolean isAMarried = true; // TRUE или FALSE, нельзя представить значение типа 0, 1

        // СТРОЧКА ЯВЛЯЕТСЯ ССЫЛОЧНЫМ ТИПОМ ДАННЫХ
        String name = "Archil";
        String surname = "Sikharulidze";

        System.out.println("byte byteValue = " + byteValue);
        System.out.println("short shortValue = " + shortValue);
        System.out.println("int intValue = " + intValue);
        System.out.println("long longValue = " + longValue);

        System.out.println("char letter = " + letter);

        System.out.println("float floatValue = " + floatValue);
        System.out.println("double doubleValue = " + doubleValue);

        System.out.println("boolean isAMarried = " + isAMarried);

        System.out.println("String name = " + name);
        System.out.println("String surname = " + surname);

        getCharType();
    }

    public static void getCharType(){
        // char -> это целочисленное представление ЛЮБОГО ЗНАКА
        char symbol = '5';

        System.out.println("char symbol = '5' -> " + symbol);
        symbol = '0';
        System.out.println("char symbol = '0' -> " + symbol);
        symbol = 5;
        System.out.println("char symbol = 5 -> " + symbol);
        symbol = 66;
        System.out.println("char symbol = 66 -> " + symbol);

        // char -> ASCII TABLE
        // HIGH ASCII TABLE - включает в себя все языки мира и большинство символов

        // ПРЕОБРАЗОВАНИЕ ОДНОЙ ПЕРЕМЕННОЙ В ДРУГУЮ
        // Есть два метода: преобразование вверх - происходит автоматически
        // И принудительное преобразование вниз - casting
        short myShortValue = 32_000;
        int myIntegerValue = myShortValue; // автоматическое преобразование вверх
        float myFloatValue = 123.45F;
        double myDoubleValue = myFloatValue;

        int smallIntegerValue = 1125; // 4 bytes
        byte myByteValue = (byte) smallIntegerValue; // byte = 2 bytes, int = 4 bytes
        System.out.println(myByteValue);

        int downgradeDouble = (int) myDoubleValue; // 123 УБИРАЕТ ВСЕ, ЧТО ПОСЛЕ ТОЧКИ .45 (ОТБРАСЫВАНИЕ)
        System.out.println(downgradeDouble);

        System.out.println("My data type char is a symbolic representation: " + symbol);
        System.out.println("Let's see what is behind the symbol, ASCII code: " + (int) symbol);
        symbol = ' ';
        System.out.println("My data type char is a symbolic representation: " + symbol);
        System.out.println("Let's see what is behind the symbol, ASCII code: " + (int) symbol);

        int valueSymbol = 109;
        System.out.println("From int to char: " + (char) valueSymbol);
    }
}