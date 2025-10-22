package lesson_8_polym_static.pc;

public class VGA {
    private final String company;
    private final String model;
    private final double memory;
    private final String[] additional;

    public VGA(String company, String model, double memory, String[] additional) {
        this.company = company;
        this.model = model;
        this.memory = memory;
        this.additional = additional;
    }

    private String readAdditionalArray(){
        String stringArray = "\t\t\t\t\t";

        for (String element : additional){
            stringArray += element + "\n\t\t\t\t\t";
        }

        return stringArray;
    }

    @Override
    public String toString() {
        return "\t\tCompany: " + company + "\n" +
                "\t\tModel: " + model + "\n" +
                "\t\tMemory: " + memory + "\n" +
                "\t\tAdditional: \n" + readAdditionalArray();
    }
}