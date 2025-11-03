package homework;

public class ExampleForTeacher {
    public static void main(String[] args) {
        Lion lion = new Lion("lion", "alex", 2020);
        //(Первый случай)
        System.out.println(lion.toString().toUpperCase());
        //(Второй случай)
        System.out.println(lion);
        lion.makeNoise();
    }
}