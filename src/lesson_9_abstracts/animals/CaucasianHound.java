package lesson_9_abstracts.animals;

public final class CaucasianHound extends Dogs{
    public CaucasianHound(String name, String type, int born) {
        super(name, type, born);
    }

    @Override
    public void bark() {
        // THIS CAME FROM ABSTRACT CLASS DOGS
    }

    @Override
    public void makeNoise() {
        System.out.println("Caucasian Hound barks!");
    }

    public void trackPredators(){
        System.out.println(this.getClass().getSimpleName() + " can track predators and defend family.");
    }
}