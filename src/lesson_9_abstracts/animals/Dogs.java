package lesson_9_abstracts.animals;

public abstract class Dogs extends Wolfs{
    public Dogs(String name, String type, int born) {
        super(name, type, born);
    }

    public abstract void bark();
}