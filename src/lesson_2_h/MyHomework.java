package lesson_2_h;

public class MyHomework {
    public static void main(String[] args) {
        // CODE
        calculateValue();
        getDoubleDigit();
    }

    // 1. Написать приложение, которое будет вычислять и выводить значение по формуле:
    // a=4*(b+c-1)/2; b и c задаем в коде самостоятельно
    public static void calculateValue(){
        // Любое значение типа byte, short если над ними будут проводиться арифметические операции или они
        // будут передаваться, как данные - автоматически буду превращены в значения типа INT
        // Тоже самое с float -> double
        int b = 100;
        double c = 13;

        // a = 4 * (100 + 13 - 1) / 2
        double a = 4 * (b + c - 1) / 2;
        System.out.println("a = 4 * (100 + 13 - 1) / 2: " + a);
    }

    // 5. В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
    // на экран результат деления q на w с остатком. Пример вывода программы (для случая,
    // когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
    public static void getDoubleDigit(){
        int q = 21;
        int w = 8;
        int lastDigit = q % w;

        System.out.println("21 % 8: " + lastDigit);
    }
}
