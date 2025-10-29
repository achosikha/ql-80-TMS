package lesson_10_objects_this;

public class UseMyAddress {
    public static void main(String[] args) {
        // CODE
        // CLASS
        // ABSTRACT CLASS
        // INTERFACES

        // Program -> 20 variables -> НЕ УЧЕЛ ВОЗМОЖНОСТЬ ДОБАВЛЕНИЯ ЕЩЕ 20
        // Учитывают возможность расширения - БАЗУ где возьму 20 переменных, и оставлю пространство еще для 20
        createIT();
    }

    public static void createIT(){
        // new -> Stack (0x000rT4S) -> Heap (javadeveloper)
        // this - не может быть статическим, поскольку его идея ссылаться на адрес каждого экземпляра класса
        // где он вызывается

        // archil_java -> this -> у него собственный адрес
        IT archil_java = new IT("Archil", "Sikharulidze", "Java Developer");
        System.out.println(archil_java);
        // andrey_java -> this -> у него собстввенный адрес
        IT andrey_java = new IT("Andrey", "Kovzik", "Java Developer");
        System.out.println(andrey_java);
    }
}