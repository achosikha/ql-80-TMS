package lesson_14_excep_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class MyExceptionsMore {
    public static void main(String[] args) throws IOException{
        // CODE
        useTryWithResources();

        /*
        try {
            checkArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // ANOTHER METHOD
        useTryCatch();
         */
    }

    // try-with-resources
    public static void useTryWithResources(){
        // try-with-resources - это специальная версия исключений, которая работает с РЕСУРСАМИ
        // Т.е. хотите что-то прочитать? Что-то записать? Используем этот вариант

        // LOCKER
        try(FileWriter input = new FileWriter("src/lesson_14_excep_io/message.txt")){
            input.write("""
                    Exception Hierarchy in Java:
                    In the java exception class hierarchy, the class at the top is the Throwable class, 
                    which is a direct subclass of the Object class. Throwable has two direct subclasses Exception 
                    and Error, which has again respective sub-classes The diagram below shows the standard exception 
                    and error classes defined in Java.""");
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            // Когда блок исключения закончится, ресурсы автоматом закроются
            System.out.println("Your resource had been closed!");
        }
    }

    public static void useOtherTryCatch(){
        // 1. Classical try-catch
        /*
        try{
            System.out.println(100 / 9);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
         */

        // У меня есть часть кода, которая выполнится если все нормально, без исключений
        // Но, даже если будут исключения ОБЯЗАТЕЛЬН, ПРЕЖДЕ ЧЕМ ЗАКРЫТЬ ТЕЛА ИСКЛЮЧЕНИЯ СДЕЛАЙ СЛЕДУЮЩИЙ КОД
        try{
            // Если выполнил хотя бы одно исключение - БЛОК ЗАКРЫВАЕТСЯ
            System.out.println(100 / 0);
            int[] values = {10, 9, 0, 1};
            System.out.println(values[10]);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("THIS CODE WILL BE PROSECUTED BY ALL MEANS!");
        }

        // ВЫПОЛНИТЬ ДАЛЬНЕЙШИЙ КОД
    }

    // BLOCK EXCEPTION
    // ALTERNATIVE: METHOD LEVEL EXCEPTION
    // Чтобы пробросить исключение на уровне метода - надо использовать throws и само название
    // Такие исключение отлавливаются в вызывающем методе - также в сигнатуре или уже в блоке
    public static void checkArithmeticException() throws ArithmeticException{
        System.out.println(100 / 0);
        /*
        try{
            System.out.println(100 / 0);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
         */
    }

    public static void useTryCatch() throws IOException {
        // BLOCK EXCEPTION

        try{
            System.out.print("Please, enter value one: ");
            int value = input().nextInt();
            System.out.print("Please, enter value two: ");
            int valueTwo = input().nextInt();

            System.out.println(value / valueTwo);
            int[] values = {10, 11, 9, 18};

            for(int index = 0; index <= values.length; index++){
                System.out.println("values[" + index + "]: " + values[index]);
            }
        } catch (ArithmeticException | IllegalArgumentException e){ // e - exception, ДЕЛЕНИЕ на НОЛЬ
            String exception = new Date() + " -> Exception handled: " + e.getMessage() + "\n";
            System.out.println(exception);

            FileOutputStream input = new FileOutputStream("src/lesson_14_excep_io/logs.txt", true);

            for(int index = 0; index < exception.toCharArray().length; index++){
                input.write(exception.charAt(index));
            }
        } catch (ArrayIndexOutOfBoundsException e){ // Неправильный индекс массива
            String exception = new Date() + " -> Exception handled: " + e.getMessage() + "\n";
            System.out.println(exception);

            FileOutputStream input = new FileOutputStream("src/lesson_14_excep_io/logs.txt", true);

            for(int index = 0; index < exception.toCharArray().length; index++){
                input.write(exception.charAt(index));
            }
        } catch (RuntimeException e){
            System.out.println("This is UNKNOWN EXCEPTION thrown by RuntimeException.\n" +
                    new Date() + " -> Exception handled: " + e.getMessage());
        } catch (Exception e){
            System.out.println("THIS IS A FATHER OF ALL EXCEPTIONS!");
        }

        System.out.println("CODE AFTER EXCEPTION...");
    }

    public static void useException(){
        // 100 / 0

        // NULL POINTER EXCEPTION
        // length()
        String name = "Archil"; // NULL POINTER -> name указывает на ОБЪЕКТ, но если внутри нет адреса или он неправильный
        // значит выдаст ошибку, поскольку адрес пустой или ложный
        String surname = null; // NULL POINTER

        // Создание другого объекта внутри конструктора иного объекта, особенно, если там идет процесс
        // наследования, если мы обратились из объекта А к объекту Б, когда он еще не создан
        System.out.print("Please, enter a digital value: ");
        int value = new Scanner(System.in).nextInt();
        // System.out.println(100 / 0);
        int[] values = {10, 1, 9, 0, 0};
        // System.out.println(values[10]); // NO ELEMENT UNDER INDEX 10

        // Unchecked компилятор считает вас достаточно разумным, чтобы предугадать возможные ошибки
        // Это ваша обязанность, поэтому компилятор не будет за вас все предугадывать

        // ПРОВЕРЯЕМЫЕ
        // МОЯ ошибка заключается в том, что возможно просто нет фолдера, файла
        // Поскольку компилятор не может это проверить, и допускает также ваше не знание
        // То когда мы обращается к внешним ресурсам, у нас требуют ОБЯЗАТЕЛЬНОЙ ПРОВЕРКИ!
        File file = new File("MyExceptionsMore.java");

        try{
            FileWriter output = new FileWriter(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }
}