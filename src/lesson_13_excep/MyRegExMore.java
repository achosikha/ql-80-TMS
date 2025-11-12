package lesson_13_excep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegExMore {
    public static void main(String[] args) {
        System.out.println(Character.SIZE);
    }

    public static void useBuffer(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter int: ");
        // BUFFER: 56 + ENTER ('\n') BUFFER [56, '\n']
        int ls = input.nextInt(); // 56, BUFFER ['\n']
        System.out.print("Please, enter string: ");
        // BUFFER ['\n']
        // механическая очистка буфера

        input.nextLine(); // Этот вызов поглотит весь мусор в буфере, и дальше будет свободное пространство

        String str = input.nextLine(); // nextLine поглощает все, в том числе и переход на следующую строку

        // int, double, float -> BUFFER ['\n'] ? НЕТ, выкинет его

        System.out.println("Your int is: " + ls);
        System.out.println("Your String is: " + str);

        // JS, let  var = CONST; -> var = 56.7
        // let var = +var; МОЖНО ЛИ ПРЕВРАТИТЬ var в целое число
        // if (+var){...}
    }

    public static void checkSentence(){
        // У нас есть СТРОКА и задача проверить буквы английского алфавита + кириллица
        String str = "Archil Сихарулидзе";
        Pattern pattern = Pattern.compile(str, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher("[A-z]");
    }
}