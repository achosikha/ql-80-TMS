package lesson_17_coll_gen_lambda.gen;

// ?
// extends
// super

// Я хочу иметь возможность вставлять ТОЛЬКО ТО, что является ЧИСЛОМ - Number
public class GenericWildCards <T extends Number>{ // наследуется от ЧИСЛА
    private final T value;

    public GenericWildCards(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
