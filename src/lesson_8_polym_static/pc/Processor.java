package lesson_8_polym_static.pc;

public class Processor {
    private final String model;
    private final int cores;
    private final double speed;

    public Processor(String model, int cores, double speed) {
        this.model = model;
        this.cores = cores;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "\t\tModel: " + model + "\n" +
                "\t\tCores: " + cores + "\n" +
                "\t\tSpeed: " + speed;
    }
}
