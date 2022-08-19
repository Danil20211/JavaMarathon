package day334;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerСonsume {
    private static BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }


    public static void produce() throws InterruptedException {
        Random random = new Random();
        while (true) {
            blockingQueue.put(random.nextInt(100));
        }
    }

    public static void consumer() throws InterruptedException {

        while (true) {
            Random random = new Random();
            Thread.sleep(100);
            if(random.nextInt(10) == 5) {
                System.out.println(blockingQueue.take());
                System.out.println("blockingQueue size is " + blockingQueue.size());
            }
        }
    }
}

