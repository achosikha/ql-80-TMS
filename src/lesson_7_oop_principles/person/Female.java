package lesson_7_oop_principles.person;

public class Female extends Person{
    public Female(String myName, String mySurname, int myAge, int myHeight,
                double myWeight, String myProfession, double myBankAccount){
        super(myName, mySurname, myAge, myHeight, myWeight, myProfession, myBankAccount);
        System.out.println("New class instance of Female has been created!");
    }
}