package lesson_17_coll_gen_lambda.gen;

import java.util.Arrays;

public class GenericArrayList <T>{
    // ArrayList
    // 1. Проверка ВМЕЩЯЕМОСТИ
    // 2. Метод, который вкладывает значения
    // 3. Метод, который удаляет значения
    // 4. Метод, который в случае надобности расширения будет переопределять МАССИВ
    T[] elements;

    public GenericArrayList(T[] elements){
        this.elements = elements;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}