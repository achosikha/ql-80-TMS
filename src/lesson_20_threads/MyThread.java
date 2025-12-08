package lesson_20_threads;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int num = 1; num <= 5; num++){
            System.out.println(this.getName() + ". Priority: " + this.getPriority());
            System.out.println("Value: " + num);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}