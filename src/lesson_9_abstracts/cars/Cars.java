package lesson_9_abstracts.cars;

public class Cars {
    private final String model;
    private final int productionYear;

    public Cars(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}