package lesson_9_abstracts.controlpanel;

public class SamsungControlPanel extends ControlSmartTV{
    public SamsungControlPanel(String model, String mark) {
        super(model, mark);
    }

    @Override
    public void turnOnInternet() {
        System.out.println(this.getClass().getSimpleName() + " turned on INTERNET.");
    }

    @Override
    public void turnOffInternet() {
        System.out.println("GOODY INTERNET!");
    }

    @Override
    public void speedTest() {
        System.out.println("Your INTERNET SPEED IS...");
    }

    @Override
    public void smartTV() {
        System.out.println("Your smart tv data is...");
    }

    @Override
    public String getInternetInformation() {
        return "Your interned data is...";
    }

    @Override
    public void turnOnTV() {
        System.out.println("TV IS TURNED ON!");
    }

    @Override
    public void turnOffTV() {
        System.out.println("TV IS TURNED OFF!");
    }

    @Override
    public void increaseVoice() {
        System.out.println("VOICE INCREASED BY 1!");
    }

    @Override
    public void decreaseVoid() {
        System.out.println("VOICE DECREASED BY 1!");
    }

    @Override
    public void channelUp() {
        System.out.println("CHANNEL UP!");
    }

    @Override
    public void channelDown() {
        System.out.println("CHANNEL DOWN!");
    }

    @Override
    public String getTVControlData() {
        return "The whole SMART TV DATA, INCLUDING TV AND INTERNET IS...";
    }
}
