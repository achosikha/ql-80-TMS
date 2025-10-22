package lesson_8_polym_static.animals;

public class Tiger extends Cats{
    public Tiger(String type, String color, int age, double weight, String sex) {
        super(type, color, age, weight, sex);
    }

    @Override
    public void getCatsCall() {
        System.out.println("TIGER CALL!");
    }
}
