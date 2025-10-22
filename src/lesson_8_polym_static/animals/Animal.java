package lesson_8_polym_static.animals;

public class Animal {
    private final String type;
    private final String color;
    private final int age;
    private final double weight;
    private final String sex;
    private static int counter; // static ОБЩИЙ ДЛЯ ВСЕХ РЕАЛИЗАЦИЙ ЭТОГО КЛАССА

    static{
        // РАНЬШЕ ЛЮБОГО ЭКЗЕМПЛЯРА КЛАССА СДЕЛАЕТ ОПРЕДЕЛЕННЫЕ ОПЕРАЦИИ
    }

    // static под копотом, поскольку конструктор общий для всех
    public Animal(){
        this("Unknown", "Unknown", -1, -1, "Unknown");
    }

    private Animal(String type, String color){
        this(type, color, -1, -1, "Unknown");
    }

    public Animal(String type, String color, int age, double weight, String sex) {
        this.type = type;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        counter++;
    }

    public static int getStaticCounter() {
        return counter;
    }

    // Нестатический метод использует статическую переменную
    public int getCounter(){
        return counter;
    }

    // Я СДЕЛАЮ НЕ ПЕРЕОПРЕДЕЛЯЕМЫМ - ПУСТЬ ОН БУДЕТ ОДНИМ ДЛЯ ВСЕХ
    // В описании метода слово final запрещает его ПЕРЕОПРЕДЕЛЯТЬ
    public final void getAnimalCall(){
        System.out.println("This is ANIMAL CALL!");
    }

    public static Animal createViaPrivateConstructor(){
        return new Animal("Lion", "Yellow");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", sex='" + sex;
    }
}