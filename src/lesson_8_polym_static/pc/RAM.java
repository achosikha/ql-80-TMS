package lesson_8_polym_static.pc;

public class RAM {
    private final String model;
    private final String type;
    private final int size;

    public RAM(String model, String type, int size) {
        this.model = model;
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "\t\tModel: " + model + "\n" +
                "\t\tType: " + type + "\n" +
                "\t\tSize: " + size;
    }
}
