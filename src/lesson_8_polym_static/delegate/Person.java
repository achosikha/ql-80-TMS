package lesson_8_polym_static.delegate;

public class Person {
    private final String name;
    private final String surname;
    private final Action action;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.action = new Action();
    }

    public void personMakesMove(String msg){
        action.makeMove(msg);
    }

    public void personRuns(){
        action.run();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", action=" + action +
                '}';
    }
}
