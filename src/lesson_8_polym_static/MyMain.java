package lesson_8_polym_static;

import lesson_8_polym_static.animals.Animal;
import lesson_8_polym_static.animals.Cats;
import lesson_8_polym_static.animals.Lion;
import lesson_8_polym_static.animals.Tiger;
import lesson_8_polym_static.delegate.Person;
import lesson_8_polym_static.pc.*; // * Java - ВСЕ или ЛЮБОЙ

public class MyMain {
    public static void main(String[] args) {
        // OOP: encapsulation, inheritance, polymorphism + ABSTRACTION
        // Проектирование ООП: наследование не самый популярный подход, более того, не всегда его можно и нужно
        // использовать...

        // Наследование - А является ли один объект под-классом другого объекта?
        // Животное - Млекопитающее - Обезьяна - Шимпанзе (тут логика - ЯВЛЯЕТСЯ, -is)

        // Больница - Здание больницы, Персонал
        // Class Hospital -> hospital building, Hospital -> personal
        // Сад - Камни, деревья, скамейки, освещение
        // Связь не ЯВЛЯЕТСЯ, а СОСТАВЛЯЕТ
        // Что камни, деревья, скамейки, животные - СОСТАВЛЯЮТ САД -> COMPOSITION (композиция)
        // Композиция (составляет) это отношение типа - ИМЕЕТ (has)
        // Сад имеет деревья, камни, скамейки, освещение...

        // Delegate - Делегирование третий подход к написанию ООП после наследования и композиции
        createZoo();
    }

    public static void createNestedAnimals(){
        // КЛАСС НА ОСНОВЕ КОТОРОГО МЫ СОЗДАЕМ ЭКЗЕМПЛЯРЫ КЛАССА И ПРЕДПРЕДЕЛЯЕТ ЕГО ФУНКЦИОНАЛ
        // ЧЕМ НИЖЕ ПО ИЕРАРХИИ КЛАСС, НА ОСНОВЕ КОТОРОГО СОЗДАЕТСЯ ЭКЗЕМПЛЯР, ТЕМ БОЛЬШЕ ФУНКЦИОНАЛА
        Animal lion = new Lion("Lion", "Yellow", 3, 120, "FEMALE");
        Animal cats = new Cats("Cats", "Grey", 10, 25, "MALE");
        Animal tiger = new Tiger("Tiger", "Yellow with DOTS", 3, 99, "FEMALE");

        lion.getAnimalCall();
        cats.getAnimalCall();
        tiger.getAnimalCall();
    }

    // non-static
    // Статические методы не могут обращаться к не-статическим вещам
    // Не-статические вещи свободно могут обращаться к статике
    public void getMsg(){
        System.out.println("Welcome to non-static method!");
    }

    public static void createZoo(){
        Animal[] zoo = new Animal[]{
                new Animal("Lion", "Yellow", 2, 100, "FEMALE"),
                new Animal("Wolf", "Grey", 3, 55, "MALE"),
                new Animal("Elephant", "Grey", 20, 1000, "Female")
        };

        for(Animal animal : zoo){
            System.out.println(animal);
        }

        Animal newAnimal = new Animal("Cat", "Black", 3, 20, "Female");

        System.out.println("How many times I used ANIMAL? " + zoo[0].getCounter());
        // Если вы пытаетесь обратиться к статическим элементам объекта - то УКАЖИТЕ ИМЯ ОБЪЕКТА и потом .
        System.out.println("How many times I used ANIMAL call static method: " + Animal.getStaticCounter());
    }

    public static void createAnimal(){
        Animal animal = new Animal();
        Animal animalPrivate = Animal.createViaPrivateConstructor();
        System.out.println(animalPrivate);
    }

    public static void makeDelegateAction(){
        Person archil = new Person("Archil", "Sikharulidze");
        archil.personMakesMove("UP");
        archil.personRuns();
    }

    public static void composePC(){
        PersonalComputer myPC = new PersonalComputer(
                new PCBlock("JK Asus972", "BLACK", 10),
                new BaseBoard("KL-98iT1", "Asus", 6),
                new Processor("i7", 8, 3.77),
                new RAM("Jh-1", "DDR5", 32),
                new Cooler("R-100", 220, 156),
                new HDD("Seagate", "SSD", 1),
                new VGA("Omicron-9000", "HJ-1", 1000,
                        new String[]{"SLOT-1 EMPTY", "SLOT-2 EMPTY", "SLOT-3 INJECTED RAM 16GB"})
        );

        System.out.println(myPC); // myPC -> HEAP под каким адресом
    }
}

/*
// Двух публичных классов в одном файле не может быть
// Поскольку, компилятор должен точно знать какой загрузочный
// Т.е. ключевое слово public говорит, что именно в нем есть main() и он привязан к документу
class Animal{
    private String type;
    private String name;
    private int age;

    Animal(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
 */