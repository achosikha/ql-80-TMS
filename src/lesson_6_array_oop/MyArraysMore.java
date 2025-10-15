package lesson_6_array_oop;

import java.util.Arrays;
import java.util.Random;

public class MyArraysMore {
    public static void main(String[] args) {
        // CODE
        localNonLocalObject();
    }

    public static void localNonLocalObject(){
        int x; // Компилятор ДЖАВА в ЛОКАЛЬНЫХ ПЕРЕМЕННЫХ для ПРИМИТИВНЫХ и НЕПРИМИТИВНЫХ объектов
        // САМОСТОЯТЕЛЬНО НЕ ЗАДАЕТ, ДЕФОЛТНЫЕ ЗНАЧЕНИЯ
        String name; // null - keyword - new, вот это new заставляет компилятор задать всем элементам дефолтные значения
        // Пустая строчка - ЭТО УЖЕ ЗНАЧЕНИЕ, ЭТО СИМВОЛ ПУСТО СТРОЧКИ ИЗ ТАБЛИЦЫ ASCII
        // null или ошибка
        boolean[] logicalAnswers = new boolean[5];

        // System.out.println("int x: " + x);
        // System.out.println("String name: " + name); -> String[] names = new String[10];
        // null - отсутствие ссылки, ЗНАЧИТ В ПАМЯТИ НЕ ВЫДЕЛЕНО НИКАКОГО ПРОСТРАНСТВА

        String surname = null;
        System.out.println("String surname = null: " + surname);

        System.out.println(Arrays.toString(logicalAnswers));
    }

    public static void useFourDimensionalArray(){
        char[][][][] symbols = new char[3][4][2][1]; // [/]
        int[][][][] numbers = new int[1][1][2][3]; // 0
        String[][][][] names = new String[1][2][1][1]; // null

        // float - double - default value? -> 0.0
        // boolean - default value -> false

        for(int outside = 0; outside < symbols.length; outside++){
            for (int outer = 0; outer < symbols[outside].length; outer++){
                for (int inner = 0; inner < symbols[outside][outer].length; inner++){
                    for (int el = 0; el < symbols[outside][outer][inner].length; el++){
                        System.out.print("symbols[" + outside + "][" + outer + "][" + outside + "][" + inner + "][" +
                                el + "]: " + symbols[outside][outer][inner][el]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(numbers));
        System.out.println(Arrays.deepToString(names));
    }

    public static void threeMoreDimensionalArray(){
        // int[] numbers = {1, 5, 9}
        // numbers == numbers[0]
        // int[][] numbers = {{}, {}, {}}
        // numbers == numbers[0][0]

        String[][][] names = new String[][][]{
                {
                        {"Archil", "Natella"},
                        {"Johnny"}
                },
                {
                        {"Jack"},
                        {"Jennifer", "London", "Viktor"},
                        {"James"},
                        {"Johnson"}
                },
                {
                        {"Olivia"},
                        {"Yulia"},
                        {"Volodya"}
                }
        };

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.deepToString(names));

        // int[][] names = new int[4][2] -> names.length -> 4

        // Classical for - если нам нужны ИНДЕКСЫ
        // Или же надо задавать/менять значения
        // int[][][] names = new int[10][5][3] -> names.length - 10
        for (int outer = 0; outer < names.length; outer++){ // names.length ОБЩАЯ ДЛИНА
            // names[inner].length - длина в определенном внешнем массиве
            for (int inner = 0; inner < names[outer].length; inner++){
                // names[outer][inner].length - names[1][0]. длина элементов под 1,0
                // names[1][0][10] -> names[1][0].length == 10
                // names[0][0][3] -> names[0][0].length == 3
                for (int element = 0; element < names[outer][inner].length; element++){
                    System.out.print("names[" + outer + "][" + inner + "][" + element + "]: " +
                            names[outer][inner][element] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("-".repeat(50));

        // enhanced-for
        // names[][][][]
        // Первый for достает двойной
        // Второй for достает одномерный массив из двумерного
        // Третий for достает элементы из одномерного массива
        int outerIndex = 0;
        int innerIndex = 0;
        int elementIndex = 0;

        for (String[][] outer : names){
            for (String[] inner : outer){
                for (String element : inner){
                    System.out.print("names[" + outerIndex + "][" + innerIndex + "][" + elementIndex + "]: " +
                            element + "\t");
                    elementIndex++;
                }
                System.out.println();
                innerIndex++;
                elementIndex = 0;
            }
            System.out.println();
            innerIndex = 0;
            outerIndex++;
        }
    }

    public static void showArray(){
        int rows = 3;
        int cols = 2;
        int[][] massive = new int[rows][cols];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                massive[i][j] = random.nextInt(10); // 0 to 9
                System.out.print(massive[i][j] + "\t");
            }
            System.out.println();
        }

        // \n
        // \t
        // \r
        System.out.println();

        // Welcome to Java...
        System.out.println("Welcome to Java...\rHere is MY MESSAGE");
        System.out.println("\"INSIDE BRACKETS\""); // Java " "
        System.out.println("\' \'"); // -> Регулярные выражения - ЭКРАНИРОВАНИЯ СИМВОЛА
        System.out.println("\\"); // \
    }
}
