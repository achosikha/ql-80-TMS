package lesson_9_abstracts.animals;

public class Cats extends Animal{
    public Cats(String name, String type, int born) {
        super(name, type, born);
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getClass().getSimpleName() + "says: MEW...MEW!");
    }

    public void jumpLikeCat(){
        System.out.println(this.getClass().getSimpleName() + " always fall on their feet.");
    }
}