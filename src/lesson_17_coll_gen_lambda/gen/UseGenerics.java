package lesson_17_coll_gen_lambda.gen;

// GENERICS - ОБОБЩЕНИЯ
// ArrayList<T> == UseGenerics<T>
public class UseGenerics <T> { // Т сокращенное от Type (тип)
    private final T t; // Объявляем переменную T (type) полем класса

    public UseGenerics(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }
}