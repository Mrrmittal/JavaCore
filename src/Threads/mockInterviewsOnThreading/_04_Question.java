/**
 * Author: Jatin Mittal
 * Date: 03-10-2024
 */

package src.Threads.mockInterviewsOnThreading;

/*
Que: What is a deadlock in multithreading, and how can you avoid it?
Sol: A deadlock in Java occurs when two or more threads are blocked forever, waiting for each other to release resources.
     It typically happens when multiple threads are trying to access resources that are held by each other,
     creating a situation where none of the threads can proceed.


    for eg: There are two threads, T1 and T2 both of them are want to write into the paper. But T1 have pen only.
            and T2 have paper only. and at this time T1 is wishing or waiting for the resource that are holding by T2.
            and T2 is waiting for resources that is hold by T1. So, there is never ending loop will run.

            This is knows as the situation of deadlock.


            There are basically 4 conditions that specify the deadlock:
            1. Circular way
            2. Hold and wait
            3. No preemption
            4. Mutual Exclusion.

   We can prevent the deadlock by using deadlock detection, By using reenterance class lock
 */

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _04_Question {
    public static void main(String[] args) {


        final Object resource1 = "Resource 1";
        final Object resource2 = "Resource 2";




        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 : Locked Resources 1");


                // Adding delay so that Thread 2 can lock resource 2
                try {
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }

            }

        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 : Locked Resources 2");

                // Adding delay so that Thread 1 can lock resource 1
                try {
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (resource1) {
                    System.out.println("Thread 1: Locked resource 1");
                }
            }

        });

        t1.start();
        t2.start();
    }
}


