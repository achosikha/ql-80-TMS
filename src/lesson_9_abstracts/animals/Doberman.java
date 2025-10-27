package lesson_9_abstracts.animals;

public final class Doberman extends Dogs{
    public Doberman(String name, String type, int born) {
        super(name, type, born);
    }

    @Override
    public void bark() {
        // THIS CAME FROM ABSTRACT CLASS DOGS
    }

    @Override
    public void makeNoise() {
        System.out.println("Doberman BARKS!");
    }
}