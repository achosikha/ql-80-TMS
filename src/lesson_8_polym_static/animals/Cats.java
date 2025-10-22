package lesson_8_polym_static.animals;

public class Cats extends Animal{
    public Cats(String type, String color, int age, double weight, String sex) {
        super(type, color, age, weight, sex);
    }

    public void getCatsCall(){
        System.out.println("CATS CALL!");
    }
}
