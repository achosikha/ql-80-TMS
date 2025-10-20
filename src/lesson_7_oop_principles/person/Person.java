package lesson_7_oop_principles.person;

public class Person {
    // Базовые правила ООП
    // Инкапсуляция - encapsulation - СКРЫТИЕ ДАННЫЕ ОБЪЕКТА, КОТОРЫЕ НЕ ДОЛЖНЫ БЫТЬ ДОСТУПНЫ ПОЛЬЗОВАТЕЛЮ
    // Наследование - Inheritance
    // Полиморфизм - "один интерфейс, множественная реализация"

    // МОДИФИКАТОРЫ ДОСТУПА - ACCESS MODIFIERS
    // public - ПРАВО ДОСТУПА К ОБЪЕКТУ, КТО ИМЕЕТ ПРАВО НА КАКИЕ ДОСТУПЫ
    // private - закрывает доступ ВСЕМ! Все, что приватное доступно только внутри класса больше нигде
    // protected
    // package-private
    private String name; // null
    private String surname; // null
    private int age; // 0
    private int height; // 0
    private double weight; // 0.0
    private String profession; // null
    private double bankAccount;
    protected int protectedValue = 100; // ДОСТУП ПАКЕТ (т.е. если класс лежит в том же самом пакете) и
    // при наследовании, если есть дочерний класс

    // Если у вас не указан вообще модификатор доступа - то он дефолтно package-private
    int packagePrivateVariable = 101; // Если в ПАКЕТЕ

    // У ВАС НЕТ КОНСТРУКТОРА
    // В КАЖДОМ ОБЪЕКТЕ ЕСТЬ КОНСТРУКТОРК
    // Он или добавляется программистом или НА ЭТАПЕ КОМПИЛЯЦИИ ДОБАВЛЯЕТСЯ КОМПИЛЯТОРОМ
    // КОНСТРУКТОРК - специальный СТАТИЧЕСКИЙ МЕТОД, который задает изначальные значения, условия для объекта
    // КОМПИЛЯТОР МОЖЕТ ЗАДАТЬ ЛИШЬ ДЕФОЛТНЫЙ КОНСТРУКТОР - ОНИ НИЧЕГО НЕ ПРИНИМАЕТ И НИЧЕГО ВНУТРИ НЕ ДЕЛАЕТ
    // ПРОСТО ПОЗВОЛЯЕТ СОЗДАТЬ ОБЪЕКТ

    // Constructor overload - перегрузка метода, в нашем случае, конструктора
    public Person(){} // Default constructor

    public Person(String myName, String mySurname){
        name = myName;
        surname = mySurname;
        profession = "Unknown";
    }

    // Если мы САМИ добавили какой-нибудь конструктор, то КОМПИЛЯТОР УЖЕ НИЧЕГО НЕ БУДЕТ САМОСТОЯТЕЛЬНО ДЕЛАТЬ
    // ОТНЫНЕ, МЫ ДОЛЖНЫ ВСЕ САМИ СДЕЛАТЬ И УЧЕСТЬ
    public Person(String myName, String mySurname, int myAge, int myHeight,
                  double myWeight, String myProfession, double myBankAccount){
        name = myName;
        surname = mySurname;
        age = myAge;
        height = myHeight;
        weight = myWeight;
        profession = myProfession;
        bankAccount = myBankAccount;
    }

    // get & set
    // ВСЕГДА К ПОЛЯМ КЛАССА, т.е. к переменным уровень класс надо обращаться через посредников, а не напрямую
    // это защищает от возможных ошибок и нежелательного поведения
    // Метод посредник - это метод, через который вы обращаетесь к переменным класса
    // Они ограничивают операции, которые вы можете провести над переменными класса
    // Некоторые просто читают - get
    // А некоторые только задают значения - set


    public void addMoneyToBankAccount(double money){
        if (money > 0){
            System.out.println("You have added: " + money);
            bankAccount += money;
            System.out.println("Your bank account balance is: " + bankAccount);
        } else {
            System.out.println("You can't add negative number or 0 to your bank account balance!");
            System.out.println("Your bank account balance is: " + bankAccount);
        }
    }

    public void getMoneyFromBankAccount(double money){
        if (bankAccount >= money){
            bankAccount -= money;
            System.out.println("You have withdrawn: " + money);
            System.out.println("Your bank account balance is: " + bankAccount);
        } else {
            System.out.println("You don't have enough money to withdraw: " + money);
            System.out.println("Your bank account balance is: " + bankAccount);
        }
    }

    // Для задания значений переменным, КОТОРЫЕ ДОЛЖНЫ МЕНЯТЬ!!!! ЕСЛИ ОНИ НЕ ДОЛЖНЫ, ТО И МЕТОДЫ НЕНУЖНЫ
    // Для таких переменных надо создать set метод
    public void setAge(int myAge){
        age = myAge;
    }

    public void setProfession(String myProfession){
        profession = myProfession;
    }

    public void setBankAccount(double myBankAccount){
        bankAccount = myBankAccount;
    }

    // ТОЛЬКО ЕСЛИ НАМ НУЖНО ПРОЧИТАТЬ ПЕРЕМЕННЫЕ МЫ СОЗДАЕМ МЕТОДЫ ДЛЯ ЧТЕНИЯ
    // Такой метод называет - get
    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public double getBankAccount(){
        return bankAccount;
    }

    // Когда я могу создавать два и более метода с одинаковыми именами, но с разными параметрами
    // Это называется ПЕРЕГРУЗКОЙ МЕТОДА
    // У каждого метода ЕСТЬ СИГНАТУРА - т.е. подпись
    // Сигнатура - это имя метода и его параметры
    // Чтобы сделать перегрузку метода, надо изменить количество или расстановку параметров или тип параметров
    public void getAdditionalInformation(String msg){
        System.out.println("your additional information is: ".toUpperCase() + msg);
    }

    public void getAdditionalInformation(){
        System.out.println("you have no additional information!".toUpperCase());
    }

    // Не может быть доступно извне для инициирования
    private void initiateMethod(){}

    public void getPersonInformation(){
        System.out.println("Person data is: ");
        System.out.println("\tName: " + name);
        System.out.println("\tSurname: " + surname);
        System.out.println("\tAge: " + age);
        System.out.println("\tHeight: " + height);
        System.out.println("\tWeight: " + weight);
        System.out.println("\tProfession: " + profession);
        System.out.println("\tBank account: " + bankAccount);
    }

    // САМЫЙ РАСПРОСТРАНЕННЫЙ ПОЛИМОРФИЗМ
    @Override // Аннотация - она нужна для того, чтобы вы подсказали компилятору
    // У меня есть МОЙ ОТЕЦ КЛАСС - ИЛИ СУПЕР-КЛАСС - ИЛИ БАЗОВЫЙ КЛАСС
    // В нем есть такой метод и я буду сейчас задавать свою реализацию этого метода
    // А ты проверь пожалуйста и убедись, что такой метод реально есть у моего СУПЕР-КЛАССА
    // Если ты не найдешь такой метод - выведи ошибку
    // Когда мы хотим сделать полиморфизм мы ПРОСТО МЕНЯЕМ ТЕЛО МЕТОДА
    // САМУ ЕГО СИГНАТУРУ ВООБЩЕ НЕ ТРОГАЕМ
    // Такой подход называется - ПЕРЕОПРЕДЕЛЕНИЕМ (Overload)
    public String toString(){
        return "Person data is: \n" +
                "\tName: " + name + "\n" +
                "\tSurname: " + surname + "\n" +
                "\tAge: " + age + "\n" +
                "\tHeight: " + height + "\n" +
                "\tWeight: " + weight + "\n" +
                "\tProfession: " + profession + "\n" +
                "\tBank account: " + bankAccount;
    }
}