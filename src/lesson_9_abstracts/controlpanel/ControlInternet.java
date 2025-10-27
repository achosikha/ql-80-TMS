package lesson_9_abstracts.controlpanel;

// // ПОЛНАЯ АБСТРАКЦИЯ
public interface ControlInternet {
    public void turnOnInternet();
    public void turnOffInternet();
    public void speedTest();
    public void smartTV();
    public String getInternetInformation();
}