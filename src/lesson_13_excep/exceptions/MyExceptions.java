package lesson_13_excep.exceptions;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class MyExceptions {
    public static void main(String[] args) {
        // CODE
        try {
            getExceptions();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getExceptions() throws IOException {
        // Почему компилятор не остановил меня?
        // Ошибки такого плана, как их называют?
        // Run-Time ERROR (Ошибка времени выполнения)
        int number1 = new Scanner(System.in).nextInt();
        int number2 = new Scanner(System.in).nextInt();

        try{
            System.out.println(number1 / number2); // Арифметическая ошибка программиста, НЕ ЗНАЕШЬ АРИФМЕТИКУ
        } catch (ArithmeticException e){
            File file = new File("src/lesson_13_excep/exceptions/exceptions.txt");

            new FileWriter(file).write(new Date() + " MISTAKE. EXCEPTION SAYS: " + e.getMessage());
        }

        // ОТЛОВ ИСКЛЮЧЕНИЙ НУЖЕН ДВА ДВУХ СЛУЧАЕВ
        // 1. ЧТОБЫ НЕ ДОПУСТИТЬ НЕПРАВИЛЬНОЕ КРИТИЧЕСКОЕ ЗАКРЫТИЕ ПРОГРАММЫ
        // Если, в какой-то части кода есть ошибка - она должна быть поймана, обработана, а программа
        // как минимум выдать нужное сообщение и попросить какое-то действие, или и вовсе продолжить работу
        // но без того функционала, который не работает.

        // 2. Отладка КОДА и ее оптимизация.
        // Файл ЛОГГИ - куда буду сохранять ежедневное сообщения о неисправностях
        System.out.println("After CODE division by ZERO!");
        // Компилятор в первую очередь проверяет ЧТО? ГРАММАТИКУ!
        // System.out.println("""""); -> Compile-Time Error
    }
}