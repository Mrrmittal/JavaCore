package src.Threads.BasicConcepts;

import src.Threads.YoutubeByThreads.Youtube;

/*
yield(): yield() is method of Thread Class that help to stop the execution of current thread and allow to execute
 another threads. Fun fact: Ladies first. Let Suppose Thread 1 is a male and another Thread2 is a female then male
 thread call the yield() method and stop their execution and allow to execution of female thread first.

 #But the important thing is its execution totally depend on the thread scheduler ( Male thread can only give hint to
 the Scheduler to stop execution but scheduler can ignore the hint. then at that time Male and female thread runs
  together)

 Syntax: public static native yield();

 */
public class YieldMethod implements Runnable {
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }

    public static void main(String[] args) {
        YieldMethod yieldMethod = new YieldMethod();
        Thread thread = new Thread(yieldMethod);
        thread.start();
        Thread.yield(); // Main thread gives hints to Scheduler to stop their execution for another thread
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is running"); // main thread area
        }
    }
}
