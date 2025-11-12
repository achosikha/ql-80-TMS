package lesson_13_excep;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        // CODE
        System.out.println("Is there an UNIQUE WORD ENTERED? " + findUniqueWord("APPLE"));
    }

    // 4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
    // Если таких слов несколько, найти первое из них.
    public static String findUniqueWord(String string){
        System.out.print("Please, enter a string value: ");
        String str1 = getInput();
        System.out.print("Please, enter a string value: ");
        String str2 = getInput();
        System.out.print("Please, enter a string value: ");
        String str3 = getInput();

        if (checkWord(str1)) return str1;
        else if (checkWord(str2)) return str2;
        else if (checkWord(str3)) return str3;

        return "NO UNIQUE WORDS!";
    }

    public static boolean checkWord(String string){
        for(int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length() - 1; j++) {
                if(string.charAt(i) == string.charAt(j + 1)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static String getInput(){
        return new Scanner(System.in).nextLine();
    }
}