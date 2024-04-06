package day23;

public class MultiThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread("Thread 1"));
        Thread thread2 = new Thread(new MyThread("Thread 2"));

        thread1.start();
        thread2.start();

    }
}

class MyThread implements Runnable {
    private String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }

    public void run() {
        System.out.println("Thread " + threadName + "is running.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + "interrupted..");
        }

        System.out.println("Thread " + threadName + " existing...");
    }
}

