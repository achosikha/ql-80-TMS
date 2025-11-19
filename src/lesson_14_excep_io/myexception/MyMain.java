package lesson_14_excep_io.myexception;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        // Please enter USERNAME & PASSWORD
        verification();
    }

    public static void verification(){
        try{
            System.out.print("Please, enter your USERNAME: ");
            String username = new Scanner(System.in).nextLine();
            System.out.print("Please, enter your PASSWORD: ");
            String password = new Scanner(System.in).nextLine();

            initializeException(username, password); // Получает сигнал о классе UserPassException
        } catch (UserPassException e){
            System.out.println(e.getMessage());
        }
    }

    // Должен быть МЕТОД, который проинициализирует вас собственный КЛАСС ИСКЛЮЧЕНИЕ
    public static void initializeException(String username, String password) throws UserPassException{
        if(!username.contains(" ")){
            if (username.length() < 20){
                if(!username.equals("IRJLS")){
                    throw new UserPassException("GOODBYE! WRONG USERNAME!");
                }
            }
        }
    }
}