/**
 * Author: Jatin Mittal
 * Date: 04-10-2024
 */

package src.Threads.mockInterviewsOnThreading;
/*
Question: Can you explain starvation in multithreading and how it can be prevented?
Solution: Starvation refers to a situation or condition where a thread does not get the resources regularly due to high
          priority threads because CPU are providing less priority to that thread, So here the situation of starvation
          can occur.

          For eg: there is a synchronized method where a high priority thread accessed frequently and a Thread1 wait for
                  the long time. so, the waiting time or irregularity to access the resources are being increased for
                  Thread1. due to high priority thread.


         How to prevent: By using Reentrant class with fairness can get out from the situation of starvation.
 */


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _05_Question implements Runnable {

    Lock lock = new ReentrantLock(true);
    static PerformTask performTask;

    @Override
    public void run() {
        for(int i =0;i<10; i++){
            try {
                if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                    performTask.task1(10);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }

    public static void main(String[] args) {
        performTask = new PerformTask();
        _05_Question obj = new _05_Question();
        _05_Question obj2 = new _05_Question();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);


        t1.start();
        t2.start();
    }
}

class PerformTask{

    public synchronized void task1(int num){
        System.out.println( Thread.currentThread().getName() +"Number is :" +num);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
