package lesson_10_objects_this.interf;

// Посмотреть интерфейсы: Comparable, Comparator, Cloneable
public abstract class Person implements ComparePerson, Cloneable {
    private final String name;
    private final String surname;
    private final int bornYear;

    protected Person(String name, String surname, int bornYear) {
        this.name = name;
        this.surname = surname;
        this.bornYear = bornYear;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBornYear() {
        return bornYear;
    }

    public abstract void works();
    public abstract void draws();

    /*
    @Override
    public boolean equals(Object obj) {
        // MY PERSON CODE FOR EQUALS
    }
     */

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bornYear=" + bornYear +
                '}';
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
            return (Person) super.clone();
    }
}