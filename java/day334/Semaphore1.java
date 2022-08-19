package day334;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Semaphore1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Conection conection = Conection.getConection();
        for (int i = 0; i < 200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {

                    try {
                        conection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });

        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);

        //Semaphore semaphore = new Semaphore(2);
        // semaphore.acquire(); начинает взаимодействие с ресурсом
        // semaphore.release();  отпускает одно из разрешений
        //semaphore.availablePermits() возвращает количество свободных разрешений
    }
}

class Conection {
    private static Conection conection = new Conection();
    private int conectonsCount;
    private Semaphore semaphore = new Semaphore(10);

    private Conection() {
    }

    public static Conection getConection() {
        return conection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        }
        finally {
            semaphore.release();
        }

    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            conectonsCount++;
            System.out.println(conectonsCount);
        }
        Thread.sleep(5000);
        synchronized (this) {
            conectonsCount--;
            System.out.println(conectonsCount);
        }
    }
}
