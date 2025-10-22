package lesson_8_polym_static.delegate;

public class Action {
    public void makeMove(String msg){
        switch (msg){
            case "UP" -> System.out.println("GOES UP!");
            case "DOWN" -> System.out.println("GOES DOWN!");
            case "LEFT" -> System.out.println("GOES LEFT!");
            case "RIGHT" -> System.out.println("GOES RIGHT!");
            default -> System.out.println("WRONG MOVE!");
        }
    }

    public void run(){
        System.out.println("Person RUNS!");
    }
}