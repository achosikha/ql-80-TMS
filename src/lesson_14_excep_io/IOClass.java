package lesson_14_excep_io;

import java.io.*;

public class IOClass {
    public static void main(String[] args) {
        // I/O - Standard INPUT/OUTPUT
        // Input - чтение
        // Output - запись

        // FileInputStream - читает
        // FileOutputStream - запись
        writeFileOutput();

        // FileReader
        // FileWriter

        // BufferedReader
        // BufferedWriter
    }

    public static void readWriteStream(){
        // ПОТОК ДАННЫХ не может дать все РАЗОМ
        // Он дает частями, и обычно это БИТЫ т.е. числовые значения данных
        try(FileInputStream file = new FileInputStream("src/lesson_14_excep_io/message.txt")){
            // ПОТОК - one byte per reading
            // EOF - end-of-file, у некоторых это может РАБОТАТЬ
            // Классика ЖАНРА: -1
            int letter;

            while((letter = file.read()) != -1){
                System.out.print((char) letter);
            }
        } catch (FileNotFoundException e){
            System.out.println("We couldn't find a FILE: " + e.getMessage());
        } catch (IOException e){
            System.out.println("We got some UNEXPECTED exception: " + e.getMessage());
        }
    }

    public static void writeFileOutput(){
        // Класс, который может записывать имеет два параметра - адрес файла, и логическое разрешение
        // ПЕРЕЗАПИСЫВАТЬ или ДОБАВЛЯТЬ К УЖЕ СУЩЕЮСТВУЮЩЕМУ ТЕКСТУ
        try(FileOutputStream write = new FileOutputStream("src/lesson_14_excep_io/message.txt", true)){
            String msg = "\nGoodbye my friend!\n";

            for(int index = 0; index < msg.length(); index++){
                write.write(msg.charAt(index));
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void useFileReader(){
        try(FileReader file = new FileReader("src/lesson_14_excep_io/message.txt")){
            int letter;

            while((letter = file.read()) != -1){
                System.out.print((char) letter);
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
