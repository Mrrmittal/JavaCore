/**
 * Author: Jatin Mittal
 * Date: 25-09-2024
 */

package src.Threads.Locks.ReadWriteLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Counter{

    public static void main(String[] args) throws InterruptedException {

        Main main = new Main();
        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++){
                    main.increment();
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " Incremented");
                }
            }
        };

        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10;i++) {
                    System.out.println(Thread.currentThread().getName() + main.getCount());
                }
            }
        };

        Thread t1 = new Thread(obj1,"A");
        Thread t2 = new Thread(obj2, "B");
        Thread t3 = new Thread(obj2, "C");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();



        System.out.println(main.count);

    }
}
