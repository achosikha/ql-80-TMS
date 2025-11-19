package lesson_15_files_collect;

import java.io.Serializable;

public class Person implements Serializable {
    private final String name;
    private final String surname;
    private final int age;
    private final String occupation;
    // private int additional = 100; -> Если вы сохранили объекты до изменений, их вставить будет невозможно!

    public Person(String name, String surname, int age, String occupation) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}