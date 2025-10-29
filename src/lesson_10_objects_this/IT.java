package lesson_10_objects_this;

// Для обхода создания множества перегруженных конструкторов используется - LOMBOK
// public record IT(String name, String surname, String position){}
public class IT {
    private final String name;
    private final String surname;
    private final String position;

    // this() - вызов конструктора и может быть использован только в другом конструкторе
    // this
    public IT(){
        this("Unknown", "Unknown", "Unknown");
    }

    public IT(String name, String surname, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    // this -> DON'T GIVE ME ADDRESS
    @Override
    public String toString() {
        return "IT{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}