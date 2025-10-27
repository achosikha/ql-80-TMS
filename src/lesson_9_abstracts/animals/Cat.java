package lesson_9_abstracts.animals;

public class Cat extends Cats{
    public Cat(String name, String type, int born) {
        super(name, type, born);
    }

    @Override
    public void jumpLikeCat() {
        super.jumpLikeCat();
        System.out.println("Yes this" + this.getClass().getSimpleName() + " does it well!");
    }
}
