package lesson_9_abstracts.animals;

public class Lions extends Cats{
    public Lions(String name, String type, int born) {
        super(name, type, born);
    }

    @Override
    public void jumpLikeCat() {
        super.jumpLikeCat();
        System.out.println("Well " + this.getClass().getSimpleName() + " cannot do this.");
    }

    public void lionsRoar(){
        System.out.println("Lions don't MEW they ROAR!");
    }
}
