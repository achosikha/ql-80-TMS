package lesson_7_oop_principles.person;

// extends - используется только для наследования
public class Male extends Person {
    // Для того, чтобы закончить процесс наследования
    // Нужно объявить конструктор в котором будет ВСЕГДА ПЕРВОЙ СТРОЧКОЙ ВЫЗЫВАТЬСЯ
    // КОНСТРУКТОР СУПЕР-КЛАССА, в данном случае, у нас вызывается конструктор объекта Person из пяти переменных
    public Male(String myName, String mySurname, int myAge, int myHeight,
                double myWeight, String myProfession, double myBankAccount){
        super(myName, mySurname, myAge, myHeight, myWeight, myProfession, myBankAccount);
        System.out.println("New class instance of Male has been created!");
    }

    // Переопределение - сказать, что метод из класса Person -> getPersonInformation() для экземпляров класса
    // Male должен вести себя по-другому, а как мы скажем
    @Override
    public void getPersonInformation() {
        System.out.println("This method had been inherited from super-class Person.");
        System.out.println("You shouldn't use it to get Person Data. Instead apply toString() method.");
        System.out.println("It means [CODE]: System.out.println(\"class_instance\");");
        System.out.println("GOODBYE!");
    }
}