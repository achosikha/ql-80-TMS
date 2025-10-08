package lesson_4_oper_array;

import java.util.Random;

public class OneDimensionalArray {
    public static void main(String[] args){
        // ARRAY
        extendArray();

        // int names[10];
        // int newNames[names.length - ?]
    }

    public static void extendArray(){
        Random random = new Random();

        // Специальный Arrays
        int[] oldValues = new int[]{-1, 0, 8, 11, -5, 10};

        // Все элементы из старого и добавить ПЛЮС НОВЫЕ 10
        int[] newValues = new int[oldValues.length + 10]; // 6 + 10 = 16

        // Скопируем старые элементы в новый массив, только в конец
        // 16 - 0 to 15
        for (int index = 10, oldIndex = 0; oldIndex < oldValues.length; index++, oldIndex++){
            newValues[index] = oldValues[oldIndex];
        }

        // 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 8, 11, -5, 10
        for (int index = 0; index < newValues.length; index++){
            System.out.println("newValues[" + index + "]: " + newValues[index]);
        }

        // Заполним первые 10 в новом массиве
        for (int index = 0; index < 10; index++){
            newValues[index] = random.nextInt(1, 21);
        }

        System.out.println("-".repeat(50));

        // R, R, R, R, R, R, R, R, R, R, -1, 0, 8, 11, -5, 10
        for (int index = 0; index < newValues.length; index++){
            System.out.println("newValues[" + index + "]: " + newValues[index]);
        }
    }

    public static void getOneDimensionalArray(){
        // 1. Массив - это ЦЕПОЧКА однотипных значений
        // 2. Размер массива задается один раз и его НЕЛЬЗЯ ПОМЕНЯТЬ
        // 3. Все значения массива должны быть одинакового типа
        // 4. Массив нельзя автоматически сократить или расширить
        // 5. То есть, если у вас ЦЕПОЧКА состоит из 10 элементов, его нельзя изнутри сократить до 5, или
        // увеличить до 15. Для этого нужно создать уже новый массив, с учетом старого и плюс новые элементы

        // C-style array declaration - объявление массива в стиле С
        // Есть Java style array declaration - чисто Java стиль
        // int numbers[]; - C-style array declaration
        int[] numbers = new int[5];

        // Номер элемента в массиве называется ИНДЕКСОМ
        // Индексы в массиве начинаются с 0, а не 1
        // Поэтому первый элемент массива находится под числом 0
        // А последний его элемент - это длина - 1, 5 - 1 = 4
        numbers[0] = -1;
        numbers[1] = 10;
        numbers[2] = 4;
        numbers[3] = 9;
        numbers[4] = 3;
        // numbers[5] = 10; -> ERROR: ARRAY OUT OF BOUND EXCEPTION

        String[] names = new String[]{"Archil", "Darya", "Ivan", "Katya", "Vova"};

        System.out.println(names[1]);
        System.out.println(names[5 - 1]);

        Random randomNumber = new Random();

        System.out.println();

        // Задать массиву numbers новые значения через цикл в котором будут рандомные числа
        // names.length == 5, index < names.length не доходя до 5
        for (int index = 0; index < numbers.length; index++){
            numbers[index] = randomNumber.nextInt(1, 21);
        }

        for (int index = 0; index < numbers.length; index++){
            System.out.println("numbers[" + index + "]: " + numbers[index]);
        }

        System.out.println("-".repeat(50));

        for (int index = 0; index < names.length; index++){
            System.out.println("Your name is: " + names[index]);
        }
    }
}
