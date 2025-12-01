package lesson_18_api_stream;

public class MyMain {
    public static void main(String[] args) {
        // Какие интерфейсы чаще всего используют лямбда выражения
        // FunctionalInterfaces
        throwMessage();
    }

    public static void throwMessage(){
        Message msg = (message) -> "You got message that consists from a few strings.\n"
                + message +
                "\nDONE.";

        System.out.println(msg.getFullMsg("Welcome to Java Lambda expression pushed by Interface Message..."));
    }

    public static void useLambdaCalculate(){
        Calculate calculate = (x, y) -> x * y;
        int sum = calculate.calculate(19, 4);

        System.out.println(sum);
    }

    public static String useSwitch(String msg){
        return switch (msg){
            case "MONDAY" -> "Welcome to " + msg;
            case "TUESDAY" -> "Welcome to TUESDAY" + msg;
            default -> "There is no such day!";
        };
    }
}
