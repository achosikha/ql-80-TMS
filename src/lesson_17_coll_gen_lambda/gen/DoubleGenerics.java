package lesson_17_coll_gen_lambda.gen;

// TreeMap<K, V> == DoubleGenerics<K, V>
public class DoubleGenerics <K, V>{
    private final K key;
    private final V value;

    public DoubleGenerics(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Your key and value are: \n" +
                "\tKey: " + key + "\n" +
                "\tValue: " + value + "\n";
    }
}
