package lesson_8_polym_static.animals;

public class Cat extends Cats{
    public Cat(String type, String color, int age, double weight, String sex) {
        super(type, color, age, weight, sex);
    }

    @Override
    public void getCatsCall() {
        System.out.println("Cat CALLS!");
    }
}
