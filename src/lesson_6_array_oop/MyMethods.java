package lesson_6_array_oop;

import java.util.Arrays;
import java.util.Scanner;

public class MyMethods {
    public static void main(String[] args) { // void - метод ничего не возвращает, результат его работы выхлопа - ничего
        // Entry-point
        int num = 9;
        System.out.println("int num = 9 before passing to a method: " + num); // 9

        // Stack ОСНОВНОЙ
        // HEAP единственный

        // Stack -> int x = 9;

        // passByValue() -> его стэк (Stack) -> первый параметр адрес метода main(),
                                           // -> int x = 9
        passByValue(num); // num передает 9

        // Закончился passByValue - в его стэке снизу вверх удаляется память, пока int x был удален из памяти
        // потом по ссылке он вернулся обратно в main и закрыл стэк метода passByValue()

        System.out.println("int num = 9 after passing to a method: " + num); // ОПЯТЬ БУДЕТ 9

        String msg = "Welcome to Java reference variable.";

        System.out.println("msg before: " + msg); // Welcome....
        changeStringValue(msg);
        System.out.println("msg after: " + msg);

        // String по идее должен передаваться по ссылке - Pass-by-reference
        // Поскольку под ним ссылка на оригинал
        // Но в Джаве под его капотом очень много нюансов и деталей
        // Он специально оптимизирован таким образом, чтобы экономить время, пространство
        // и не позволить легко обойти защитные механизмы

        System.out.println("-".repeat(50));

        String[] names = {"Archil", "Darya", "Katya", "Ivan", "Andrey"};
        System.out.println("String[] names original from MAIN(): " + Arrays.toString(names)); // "Archil", "Darya"....

        char[] returnedCharArray = getStringArray(names); // names мы передали не значения или отдельно стоящий массив
        // а мы передали НЕПОСРЕДСТВЕННО ССЫЛКУ НА ОРИГИНАЛЬНЫЙ МАССИВ
        System.out.println("I have returned the following array of chars: " + Arrays.toString(returnedCharArray));

        System.out.println("String[] names changed from MAIN(): " + Arrays.toString(names));

        avoidChangingArrayValues(names);

        System.out.println("-".repeat(100));

        System.out.println("Let's create and initialize a two dimensional array.");

        // Вызвать из этого метода другой, который создаст мне двойной массив и значения *
        char[][] table = createInitializeArray();
        readTable(table);
    }

    public static char[][] createInitializeArray(){
        return new char[][]{
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'}
        };
    }

    public static void readTable(char[][] table){
        for (char[] row : table){
            for (char col : row){
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

    // Если я должен ПРОСТО ПРОЧИТАТЬ ОБЪЕКТ, чтобы обезопасить себя от неожиданных изменений значений
    // Я всегда использую enhanced-for, вы просто не сможете поменять значения оригинала
    public static void avoidChangingArrayValues(String[] names){
        for(String name: names){
            System.out.println("Name: " + name);
        }
    }

    public static char[] getStringArray(String[] names){
        System.out.println("String[] names original from getStringArray(): " + Arrays.toString(names)); // "Archil"...

        for (int index = 0; index < names.length; index++){
            names[index] = names[index] + " CHANGED!";
        }

        // "Archil CHANGED"...
        System.out.println("String[] names changed values from getStringArray(): " + Arrays.toString(names));

        return names[0].toCharArray(); // Возьмет первое строковое значение, превратит его в массив символов
    }

    public static void changeStringValue(String msg){
        // String object и ссылочного типа
        System.out.println("msg before in method: " + msg); // Welcome...
        msg = "THIS IS CHANGED VALUE!";
        System.out.println("msg after in method: " + msg); // THIS IS CHANGED...
    }

    public static void passByValue(int num){
        // При передаче ЛОКАЛЬНЫХ ПРИМИТИВНЫХ ТИПОВ ДАННЫХ ИЗ ОДНОГО МЕТОДА В ДРУГОЙ
        // ОРИГИНАЛЬНОЕ ЗНАЧЕНИЕ НЕ БУДЕТ МЕНЯТЬСЯ, ДАЖЕ ЕСЛИ ЕГО ИЗМЕНИТЬ В УЖЕ ПЕРЕДАННОМ МЕТОДЕ
        // main() - int 9 -> changeValue(int) - int 9 = 100, 100 принадлежит changeValue
        // в main() вообще ничего не меняется
        // Такая передача данных называется - Pass-by-Value (передача-по-значению)
        System.out.println("Your passed num value is: " + num); // 9

        num = 101; // Меняю значение с 9 на 101

        System.out.println("You have changed the value: " + num); // 101
    }

    public static void callAllMethods(){
        System.out.print("Please, enter your name: ");
        String name = getInput().nextLine(); // new Scanner(System.in) + nextLine();

        System.out.print("Please, enter your surname: ");
        String surname = getInput().nextLine();

        System.out.print("Please, enter your age: ");
        int age = getInput().nextInt();

        System.out.print("Please, enter your profession: ");
        String profession = getInput().nextLine();

        System.out.println("-".repeat(50));

        // Если возвращаемое значение метода нужно сохранить, тогда создаем переменную и туда вкладываем
        // Если же нужно просто вывести тогда можно прямо в System.out.println()

        // String fullData = combinePersonData(name, surname, age, profession);
        System.out.println(combinePersonData(name, surname, age, profession));

        // Передадим два целочисленных значения и вернем его сумму деления
        System.out.println();

        System.out.println("Result of division 199/7: " + getDivisionSum(199, 7));
    }

    public static double getDivisionSum(int numberX, int numberY){
        return (double) numberX / numberY;
    }

    // Send four data: name, surname, age, profession
    // Combine and return final String result
    // public static String... в результате работы метода, он должен вернуть какое строковое значение
    // При передаче данных в метод byte & short - превращаются в int, а float - в double
    public static String combinePersonData(String name, String surname, int age, String profession){
        // Собрал из переданных данных, имя, фамилия, возраст и профессия - новую строчку и вернул мне эту строчку
        // в метод main

        /*
        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
        System.out.println("Your age is: " + age);
        System.out.println("Your profession is: " + profession);
         */

        // Если специально нужна переменная, если же нет можно создавать прямо в ключевом слове return

        /*
        String personFullData = "Your data is:\n\t" +
                "Name: " + name +
                ".\n\tSurname: " + surname +
                ".\n\tAge: " + age +
                ".\n\tProfession: " + profession + ".";

        return personFullData;
         */

        // Для того, чтобы вернуть какое значение - используется ключевое слово - return
        // Если метод НИЧЕГО не возвращает - т.е. у него void, то return заставляет его сломаться
        // Ведь по сути, его там не должно быть

        // Но если метод что-то возвращает, то ключевое слово return - нужно иметь и надо туда передать
        // тот тип данных, который указан в заголовке метода
        return "Your data is:\n\t" +
                "Name: " + name +
                ".\n\tSurname: " + surname +
                ".\n\tAge: " + age +
                ".\n\tProfession: " + profession + ".";
    }

    // Метод getInput - при каждом вызове будет возвращать работу кода new Scanner(System.in)
    public static Scanner getInput(){
        return new Scanner(System.in);
    }
}
