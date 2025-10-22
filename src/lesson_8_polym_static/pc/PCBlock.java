package lesson_8_polym_static.pc;

public class PCBlock {
    private final String type;
    private final String color;
    private final double weight;

    public PCBlock(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\t\tType: " + type + "\n" +
                "\t\tColor: " + color + "\n" +
                "\t\tWeight: " + weight;
    }
}