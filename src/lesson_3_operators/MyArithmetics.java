package lesson_3_operators;

public class MyArithmetics {
    public static void main(String[] args) {
        // -, +, *, /, % - 10 % 5 = 0, год косный или высокосный
        // = , == проверка верности значения (15 == 14)
        // БИНАРНЫЙ СДВИГ и его операторы - <<, >>
        // 0 - 0000 0000, 1 - 0000 0001, 2 - 0000 0010, 3 - 0000 0011, 4 - 0000 0100
        // <, >, ==, >=, <=, !=
        // ! -> НЕ
        // || - ИЛИ, && - И
        // ++ - инкремент обозначает добавить 1
        // -- - декремент обозначает минус 1'
        int age = 36;
        System.out.println("Age: " + age);
        age += 5; // -> age = age + 5;
        System.out.println("Age: " + age);
        age -= 10; // -> age = age - 10
        System.out.println("Age: " + age);

        // ПРЕФИКСНЫЙ ИНКРЕМЕНТ и ДЕКРЕМЕНТ (используется редко из-за опасности результата)
        // А ТАКЖЕ ЕСТЬ, ПОСТФИКСНЫЙ ИНКРЕМЕНТ и ДЕКРЕМЕНТ
        ++age; // -> age = age + 1; age += 1; ПРЕФИКСНЫМ
        --age; // -> age = age - 1; age -= 1;
        System.out.println("Age: " + age);
        age++;
        age--; // ПОСТФИКСНЫМ
        System.out.println("Age: " + age);
        System.out.println("Age: " + ++age); // в префиксном стиле, ОН ПОКА ИЗМЕНИТ ЗНАЧНИЕ, А ПОТОМ ЕГО ИСПОЛЬЗУЕТ
        System.out.println("Age: " + age++); // ОН ПОКА ДАЕТ ИСПОЛЬЗОВАТЬ ЗНАЧНИЕ, А ПОТОМ УЖЕ ЕГО МЕНЯЕТ на +1 или -1
        System.out.println("Age: " + age);
    }
}
