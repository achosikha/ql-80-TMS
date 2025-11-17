package lesson_14_excep_io.myexception;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        // Please enter USERNAME & PASSWORD
        //verification();
    }

    /*
    public static void verification(){
        try{
            System.out.print("Please, enter your USERNAME: ");
            String username = new Scanner(System.in).nextLine();
            System.out.print("Please, enter your PASSWORD: ");
            String password = new Scanner(System.in).nextLine();

            // initializeException() -> MODIFIED
            // Когда вы сделаете ПРАВИЛЬНЫЙ ВЫЗОВ СЛЕДУЮЩИЙ КОД ЗАРАБОТАЕТ
        } catch (UserPassException e){
            // CODE
        }
    }
     */

    // Должен быть МЕТОД, который проинициализирует вас собственный КЛАСС ИСКЛЮЧЕНИЕ
    public static void initializeException() throws UserPassException{
        // КОД
        // ЕСЛИ что-то
        // throw UserPassException("Your username is WRONG!");
        // Если что-то
        // throw UserPassException("Your password is WRONG!");
    }
}