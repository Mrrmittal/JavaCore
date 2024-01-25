package src.Threads.BasicConcepts;
/*
sleep is the state when the scheduler ask thread to stop their execution for (milliseconds). In sleep state thread will
wait until the given time is not passed.

#methods:
1. public static native sleep(long millie) throws InterruptedException
2. public static void sleep(long millie, long nano) throws InterruptedException
 sleep() always throws InterruptedException so, we need try and catch block always to define sleep().

* native means those methods whose wrote in another language and does not direct belongs to Java.
// Using how to use sleep() method
 */

public class SleepThreads implements Runnable {
    @Override
    public void run(){
        for(int i =0; i<10; i++){
            System.out.println("Thread "+Thread.currentThread().getName() +" is Running");
            try{
                Thread.sleep(1000); // Here Thread will wait for 1 second.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        SleepThreads sleepThreads = new SleepThreads();
        SleepThreads sleepThreads2 = new SleepThreads();
        Thread thread = new Thread(sleepThreads);
        Thread thread2 = new Thread(sleepThreads);
        thread.setName("ABC");
        thread2.setName("HIHI");
        thread.start();
        thread2.start();
    }
}
