package lesson_9_abstracts.controlpanel;

// ПОЛНАЯ АБСТРАКЦИЯ
// Интрефейс по своей идее означает - НИКАКОЙ РЕАЛИЗАЦИИ ИЛИ ХРАНЕНИЯ ДАННЫХ
// ТОЛЬКО УКАЗАНИЯ ТОГО, ЧТО ОБЪЕКТ ДОЛЖЕН УМЕТЬ ДЕЛАТЬ, НО НЕ "КАК"
public interface ControlTV {
    public void turnOnTV();
    public void turnOffTV();
    public void increaseVoice();
    public void decreaseVoid();
    public void channelUp();
    public void channelDown();
    public String getTVControlData();
}
