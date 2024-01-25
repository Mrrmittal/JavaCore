package src.Threads.BasicConcepts;

// WAP to perform Single task using Multiple Threads

public class SingleTaskMultipleThreads implements Runnable {

    @Override
    public void run(){
        System.out.println("Thread is Running. Thread run by " +Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SingleTaskMultipleThreads t = new SingleTaskMultipleThreads();
        Thread th = new Thread(t);
        Thread th2 = new Thread(t);

        th.setName("Thread1");
        th.start();
        th2.setName("Thread2");
        th2.start();

    }
}
