package src.Threads.BasicConcepts;

class Thread1 implements Runnable{
    @Override
    public void run(){
        System.out.println("Task 1 Complete : " +Thread.currentThread().getName());
    }
}

class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task 2 Complete : " +Thread.currentThread().getName());
    }
}
class Thread3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task 3 Complete : " +Thread.currentThread().getName());
    }
}

public class MultipleTastMultipleThreads {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);

        th1.setName("Thread 1");
        th2.setName("Thread 2");
        th3.setName("Thread 3");
        th1.start();
        th2.start();
        th3.start();
    }

}
