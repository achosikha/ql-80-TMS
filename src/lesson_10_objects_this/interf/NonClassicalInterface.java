package lesson_10_objects_this.interf;

public interface NonClassicalInterface {
    // НЕКЛАССИЧЕСКАЯ РЕАЛИЗАЦИЯ ИНТЕРФЕЙСОВ
    // ЕСТЬ ВОЗМОЖНОСТЬ ДОБАВЛИТЬ ПЕРЕМЕННЫЕ
    // ЕСТЬ ВОЗМОЖНОСТЬ ДОБАВЛЯТЬ ДЕФОЛТНУЮ РЕАЛИЗАЦИЮ ТЕЛА МЕТОДА
    // ЕСТЬ ВОЗМОЖНОСТЬ ДОБАВЛЯТЬ STATIC-NON-STATIC METHODS

    // ПЕРЕМЕННЫЕ - ПУБЛИЧНЫМИ, не могут быть иного типа
    // ВСЕ ПЕРЕМЕННЫЕ ОБЩИЕ - статические
    // И ВСЕ ПЕРЕМЕННЫЕ КОНСТАНТЫ - они по существу public static final
    String NAME = "Archil";
    String SURNAME = "Surname";
    int bornYear = 1988;

    void works();
    default void draws(){
        System.out.println("This is a DEFAULT realization of the method DRAW.");
    }
}