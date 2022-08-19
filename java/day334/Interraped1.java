package day334;

import java.util.Random;

public class Interraped1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1_000_000; i++) {
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("Thread was interraped");
                        break;
                    }
                    Math.sin(random.nextDouble());
                }
            }
        });
        System.out.println("Starting thread");
        thread.start();
        Thread.sleep(1);
        thread.interrupt();
        thread.join();
        System.out.println(" thread was finished");
    }
}

