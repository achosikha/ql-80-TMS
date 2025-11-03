package homework;

public class Lion extends Animal {

    public Lion(String type, String name, int born) {
        super(type, name, born);
    }

    // (Первый случай)
//    @Override
//    public String toString() {
//        return "Lion{}" + super.toString();
//    }

// (Второй случай)
    @Override
    public String toString() {
        return "Lion{}" + super.toString().toUpperCase();
    }

    @Override
    public void makeNoise() {
        System.out.println("lion - rawr");
    }
}
