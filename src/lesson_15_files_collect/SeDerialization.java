package lesson_15_files_collect;

import java.io.*;

public class SeDerialization {
    public static void main(String[] args) {
        // Save object
        // serializeObject();
        // System.out.println("OBJECT SAVE.");
        System.out.println("-".repeat(50));
        System.out.println("Let's read OBJECT: ");
        deSerializeObject();
    }

    public static void serializeObject(){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("src/lesson_15_files_collect/readObject.txt"));
            objectOutputStream.writeObject(
                    new Person("Archil", "Sikharulidze", 37, "Java Developer"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deSerializeObject(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("src/lesson_15_files_collect/readObject.txt"));

            // OBJECT -> Person
            Person archil = (Person) objectInputStream.readObject();
            System.out.println(archil);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
