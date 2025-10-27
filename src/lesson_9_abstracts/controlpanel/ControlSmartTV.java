package lesson_9_abstracts.controlpanel;

// 1 functional - TV
// 2 functional - Internet
public abstract class ControlSmartTV implements ControlTV, ControlInternet{
    private final String model;
    private final String mark;

    public ControlSmartTV(String model, String mark) {
        this.model = model;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "ControlSmartTV{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}