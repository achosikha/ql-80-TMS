package lesson_8_polym_static.pc;

public class BaseBoard {
    private final String type;
    private final String model;
    private final int slots;

    public BaseBoard(String type, String model, int slots) {
        this.type = type;
        this.model = model;
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "\t\tType: " + type + "\n" +
                "\t\tModel: " + model + "\n" +
                "\t\tSots: " + slots;
    }
}
