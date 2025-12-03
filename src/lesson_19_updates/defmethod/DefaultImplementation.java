package lesson_19_updates.defmethod;

// Сказать ЧТО, но не КАК
// У интерфейса не было принадлежавших ему реализаций
public interface DefaultImplementation {
    void getMSG();
    void run();

    default void unnecessaryMethod(){
        System.out.println("You can implement or you may leave it.");
    }

    default void setMsg(){
        System.out.println("This is a DEFAULT method implementation...");
    }

    static int value = 10;

    static String getGeneralInformation() {
        return "General information!";
    }
}