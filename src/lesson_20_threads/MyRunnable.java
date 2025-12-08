package lesson_20_threads;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int index = 1; index <= 5; index++){
            System.out.println(Thread.currentThread().getName());
            System.out.println("*****");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
