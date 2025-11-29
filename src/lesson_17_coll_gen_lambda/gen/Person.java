package lesson_17_coll_gen_lambda.gen;

public class Person {
    private final String name;
    private final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person: " + "\n" +
                "\tName: " + name + "\n" +
                "\tSurname: " + surname;
    }
}