package lesson_6_array_oop;

public class MyPerson {
    public static void main(String[] args) {
        // Entry-level
        // Будет СОЗДАВАТЬ ЛЮДЕЙ и С НИМИ РАБОТАТЬ
        createPerson();
    }

    public static void createPerson(){
        // new ВСЕГДА СОЗДАЕТ ПОД КАЖДЫЙ ОБЪЕКТ СВОЕ СОБСТВЕННОЕ ПРОСТРАНСТВО
        // СЛЕДОВАТЕЛЬНО, У РАЗНЫХ ОБЪЕКТОВ С РАЗНЫМИ ПРОСТРАНСТВАМИ == ССЫЛКАМИ
        // ОДИН ШАБЛОН - НО РАЗНЫЕ РЕАЛИЗАЦИИ
        // В ДЖАВЕ ОБЪЕКТЫ ВСЕГДА ХРАНЯТСЯ В КУЧЕ - ИСКЛЮЧЕНИЙ НЕ МОЖЕТ БЫТЬ
        // ПОЭТОМУ ТАК ИЛИ ИНАЧЕ, ДАЖЕ ЕСЛИ ЯВНО НЕ УКАЗАНО, ВСЕ РАВНО ГДЕ-ТО ПОД КАПОТОМ
        // ОБЪЕКТ ИМЕЕТ new и ХРАНИТСЯ В КУЧЕ
        Person archil = new Person();
        archil.getPersonInformation();

        archil.name = "Archil";
        archil.surname = "Sikharulidze";
        archil.age = 36;
        archil.height = 172;
        archil.weight = 81.4;
        archil.profession = "Java Developer";
        archil.backAccount = 3000;

        System.out.println("-".repeat(50));
        archil.getPersonInformation();

        System.out.println("-".repeat(50));
        archil.addMoneyToBankAccount(1978);

        System.out.println("-".repeat(50));
        archil.getMoneyFromBankAccount(4979); // Берем больше чем есть

        System.out.println("-".repeat(50));
        archil.getMoneyFromBankAccount(4978); // Берем ровно столько, сколько есть

        System.out.println("-".repeat(50));
        archil.addMoneyToBankAccount(-100);

        Person jennifer = new Person();
        jennifer.name = "Jennifer";
        jennifer.surname = "Johnson";
        jennifer.age = 21;
        jennifer.height = 169;
        jennifer.weight = 49.1;
        jennifer.profession = "Musician";
        jennifer.backAccount = 19_678;

        System.out.println("-".repeat(50));
        jennifer.getPersonInformation();

        System.out.println("-".repeat(50));
        System.out.println(archil); // address in the STACK
        System.out.println(jennifer); // address in the STACK
    }
}