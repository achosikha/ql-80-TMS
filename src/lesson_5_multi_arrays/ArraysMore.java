package lesson_5_multi_arrays;

import java.util.Arrays;

public class ArraysMore {
    public static void main(String[] args) {
        // CODE
        useAdvancedFor();
    }

    public static void declareInitializeArray(){
        // Вес ОБЪЕКТА рассчитывается исходя их его внутренних переменных
        int[] numbers = new int[]{14, -1, 0, 10, 21};
        char[] letters = {'A', 'C', 'b', 'E', 'd'}; // new char[]{} -> 2 bytes UNICODE

        // Stack (только примитивные типы) - Heap (всегда объекты)
        // Stack -> letters (

        // Если что-то считается более выведенным из обыхода - deprecated
        // letters.finalize();
        System.out.println("Size of INT: " + Integer.SIZE + " bits, divided by 8: " + (Integer.SIZE) / 8 + " bytes.");
        System.out.println("int[] numbers = new int[]{14, -1, 0, 10, 21}: " + numbers.length * ((Integer.SIZE) / 8) +
                " bytes.");
        System.out.println("char[] letters = {'A', 'C', 'b', 'E', 'd'}: " + letters.length * ((Character.SIZE) / 8) +
                " bytes.");

        System.out.println("What will I get if I pass array name? + " + numbers);
        // char - возможно все же покажет свои значения
        System.out.println("What will I get if I pass array name of chars? " + letters);

        // Название переменной массива указывает на первый индекс этого же массива
        // numbers == numbers[0]
    }

    public static void useTernaryOperator(){
        // if () _ else _
        // () ? :
        int jDot = 14;
        int bDot = 14;
        int higherValue;

        /*
        if (jDot > bDot){
            higherValue = jDot;
        } else {
            higherValue = bDot;
        }
         */

        higherValue = (jDot > bDot) ? jDot : bDot;
        System.out.println("int higherValue: " + higherValue);

        // if (jDot > bDot) higherValue = jDot;
        //  else if (bDot > jDot) higherValue = bDot;
        // else higherValue = 0;
        higherValue = (jDot > bDot) ? jDot : (bDot > jDot) ? bDot : 0;
        System.out.println("higherValue = (jDot > bDot) ? jDot : (bDot > jDot) ? bDot : 0 -> " + higherValue);
    }

    public static void useAdvancedFor(){
        String[] names = {"Archil", "Yulia", "Dasha", "Katya", "Pavel"};

        // Я получаю каждый элемент по индексу, следовательно, могу контролировать индексы,
        // а также, получать прямой доступ к элементам массива и МЕНЯТЬ ИХ
        for (int index = 0; index < names.length; index++){
            System.out.println("Name: " + names[index]);
        }

        System.out.println("-".repeat(50));

        // Когда я передаю примитивные типы куда-то они передаются по значению
        // Когда я передаю массив - он передается по ссылке, а это чревато потерей и возможными изменениями значений
        // оригинального массива. Если мне нужен функционал, который должен ТОЛЬКО ЧИТАТЬ массив или ДРУГИЕ ОБЪЕКТЫ
        // То, я могу прибегнуть не к классическому for циклу, а к т.н. усиленному for -> enhanced-for
        // for (тип название_временной_переменной : массива)
        // В такой записи не ИНДЕКСОВ, поэтому контролировать индексацию сложновато
        // Более того, нет доступа по индексам, только получаем значения из массива
        // А ЭТО ОБОЗНАЧАЕТ, ЧТО У НАС НЕТ ВОЗМОЖНОСТИ МЕНЯТЬ ЗНАЧЕНИЯ МАССИВА
        for (String name : names){
            name = "James";
            System.out.println("Name: " + name);
        }
        System.out.println(Arrays.toString(names));

        System.out.println("-".repeat(70));

        for(char letter : "Welcome to Java.".toCharArray()){
            System.out.print(letter + "\t");
        }

        System.out.println();
        System.out.println("-".repeat(70));

        String name = "Archil"; // char[] name = {''....};
        char[] nameLetters = name.toCharArray();
        System.out.println(Arrays.toString(nameLetters));
    }
}
