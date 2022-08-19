package day334;

import java.util.Scanner;

public class NotifyWait {
    public static void main(String[] args) throws InterruptedException {
        WaitNotify waitNotify = new WaitNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitNotify.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitNotify.produce();
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
}

class WaitNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started...");
            wait();
            System.out.println("Producer thread resumed...");
        }

    }

    public void consumer() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this) {
            System.out.println("Waiting for return key pressed ");
            scanner.nextLine();
            notify();
        }
    }
}
