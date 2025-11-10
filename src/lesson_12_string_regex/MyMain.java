package lesson_12_string_regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {
    public static void main(String[] args) {
        // String MORE
        usePatternMatcher();
    }

    public static void useFormatted(){
        // Форматированный вывод
        String name = "Archil";
        String surname = "Surname";
        int age = 36;

        // Классика Джава
        // В других языках, где СТРОКА ЭТО НЕ КОНСТАНТА можно прямо в СТРОЧКУ ВСТАВЛЯТЬ ПЕРЕМЕННЫЕ
        System.out.println("Your name: " + name + " and your surname is: " + surname + ". Age: " + age);

        String table_name = "name";
        int table_id = 0;
        int table_row = 1;
        int table_column = 2;
        String table_action = "DELETE";
        String table_data = "JK_1";

        String sql_call = "table " + table_name + " call table " +
                            table_id + " via " + table_row + " && " + table_column +
                            " WHERE " + table_action + " with " + table_data;

        System.out.println(sql_call);
        System.out.println("-".repeat(70));

        // ФЛАГ - это подсказка, что ТУТ ДОЛЖНА БЫТЬ ПЕРЕМЕННАЯ КАКОГО-ТО ТИПА
        // Начинается с %, а потом указатель на ТИП
        // %s - string
        // %d - digit (целочисленное число)
        String sqlFormattedCall = String.format("table %s call table %d via %d && %d WHERE %s with %s",
                                                table_name, table_id, table_row, table_column, table_action, table_data);
        System.out.println(sqlFormattedCall);

        char letter = 'l';
        boolean isWorking = true;
        float weight = 124.5F;
        double BMI = 456.5049;

        // %.ЧИСЛОf - после точки сколько символов надо вывести
        System.out.printf("My beloved letter is %c.\nAre you working? %b.\nWhat is your weight: %.3f.\nYour BMI? %.3f.",
                letter, isWorking, weight, BMI);

        // String template
        int born = 1988;
        // STR вызовом string template
        // String fullData = STR."Archil Sikharulidze was born in \{born} and is \{age} years old.";

        System.out.println();
        // String BLOCK
        String formattedText = "Person:\n" +
                "\tName: Archil.\n" +
                "\tSurname: Sikharulidze.\n" +
                "\t\tProfession: Java Developer.";

        System.out.println(formattedText);

        // String BLOCK
        // На первой строке, где """ нельзя ничего писать, лишь уже на следующей
        // Закрывающие кавычки ни имеют каких-либо специфических правил
        String block = """
                Person:
                    Name: Archil.
                    Surname: Sikharulidze.
                    Born: 1988.
                    Age: 37.
                        Profession: Java Developer.""";

        System.out.println("-".repeat(70));
        System.out.println(block);
    }

    public static void regExpString(){
        // Regular Expressions - обычно мы используем специальные редакторы
        // Там есть все формулы и можно прямо следить за вашим выражением и как он работает
        // Например, СТРОГА ПРОВЕРКА ЭЛЕКТРОННОЙ ПОЧТЫ
        // Scanner in TERMINAL: archil.sikharulidze       @         tsu1111.ge (возможность свободного ввода)
        // Для этого стиля нужна строгая проверка ПОЧТЫ - проверяет всевозможные формы нарушения ввода электронной почты
        // НО, если ваша программа такое не позволяет: archi.sikharulidze| @ | tsu | . | ge

        // Для работы с регулярными выражения в Джаве есть два механизма
        // Первый, это прямо указать регулярное выражение в МЕТОДЕ, который позволяет сделать такое,
        // split(), replaceAll()

        // Если мы работает  с большим объемом данных, и надо как-то структурировать и создать более сложную схему
        // тогда мы обращаем к двум существующим классам: Pattern, Matcher

        // Выражение: 15 + 8 / 9 + 10 % 5 - 10 (String)
        // 15, 8, 9, 10, 5, 10
        // +, /, + %, -
        // [0] = 15 (+) [1] = 8/9 (+) [2] = 10%5-10
        // КОГДА КАКИЕ-ТО СИМВОЛЫ НЕПОНЯТНЫ КОМПИЛЯТОРУ - ЗНАЧИТ НЕ МОЖЕТ ОСОЗНАТЬ, ВЫ ДАЕТЕ СПЕЦИМВОЛ
        // ИЛИ ЖЕ ПРОСТО ЗНАК КАКОЙ-ТО.
        // [] - ОТНОСИТСЯ КО ВСЕЙ СТРОЧКЕ (ГРАНИЦА)
        String[] values = "15+8/9+10%5-10*9*5".split("[*/\\-+%]"); // 15, 8/9, 10%5-10
        System.out.println(Arrays.toString(values));

        // Для того, чтобы подсказать КОМПИЛЯТОРУ, что ВАМ НУЖЕН ПРОСТО СИМВОЛ
        // Надо сделать ЭКРАНИРОВАНИЕ
        System.out.println("\"l\""); // \" и говорит компилятору, что это не спецзнак, а просто символ "
    }

    public static void usePatternMatcher(){
        // [] -> тут формула, что мы ищем
        // [] - нет точных указаний в какой части текста, поэтому ВЕЗДЕ
        // [0-9] where - от - до
        // [0-9] я ищу в строке числа от 0 по 9
        // [0-9] если больше нет ничего или же других скобок, то далее идет уточнение
        // [0-9]{2, 4} - {минимум, максимум} - Я ищу набор цифр во всей строке - эти цифры должны быть от 0 по 9
        // и количество вместе стоящих числ должно быть минимум 2, максимум 4
        // 13 + 1 + 145 + 4 + 189 + 1 + 1 = 13, 145, 189
        Pattern pattern = Pattern.compile("[0-9]{2,4}"); // ПО КАКОЙ ФОРМУЛЕ МЫ ИЩЕМ ВЕЩИ В ТЕКСТЕ
        // Получает СТРОКУ и СМОТРИМ есть ли совпадения с паттерном
        Matcher matcher = pattern.matcher("13+1+145+4+189+1+1+1857+18574");

        while(matcher.find()){
            //System.out.println("Matching index starts at: " + matcher.start());
            System.out.println(matcher.group());
            //System.out.println("Matching index ends at: " + matcher.end());
        }
    }

    public static void getMoreString(){
        // 'J', 'a', 'v', 'a' -> что это? char[]
        String programmingLanguage = "JAVA"; // char[] = new char[]{'J', 'A', 'V', 'A'};

        // 'J', 'a', 'v', 'a' ????? -> как превратить это в строку?
        String name = "Archil".concat(" Sikharulidze");
        String fullName = "Archil" + " " + "Sikharulidze";

        // String name = "Archil"; -> 'A', 'r', 'c', 'h', 'i', 'l' + '\0'
        // \0 - зачастую обозначает КОНЕЦ СТРОКИ
        // ДОКУМЕНТ ЗАКОНЧИЛСЯ - (-1), документ это одна большая СТРОКА - '\0'
        String str = "TeachMeSkills"; // + '\0' (13 + 1)
        System.out.println("String str = \"TeachMeSkills\" length: " + str.length());
        // Поскольку последний символ скрыт, для вас возвращается значение до '\0'
        // 'T', 'e', 'a', 'c', 'h', 'M', 'e', 'S', 'k', 'i', 'l', 'l', 's' - 0 - 12, 13 элемент это спец символ '\0'

        // concat(), join(), repeat(), trim(), split(), length()
        String makeChanges = "      "; // Длины нет лишь если нет и выделенной памяти, т.е. там null
        // System.out.println(makeChanges.charAt(0));

        // Проверяет длину строки, а если строка не проинициализирована, т.е. будет ошибка
        // null - отсутствие инициализации
        if(makeChanges.isEmpty()) System.out.println("EMPTY"); // КОГДА У СТРОКИ ЕСТЬ ДЛИНА
        if(makeChanges.isBlank()) System.out.println("EMPTY or has SPACES");

        // equals - logical - false || true
        // Строку можно сравнивать также и по лексикографии
        // Любой метод compareTo обычно возвращает ЧИСЛОВОЕ СРАВНЕНИЕ, особенно, строки
        String strHashCode = "Archil Sikharulidze";
        String strHashCode2 = "Archil Sikharulidze";
        String strHashCode3 = "ARCHIL SIKHARULIDZE";

        System.out.println("strHashCode.hashCode: " + strHashCode.hashCode());
        System.out.println("strHashCode2.hashCode: " + strHashCode2.hashCode());
        System.out.println("strHashCode3.hashCode: " + strHashCode3.hashCode());

        // compareTo - сравнивает каждый букву по коду и проверяет какое слово ЛЕКСИКОГРАФИЧЕСКИЙ ВЫШЕ
        // Если, первая переменная БОЛЬШЕ -1, если равно 0, ! -1 && !0 правая переменная БОЛЬШЕ
        // UNICODE (у каждого символа есть свое значение)
        // Берет и сравнивает значения каждого символа - ASCII (UTF-8), char 2 bytes
        // A - ? r - ?
        System.out.println("Archil Sikharulidze".compareTo("ArchiL sikharulidze"));

        for (int letter : "Archil Sikharulidze".toCharArray()){
            System.out.print(letter + "|");
        }

        System.out.println();

        for (int letter : "ArchiL sikharulidze".toCharArray()){
            System.out.print(letter + "|");
        }

        System.out.println();

        // trim(), split(), formatted()
        String strWithSpaces = "\" Archil    Sikharulidze \"";
        System.out.println(strWithSpaces);
        System.out.println(strWithSpaces.toUpperCase());
        System.out.println(strWithSpaces);
        strWithSpaces = strWithSpaces.toUpperCase();
        System.out.println(strWithSpaces);
    }
}
