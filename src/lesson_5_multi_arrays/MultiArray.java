package lesson_5_multi_arrays;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        // CODE
        cpyArrays();
    }

    public static void createTwoDimensionalArray(){
        // 4 одномерных массива, в 1 - 4, 2 - 3, 3 - 2, 4 - 1
        int[][] table4xN = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9},
                {10}
        };

        // ****
        // ***
        // **
        // *

        // Длина МАССИВОВ равна в целом длине переменной массива
        // int[4][?] table == table.length -> 4
        for (int row = 0; row < table4xN.length; row++){
            for (int col = 0; col < table4xN[row].length; col++){ // int[0].length
                System.out.print(table4xN[row][col] + "\t");
                // 0,0 - 0,1 - 0,2 - 0,3
                // 1,0 - 1,1 - 1,2
                // 2,0 - 2,1
                // 3,0
            }
            System.out.println();
        }

        System.out.println("-".repeat(50));

        // table4xN -> достань одномерный массив и сохрани его в int[] row
        // а из int[] row - достань поочередно элементы и сохрани их во временной переменной col
        for (int[] row : table4xN){
            for (int col : row){
                System.out.print(col + "\t"); // col = table4xN[0][0], col = table4xN[0][1], col = table4xN[0][2]
            }
            System.out.println();
        }

        // Объявить
        int[][] unKnownValues; // У меня есть какой-то двойной массив, но что и как я скажу попозже
        unKnownValues = new int[4][];
        unKnownValues[0] = new int[]{1};
        unKnownValues[1] = new int[]{2, 3};
        unKnownValues[2] = new int[]{4, 5, 6};
        unKnownValues[3] = new int[]{7, 8, 9, 10};

        System.out.println("-".repeat(50));

        for (int[] row : unKnownValues){
            for (int col : row){
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

    public static void cpyArrays(){
        char[][] table = new char[4][8];

        char letter = 'A';

        for (int row = 0; row < table.length; row++){
            for (int col = 0; col < table[row].length; col++){
                table[row][col] = letter++;
            }
        }

        for (char[] row : table){
            for (char col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println("-".repeat(50));

        // Если у вас двухмерный или более сложный массив, тогда deepToString()
        System.out.println(Arrays.deepToString(table));

        // System.arraycopy(); -> копирует нужные вам данные очень просто из одного массива в другой
        int[] values = {1, 2, 4, 5, 10};
        int[] newValues = new int[values.length + 10];

        System.arraycopy(values, 0, newValues, newValues.length - values.length, values.length);

        System.out.println("values: " + Arrays.toString(values));
        System.out.println("newValues: " + Arrays.toString(newValues));
    }
}
