package lesson_11_obj_strings.strs;

public class MainString {
    public static void main(String[] args) {
        // String
        // Formatted String
        // Concatenation
        // String Pool

        // Methods
        // StringBuilder - StringBuffer
        String name = "Archil";
        System.out.println(name);
        basicString(name);
        System.out.println(name);
        useStringPool();
        useStringMethods();
    }

    public static void useStringMethods(){
        // charAt, indexOf, split, trim() + REGULAR EXPRESSIONS
    }

    public static void useStringBuilder(){
        // StringBuilder, StringBuffer (no one uses)
        // Если вам нужна изменяемая строка - создаем StringBuilder
        String expand = "Archil";
        expand = expand.concat(" Sikharulidze");
        System.out.println(expand);

        StringBuilder str = new StringBuilder("Archil");
        System.out.println(str);
        str.append(" Sikharulidze");
        System.out.println(str);
        System.out.println(str.charAt(0));
        str.insert(0, 'J');
        System.out.println(str);
        System.out.println(str.delete(0, 1));
        System.out.println(str);
        str.replace(0, 1, "L");
        System.out.println(str);
        char[] fromStringBuilder = str.toString().toCharArray();
        str.delete(0, str.length());
        System.out.println("I have cleared StringBuilder: " + str);
    }

    public static void useStringPool(){
        // STRING POOL
        String profession = "Java Developer"; // STRING_POOL["Java Developer" -> 0x68609]
        // Full form of String creation

        // НИКОГДА МЫ НЕ СОЗДАЕМ СТРОЧКУ
        // ИСКЛЮЧЕНИЯ: ЕСЛИ МЫ ЦЕЛЕНАПРАВЛЕННО ТРЕБУЕМ ОТ НАШЕЙ ПРОГРАММЫ
        // ВЫДЕЛИТЬ ОТДЕЛЬНОЕ ПРОСТРАНСТВО ПОД ОПРЕДЕЛЕННУЮ СТРОЧКУ
        // В ТАКОМ СЛУЧАЕ, У НАС НАРУШЕТСЯ ОТПИМИЗАЦИЯ ХРАНЕНИЯ ДАННЫХ В СТРОЧКЕ
        String professionNew = new String("Java Developer");
        String duplicateProfession = "Java Developer"; // Check -> "Java Developer" достал АДРЕС

        // String - object
        // Object must be compared, especially String, via method EQUALS()

        // Если СТРОКА ПОЛНОСТЬЮ СОВПАДАЕТ С ДРУГОЙ СТОРОКОЙ - АДРЕСА У НИХ ВСЕГДА ОДИНАКОВЫЕ
        // ИСКЛЮЧЕНИЕ ЛИШЬ В ТЕМХ СЛУЧАЯХ, КОГДА МЫ СОЗДАЕМ СТРОЧКУ ЧЕРЕЗ КЛЮЧЕВОЕ СЛОВО NEW
        System.out.println("String profession == String professionNew: " + (profession == professionNew)); // FALSE
        System.out.println("String profession.equals(String professionNew): " +
                profession.equals(professionNew)); // TRUE
        System.out.println("String profession == String duplicateProfession: " +
                (profession == duplicateProfession)); // FALSE (Andrey +) + Zhenya (true)
        System.out.println("String profession.equals(String duplicatedProfession): " +
                (profession.equals(duplicateProfession))); // TRUE
    }

    public static void whatWouldHappen(){
        // What would happen?
        // 21 + 2 + 2 + 5 = 21225 || 2 1 9
        // Объединение текста происходит слева направо
        System.out.println(1 + 1 + "1" + 2 + 2 + 5); // "21" + 2 + 2 + 5, "21225"
        System.out.println(1 + 1 + "1" + (2 + 2 + 5)); // 2 + 1 = "21" + 9 = "219"
        // + компилятор понимает как ОБЪЕДИНЕНИЕ, поэтому если он видит СТРОКА +
        // Возьми строчку и + что-то
        // + является спецсимволом, который ГОВОРИТ ОБЪЕДИНИ СТРОЧКУ С ЧЕМ-ТО
        System.out.println(2 * 5 + 1 + ("%" + 4) + 5 / 2); // 11%10
        // String concat = 56 + 1 + 68;
        String concat = 56 + 1 + 68 + "";
        System.out.println(concat);
        int age = 36;
        String concatedValue = "Archil Sikharulidze is " + age + " years old";
        String unitedStrings = concat + concatedValue + age;

        String empty = "";
        String objectEmpty = null;
    }

    // STRING - > большая накладка, поскольку строчка может быть большой
    public static void basicString(String name){
        // Оптимизированный КЛАСС
        // C нет строчек, массив символов и в С есть массив символов
        // С++ добавили пакет string -> и автоматизировали строчку
        // Теперь мы смогли сразу же получать строчку, а под капотом опять массив
        // Джаве опять же массив, но неизменяемый!
        // const obj[] -> менять значения, хотя есть ключевое слово const (== final)
        // const -> если это ОБЪЕКТ то мы константной делаем не его значение, а его ССЫЛКУ
        // Java String (Stack -> Address) -> что его значения неизменяемые
        name = "Andrey"; // new char[]{'A', 'n', 'd', 'r', 'e', 'y'}

        // String -> FINAL, immutable - неизменяем!
        System.out.println(name.charAt(0));
        // cannot change String as an ARRAY
        // name.charAt(0) = 'J'; -> Я не могу НА САМОМ ДЕЛЕ МЕНЯТЬ ВООБЩЕ СТРОЧКУ, ЭТО ОБМАН
        name = "Kndrey"; // НА САМОМ ДЕЛЕ Я ПОЛНОСТЬЮ ПЕРЕСОЗДАЮ СТРОЧКУ И ОБЪЕКТ
    }
}
