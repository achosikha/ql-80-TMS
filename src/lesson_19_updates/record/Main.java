package lesson_19_updates.record;

public class Main {
    public static void main(String[] args) {
        ITStaff staff = new ITStaff("Archil", "Sikharulidze", 37);

        // NEW version
        if (staff instanceof ITStaff archil){
            System.out.println(archil.hashCode());
        }
    }
}
