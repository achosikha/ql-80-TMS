package lesson_19_updates.defmethod;

public class Person {
    private final String name;
    private final String surname;
    private final String gender;
    private final int salary;

    public Person(String name, String surname, String gender, int salary) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
