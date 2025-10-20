package lesson_7_oop_principles.cars;

public class Mercedes extends Car{
    public Mercedes(String myCarModel, String myCarColor, int myProductionYear) {
        super(myCarModel, myCarColor, myProductionYear);
    }

    @Override
    public void startEngine() {
        System.out.println("MERCEDES starts engine!");
    }

    @Override
    public void startEngine(String msg) {
        System.out.println("MERCEDES starts engine with the following msg: " + msg);
    }
}
