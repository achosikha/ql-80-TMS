package lesson_17_coll_gen_lambda.gen;

public class FruitGeneric <T extends Fruits>{
    private final T fruit;

    public FruitGeneric(T fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return fruit.toString();
    }
}