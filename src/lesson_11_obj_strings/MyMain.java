package lesson_11_obj_strings;

public class MyMain {
    public static void main(String[] args) {
        // CODE

        // Задача 1:
        // Создать класс для описания пользователя системы. Переопределить в классе методы
        // toString, hashcode и equals. Создать несколько экземпляров класса с одним и тем же
        // значением полей и сравнить с помощью метода equals.

        // Задача *:
        // Создать программу для реализации поверхностного и глубокого клонирования объекта
        // класса User. Пусть на вход программе будет передаваться тип операции клонирования
        // (поверхностное клонирование или глубокое), а также id юзера для клонирования.

        // Object -> finalize() предпоследние действия перед тем, как его заберет GC (Garbage Collector)
        // Garbage Collector очистит его от памяти, потом он уничтожится

        // Как Сборщика мусора узнает, используется ли еще объект в коде?!
        // RAM? Копировать-Удалить, Отметить-убрать
        // System.gc(); // Подсказка Сборщику мусора, ПОЖАЛУЙСТА, ЕСЛИ ЗАХОЧЕШЬ, можешь убрать этот объект из памяти

        overloadEquals();
    }

    public static void overloadEquals(){
        ITPerson archil = new ITPerson("Archil", "Sikharulidze", 37);
        // "Yevgeny", "Kurbatov", 25
        ITPerson yevgeny = new ITPerson("Archil", "Sikharulidze", 37);
        System.out.println(archil.equals(yevgeny));
        // System.out.println(archil.equals(new int[]{1, 2, 3}));

        Object[] objects = new Object[]{
                "Archil",
                -1,
                56.4f,
                56.1111,
                'A',
                'c',
                new ITPerson("Archil", "Sikharulidze", 36)
        };

        // var - JavaScript
        // Только в локальном коде и позволяет компилятору самостоятельно узнать по ходу действия
        // тип приходимой переменной
        for (var object : objects){ // auto
            System.out.println(object);
        }

        // У каждого объекта есть hashCode
        // Уникальное числовое значение объекта INT
        String tms = "TeachMeSkills";

        System.out.println("String tms hashCode: " + tms.hashCode());
        System.out.println("ITPerson archil: " + archil.hashCode());
        System.out.println("ITPerson yevgeny: " + yevgeny.hashCode());

        // String = "..........................................................."
        // String = "..........................................................."
        // string.equals(string1)) -> более затратно в коллекции, нежели если я сравню их целочисленные
        // string.hashCode() == string1.hashCode();
    }
}