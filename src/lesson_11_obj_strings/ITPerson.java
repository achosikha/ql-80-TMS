package lesson_11_obj_strings;

public class ITPerson {
    private final String name;
    private final String surname;
    private final int age;
    // private final String[] additional;

    public ITPerson(String name, String surname, int age/*, String[] additional*/) {
        this.name = name;
        this.surname = surname;
        this.age = age;

        // address -> СКОПИРОВАТЬ
        // this.additional = additional;
    }

    /*
    public ITPerson(ITPerson temp){
        // УЧЕСТЬ ГЛУБИННОЕ КОПИРОВАНИЕ - ЧТО ЕСЛИ В ОБЪЕКТЕ ДРУГОЙ ОБЪЕКТ?
    }
     */

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //
    @Override
    public boolean equals(Object obj) { // ITPerson -> Object
        // this -> экземпляр класса (ITPerson)
        // this.name.equals(obj.name))

        // this -> ITPerson
        // this.....
        // Object -> ITPerson - принудительное приведение типа
        // ITPerson -> Object

        // CHECK ????
        ITPerson temp = (ITPerson) obj; // "Archil" convert to ITPerson

        // boolean true || false
        // true = 1, false = 0

        return (this.name.equals(temp.name) && this.surname.equals(temp.surname) && this.age == temp.age);
    }

    // private final void cannotOverload()
    private void cannotOverload(){
        // FINAL
    }

    @Override
    public int hashCode() {
        // new Random().next(0, 2000);
        return 1; // ЗАЧАСТУЮ, Хэш-код нужен ДЛЯ БЫСТРОЙ ПРОВЕРКИ ОБЪЕКТОВ
    }

    @Override
    public String toString() {
        return "ITPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
