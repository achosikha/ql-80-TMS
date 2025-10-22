package lesson_8_polym_static.animals;

public class Lion extends Cats{
    public Lion(String type, String color, int age, double weight, String sex) {
        super(type, color, age, weight, sex);
    }

    @Override
    public void getCatsCall() {
        System.out.println("LIONS CALL!");
    }

    public void roar(){
        System.out.println("LION ROARS!");
    }
}
