package lesson_8_polym_static.pc;

public class Cooler {
    private final String type;
    private final double power;
    private final double speed;

    public Cooler(String type, double power, double speed) {
        this.type = type;
        this.power = power;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "\t\tType: " + type + "\n" +
                "\t\tPower: " + power + "\n" +
                "\t\tSpeed: " + speed;
    }
}
