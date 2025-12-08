package lesson_20_threads.more;

import lesson_20_threads.MyPersonalRunnable;
import lesson_20_threads.MyPersonalThread;

import java.util.Date;

public class ProcessesThreads {
    public static void main(String[] args) {
        // Что такое МНОГОПРОЦЕССОРНОСТЬ и МНОГОПОТОЧНОСТЬ?
        // И то, и другое - ОДНОВРЕМЕННОЕ ВЫПОЛНЕНИЕ ЧЕГО-ЛИБО

        // Сама IDEA - ПРОЦЕСС уровня Компьютер
        // Но в IDEA каждая программа еще отдельно открывает для нас локальные возможности обработки данных
        // Когда мы запускаем программу - СОЗДАЕТСЯ БАЗОВЫЙ ПОТОК

        // Thread - автоматом подключается МАСТЕР-ПОТОК
        // Базовый поток начинает все и он же ДОЛЖЕН ЗАКОНЧИТЬ ВСЕ ОСТАЛЬНОЕ
        // Нельзя закончить БАЗОВЫЙ поток раньше других потоков
        // Если базовый поток закрылся, значить программа закончилась
        // Thread - name - main
        // Name, priority - насколько важен тот или иной поток
        System.out.println("Basic Thread ID: " + Thread.currentThread().threadId()); // Просто числовое значение потока
        System.out.println("Basic Thread NAME: " + Thread.currentThread().getName()); // обычное имя потока
        System.out.println("Basic Thread PRIORITY: " + Thread.currentThread().getPriority()); // уровень важности - приоритета ПОТОКА
        // Thread Priority - 1 (minor) - 10 (maximum)
        useDefaultThreadClass();

        new Thread(new MyPersonalRunnable()).start();

        // Потоки - это нагрузка на оперативку, поэтому есть ограничения
        // Virtual Threads -> это очень легковесные реализации потоков, они практически мало отражаются на оперативке
    }

    public static void useDefaultThreadClass(){
        new MyPersonalThread().start();
    }

    public static void useDefaultRunnableRun(){
        // Поскольку я использую напрямую Runnable то у меня метод run()
        new MyPersonalRunnable().run();
    }

    public static void justLaunchThread(){
        new Thread(() -> {
            for(int i = 0; i < 10; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                }
            }
        }).start();
    }

    public static void createNewThreadCount(){
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int counter = 1; counter < 11; counter++) {
                    System.out.println("Thread " + Thread.currentThread().getName() + ", priority [" +
                                        Thread.currentThread().getPriority() + "]: " + counter);
                    try{
                        Thread.sleep(1500);
                    } catch (InterruptedException e) { // ПОТОК БЫЛ НЕПРАВИЛЬНО ПРЕРВАН/НЕОЖИДАННО
                        System.out.println("Thread had been interrupted!");
                    }
                }
            }
        });
        t1.setName("t1");
        t1.setPriority(10);

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int counter = 1; counter < 11; counter++) {
                    System.out.println("Thread " + Thread.currentThread().getName() + ", priority [" +
                            Thread.currentThread().getPriority() + "]: " + counter);
                    try{
                        Thread.sleep(1500);
                    } catch (InterruptedException e) { // ПОТОК БЫЛ НЕПРАВИЛЬНО ПРЕРВАН/НЕОЖИДАННО
                        System.out.println("Thread had been interrupted!");
                    }
                }
            }
        });
        t2.setName("t2");
        t2.setPriority(10);

        Thread t3 = new Thread(new Runnable(){
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
        });
        t3.setName("t3");
        t3.setPriority(10);

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }  catch (InterruptedException e) {
            System.out.println("Thread had been interrupted!");
        }
    }

    public static void basicThread(){
        // Создать ПОТОК через класс Thread
        Thread t1 = new Thread();
        t1.start(); // У класса Thread потока запускается через МЕТОД start()
        System.out.println("Is t1 alive: " + t1.isAlive()); // isAlive() проверяет захлопнулся ПОТОК или нет

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Is t1 alive: " + t1.isAlive()); // isAlive() проверяет захлопнулся ПОТОК или нет
    }

    public static void countMilliSeconds(){
        // Thread t1 = 5_000_000_000
        // Thread t2 = 5_000_000_000
        // t1.start() == t2.start() - 0.3 seconds
        long beforeMilliseconds = new Date().getTime();

        for (long i = 0; i < 10_000_000_000L; i++) {
            // EMPTY
        }
        long afterMilliSeconds = new Date().getTime();
        System.out.println("How many milliseconds it took to count from 0 to 10_000_000_000: " +
                (double) (afterMilliSeconds - beforeMilliseconds) / 1000 + " seconds.");
    }
}