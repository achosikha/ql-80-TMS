package lesson_7_oop_principles.cars;

public class Car {
    private String carModel;
    private String carColor;
    private int productionYear;

    public Car(String myCarModel, String myCarColor, int myProductionYear){
        carModel = myCarModel;
        carColor = myCarColor;
        productionYear = myProductionYear;
    }

    public void startEngine(String msg){
        System.out.println("Car starts engine with the following message: " + msg);
    }

    public void startEngine(){
        System.out.println("Car starts engine with the following message: ");
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "\tModel: " + carModel + "\n" +
                "\tColor: " + carColor + "\n" +
                "\tProduction year: " + productionYear;
    }
}
