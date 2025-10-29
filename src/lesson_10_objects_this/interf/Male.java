package lesson_10_objects_this.interf;

public class Male extends Person{
    protected Male(String name, String surname, int bornYear) {
        super(name, surname, bornYear);
    }

    @Override
    public void works() {
        System.out.println("MEN HAVE SOME VERY HARD JOBS!");
    }

    @Override
    public void draws() {
        System.out.println("DRAWS!");
    }

    @Override
    // this - возьми адрес объекта с помощью которого я тебя вызвал
    // Person передаем любой другой экземпляр класса
    public boolean compare(Person person) {
        // -1 (левая переменная больше)
        // 0 (равно)
        // 1 и больше нуля (правая переменная больше)
        // 0 ЛОЖЬ
        // ? > 0 истина
        return this.getName().equals(person.getName()) &&
                this.getSurname().equals(person.getSurname()) &&
                this.getBornYear() == person.getBornYear();
    }
}