package lesson_15_files_collect;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class MyFiles {
    public static void main(String[] args) {
        // CODE
        readDocument();
    }

    public static void readDocumentReWrite(){
        // FileInputStream
        // FileReader
        // Scanner
        // Files
        // BufferedReader
        Scanner readDocument = null;
        try {
            // Scanner читает много всего
            // new Scanner(____) -> System.in (открывается клавиатуру для чтения
            readDocument = new Scanner(new File("src/lesson_15_files_collect/read.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (readDocument.hasNext()){ // Проверяет существования каких-либо доступных для чтения символов,
            // Если появится символ -1 (больше нечего читать)
            System.out.println(readDocument.nextLine()); // С нулевой позиции прочитает первую строку полностью
            // остановится каретку на начале следующей строки
            // Там будет поглощать и выводить их
        }

        // НАШЛИ САМОЕ ДЛИННОЕ СЛОВО
        // И записали его в новый документ
        // FileOutputStream
        // Если документ НЕ СУЩЕСТВУЕТ, ПОЖАЛУЙСТА СОЗДАЙ ЕГО
    }

    public static void readDocument(){
        // FileInputStream
        // FileOutputStream

        // FileWriter
        // FileReader

        // FILE - на самом деле, работает с директориями и непосредственно с документами
        File file = new File("src/lesson_15_files_collect/read.txt");

        // Проверить есть ли такой адрес в целом ?
        if(file.exists()){
            // Теперь убедиться, что это ФАЙЛ, а не каталог
            if(file.isFile()){
                //
            }
        }

        // BufferedReader - это один из самых эффективных и быстрых методов чтения и записи

        try {
            byte[] document = Files.readAllBytes(Path.of("src/lesson_15_files_collect/read.txt"));

            for (byte element : document){
                System.out.print((char) element);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
