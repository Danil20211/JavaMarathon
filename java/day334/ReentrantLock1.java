package day334;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1 {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.seconfThread();
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.showCounter();

    }
}

class Task {
    private Lock lock = new ReentrantLock();
    private int counter;

    private void increment() {
        for (int i = 0; i < 10000; i++)
            counter++;
    }

    public void firstThread() {
        lock.lock();
        increment();
        lock.unlock();
    }

    public void seconfThread() {
        lock.lock();
        increment();
        lock.unlock();
    }

    public void showCounter() {
        System.out.println(counter);
    }
}
