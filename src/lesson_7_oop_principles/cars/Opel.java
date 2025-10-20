package lesson_7_oop_principles.cars;

public class Opel extends Car{
    public Opel(String myCarModel, String myCarColor, int myProductionYear) {
        super(myCarModel, myCarColor, myProductionYear);
    }

    @Override
    public void startEngine() {
        System.out.println("OPEL starts engine!");
    }

    @Override
    public void startEngine(String msg) {
        System.out.println("OPEL starts engine with the following msg: " + msg);
    }
}
