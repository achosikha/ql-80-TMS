package lesson_20_threads;

public class MyPersonalRunnable implements Runnable{
    @Override
    public void run() {
        for (int counter = 1; counter < 11; counter++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ", priority [" +
                    Thread.currentThread().getPriority() + "]: " + counter);
            try{
                Thread.sleep(1500); // этот поток пусть заснет на 1500 милисекунд - 1.5 секунды
            } catch (InterruptedException e) { // ПОТОК БЫЛ НЕПРАВИЛЬНО ПРЕРВАН/НЕОЖИДАННО
                System.out.println("Thread had been interrupted!");
            }
        }
    }

    synchronized void synchronizeThreads(){
        // ЭТО СПЕЦИАЛЬНЫЙ МЕТОД
        // Синхронизированный, который будет учитывать возможную гонку потоков
    }
}