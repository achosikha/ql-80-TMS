package lesson_20_threads;

public class MyMain {
    public static void main(String[] args) {
        // Процесс - это уровень компьютер, и позволяет работать в нескольких программах одновременно
        // Это возможность называется много-процессорность

        // Thread
        // Classic
        // Class implements Runnable
        // Class extends Thread

        // Anonymous
        // Simply, inside the class announce Thread and Runnable
        workWithThreads();
    }

    public static void workWithThreads(){
        // Earlier, stop, pause
        // But these methods are not used anymore
        // Thread.currentThread().stop();
        // To wait until a THREAD dies - join()
        Thread t1 = new Thread(() -> {
            Thread.currentThread().setName("Thread 1");

           for (int num = 1; num <= 6; num++){
               System.out.println(Thread.currentThread().getName());
               System.out.println("Value: " + num);
               try {
                   Thread.sleep(1500);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });
        Thread t2 = new Thread(() -> {
            Thread.currentThread().setName("Thread 2");

            for (int num = -6; num <= 0; num++){
                System.out.println(Thread.currentThread().getName());
                System.out.println("Value: " + num);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t3 = new Thread(() -> {
            Thread.currentThread().setName("Thread 3");

            for (int num = 10; num >= 5; num--){
                System.out.println(Thread.currentThread().getName());
                System.out.println("Value: " + num);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // Запустить поток, и гарантировать, что до его окончания другие потоки не двинутся с места
        try {
            t1.start();
            System.out.println(t1.getName() + ": " + t1.isAlive());
            t1.join();
            System.out.println(t1.getName() + ": " + t1.isAlive());
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();
    }

    public static void getNonAnonymousLocalThread(){
        System.out.println("Let's count to 1'000'000'000 and check the time: ");

        long before = System.currentTimeMillis();
        System.out.println("Milliseconds before: " + before);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (long num = 1; num <=5_000_000_000L; num++){
                    // JUST EMPTY BODY
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (long num = 1; num <=5_000_000_000L; num++){
                // JUST EMPTY BODY
            }
        });

        t1.start();
        t2.start();
    }

    // How many seconds we need to serious calculations
    public static void countTimeToCalculateInThread(){
        System.out.println("Let's count to 1'000'000'000 and check the time: ");
        Thread.currentThread().setName("MAIN");
        System.out.println(Thread.currentThread());

        long before = System.currentTimeMillis();
        System.out.println("Milliseconds before: " + before);

        for (long num = 1; num <=10_000_000_000L; num++){
            // JUST EMPTY BODY
        }
        System.out.println("Milliseconds after: " + ((System.currentTimeMillis() - before)/1000));
    }

    public static void getLambdaThread(){
        // Classic
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Anonymous Thread");
                for (int num = 1; num <= 7; num++){
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Value: " + num);
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

        new Thread(() -> {
            Thread.currentThread().setName("Anonymous Lambda Thread");
            for (int num = 1; num <= 7; num++){
                System.out.println(Thread.currentThread().getName());
                System.out.println("Value: " + num);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    public static void getThreadAndRunnable(){
        MyRunnable tr1 = new MyRunnable();

        Thread t1 = new Thread(tr1);
        t1.setName("Thread via Runnable");
        t1.setPriority(10);
        t1.start();
    }

    public static void getClassThread(){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread 1");
        t1.setPriority(10);

        t2.setName("Thread 2");
        t2.setPriority(1);

        t1.start();
        t2.start();

        MyRunnable tr1 = new MyRunnable();
        MyRunnable tr2 = new MyRunnable();
        tr1.run();
        tr2.run();
    }

    public static void getBasicThread(){
        // Check whether we have a thread and get information
        // Every program has MAIN THREAD
        // If MAIN THREAD is over the program itself is over
        System.out.println(Thread.currentThread());

            try {
                for (int num = 1; num <= 10; num++) {
                    System.out.println("Value: " + num);
                    Thread.sleep(1500); // 1 second equals 1000 milliseconds, 1.5 seconds 1500 milliseconds
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                for (int num = -10; num <= 0; num++){
                    System.out.println("Value: " + num);
                    Thread.sleep(2500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Thread has ID, STATUS, PRIORITY, NAME
        // PRIORITY = 1 to 10
        // T1, T2, T3 -> Priority: 4, 7, 1
    }
}
