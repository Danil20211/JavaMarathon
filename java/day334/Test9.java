package day334;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread.shutdown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true;

    public boolean isRunning() {
        return running;
    }

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }
}


