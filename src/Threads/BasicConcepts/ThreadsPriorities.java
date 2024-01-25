package src.Threads.BasicConcepts;
/*
##### Windows does not Support Priorities in MultiThreading
Threads Priorities are to be set to set priority number to the threads. If we want to that is our specific threads run
always runs first. So, we can set the max_priority to that Thread. Priority is in the form of integers.
And can be lie in the range of 1 to 10.
for 1 - MIN_PRIORITY
for 5 - NORM_PRIORITY
for 10 - MAX_PRIORITY

#Methods : public final void setPriority(int value);
           public final int getPriority();
 */

public class ThreadsPriorities implements Runnable {
    @Override
    public void run(){
        for(int i =0; i<10; i++){
            System.out.println( Thread.currentThread().getName() +" is running with :" +Thread.currentThread().getPriority() + " Priority");
        }

    }

    public static void main(String[] args) {
        ThreadsPriorities threadsPriorities = new ThreadsPriorities();
        ThreadsPriorities threadsPriorities2 = new ThreadsPriorities();
        Thread thread = new Thread(threadsPriorities);
        Thread thread2 = new Thread(threadsPriorities2);
        thread.setName("Thread 1");
        thread.setPriority(10);
        thread.start();
        thread2.setName("Thread 2"); // Default priority will be 5
        thread2.setPriority(8);
        thread2.start();
    }
}
