/**
 * Author: Jatin Mittal
 * Date: 03-10-2024
 */

package src.Threads.mockInterviewsOnThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _04_DeadlockAvoidance {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void task1() {
        while (true) {
            if (lock1.tryLock()) {
                try {
                    if (lock2.tryLock()) {
                        try {
                            // Critical section with both locks acquired
                            System.out.println("Task 1: Acquired both locks");
                            break;
                        } finally {
                            lock2.unlock();
                        }
                    }
                } finally {
                    lock1.unlock();
                }
            }
        }
    }

    public void task2() {
        while (true) {
            if (lock2.tryLock()) {
                try {
                    if (lock1.tryLock()) {
                        try {
                            // Critical section with both locks acquired
                            System.out.println("Task 2: Acquired both locks");
                            break;
                        } finally {
                            lock1.unlock();
                        }
                    }
                } finally {
                    lock2.unlock();
                }
            }
        }
    }

    public static void main(String[] args) {
        _04_DeadlockAvoidance obj = new _04_DeadlockAvoidance();
        Thread t1 = new Thread(() -> obj.task1());
        Thread t2 = new Thread(() -> obj.task2());

        t1.start();
        t2.start();
    }
}
