package lesson_7_oop_principles;

import lesson_7_oop_principles.cars.BMW;
import lesson_7_oop_principles.cars.Car;
import lesson_7_oop_principles.cars.Mercedes;
import lesson_7_oop_principles.cars.Opel;
import lesson_7_oop_principles.person.Female;
import lesson_7_oop_principles.person.Male;
import lesson_7_oop_principles.person.Person;

// Специальные классы для работы с большими числами и точностью
// BigDecimal
// BigInteger

public class MyOOP {
    public static void main(String[] args) {
        // OOP - principles
        createCarGallery();
    }

    public static void createCarGallery(){
        Car[] cars = new Car[]{
                new Car("General Car", "General Color", 0),
                new Mercedes("Mercedes", "Black", 2022),
                new Opel("Opel", "Grey", 2005),
                new BMW("BMW", "White", 2019),
                new Mercedes("Mercedes", "Red", 2018),
                new Opel("Opel", "Red", 2001)
        };

        // enhanced-for
        for (Car car : cars){
            System.out.println(car);
            car.startEngine("N/A");
        }
    }

    public static void createMaleFemale(){
        Person male = new Male("Steve", "Smithson", 23, 178,
                67.8, "Trainer", 456.22);
        Person female = new Female("Sara", "Connor", 50,
                168, 45.6, "Soldier", 4693.34);

        System.out.println(male);
        System.out.println("-".repeat(50));
        System.out.println(female);
        System.out.println("-".repeat(100));
        male.getPersonInformation();
        System.out.println("-".repeat(100));
        female.getPersonInformation();
    }

    public static void createPolymorphicPerson(){
        // Во главе всех объектов есть СУПЕР-КЛАСС Object
        // У него есть свойства и поведения
        // Среди поведений есть метод toString()
        // Если от отца автоматом принимают все другие объекты
        Person john = new Person("John", "Johnson", 26,
                184, 90.1, "Coach", 45958);

        // Object -> toString() который возвращает ссылку
        // Но у меня унаследованный метод возвращает то, что я хочу
        System.out.println(john); // john == john.toString()

        // В Object он стандартно дает вам адрес в стеке на кучу
        // Но ЧТО ЕСЛИ Я ХОЧУ ПОМЕНЯТЬ ПОВЕДЕНИЕ ЭТОГО НАСЛЕДУЕМОГО МЕТОДА?
        // Т.Е. СКАЗАТЬ: у супер-класса есть свое поведение, а я хочу специально для себя задать другое
        // Это и есть ПОЛИМОРФИЗМ - У НАС ОДИН МЕТОД У МНОЖЕТСВА ОБЪЕКТОВ, НО В ЗАВИСИМОСТИ ОТ ТОГО ЧТО МЫ ДАДИМ
        // РЕАЛИЗАЦИЯ ЭТОГО ОБЪЕКТА РАЗНАЯ
    }

    public static void createPerson(){
        Person archil = new Person("Archil", "Sikharulidze", 37,
                172, 83.4, "Java Developer", 3410);

        archil.getPersonInformation();

        System.out.println("-".repeat(50));

        Person dima = new Person();
        dima.getPersonInformation();

        System.out.println("-".repeat(50));

        Person jennifer = new Person("Jennifer", "Johnson");
        jennifer.getPersonInformation();
        jennifer.getAdditionalInformation("she is currently unemployed".toUpperCase());
        jennifer.setAge(24);
        jennifer.setProfession("QA Java");
        jennifer.setBankAccount(2340);

        System.out.println("-".repeat(50));
        jennifer.getPersonInformation();
        System.out.println("-".repeat(50));
        System.out.println("Jennifer's bank account balance is: " + jennifer.getBankAccount());
        System.out.println("Jennifer's surname is: "+ jennifer.getSurname());
        System.out.println("-".repeat(50));
    }
}