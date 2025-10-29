package lesson_10_objects_this.interf;

public class Female extends Person{
    protected Female(String name, String surname, int bornYear) {
        super(name, surname, bornYear);
    }

    @Override
    public void works() {
        System.out.println("WOMEN WORK HARD!");
    }

    @Override
    public void draws() {
        System.out.println("SOME WOMEN DRAW!");
    }

    @Override
    public boolean compare(Person person) {
        return false;
    }
}