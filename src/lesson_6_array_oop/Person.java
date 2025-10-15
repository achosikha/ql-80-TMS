package lesson_6_array_oop;

// OOP - В Джаве все ЕСТЬ ОБЪЕКТ
// Никто в ДЖАВЕ не существует вне ОБЪЕКТА
// class создает ШАБЛОН ОБЪЕКТА - Person
// Главный объект внутри файла всегда должен быть публичным
// В файле может быть несколько ОБЪЕКТОВ, но ГЛАВНЫЙ ВСЕГДА БУДЕТ ПУБЛИЧНЫМ
// Желательно НЕ СОЗДАВАТЬ НЕСКОЛЬКО ОБЪЕКТОВ В ОДНОМ ФАЙЛЕ
// Стандарт: Один документ - Один Объект - Объект это существительное
public class Person {
    // static нужен только в редких случаях, или же когда у нас надо обращаться из main()
    // Поля класса или же ПЕРЕМЕННЫЕ УРОВНЯ КЛАСС

    // ВСЕ ПОЛЯ КЛАССА ИЛИ ПЕРМЕННЫЕ УРОВНЯ КЛАСС ВСЕГДА АВТОМАТИЧЕСКИ ИНИЦИАЛИЗИРУЮТСЯ ДЕФОЛТНЫМИ ЗНАЧЕНИЯ
    public String name; // null
    public String surname; // null
    public int age; // 0
    public int height; // 0
    public double weight; // 0.0
    public String profession; // null
    public double backAccount;

    public void addMoneyToBankAccount(double money){
        if (money > 0){
            System.out.println("You have added: " + money);
            backAccount += money;
            System.out.println("Your bank account balance is: " + backAccount);
        } else {
            System.out.println("You can't add negative number or 0 to your bank account balance!");
            System.out.println("Your bank account balance is: " + backAccount);
        }
    }

    public void getMoneyFromBankAccount(double money){
        if (backAccount >= money){
            backAccount -= money;
            System.out.println("You have withdrawn: " + money);
            System.out.println("Your bank account balance is: " + backAccount);
        } else {
            System.out.println("You don't have enough money to withdraw: " + money);
            System.out.println("Your bank account balance is: " + backAccount);
        }
    }

    public void getPersonInformation(){
        System.out.println("Person data is: ");
        System.out.println("\tName: " + name);
        System.out.println("\tSurname: " + surname);
        System.out.println("\tAge: " + age);
        System.out.println("\tHeight: " + height);
        System.out.println("\tWeight: " + weight);
        System.out.println("\tProfession: " + profession);
        System.out.println("\tBank account: " + backAccount);
    }
}