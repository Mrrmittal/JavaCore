package src.Threads.BasicConcepts;
/*
Que: What is Interrupted Method in Thread class? Properties and how to use it.
Sol: In java Threads, while current thread is in the sleeping and waiting state( sleep() , wait() ) while calling
interrupt() method breakout the sleeping and waiting state and throw a InterruptedException.

* If Thread isn't going into the waiting and sleeping state then interrupt() method behave normally. But a line of
interrupt() method is not worthy.

For eg: There are two threads and one join the thread and another one is waiting for thread-1 to complete their task.
        but Thread-1 is not come from the waiting state from a long time. then the execution of another threads also
        stop and time of completion may rise. So at that time interrupted thread can be used to break out the waiting
        state and throws exception and provide chance to another threads

# syntax : public void interrupt();
 */

//How to work
public class InterruptMethod implements Runnable {
    @Override
    public void run(){
        try {
            Thread.sleep(5000);
            for(int i =0; i<5;i++){
                System.out.println(Thread.currentThread().getName() +" thread is Running");
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InterruptMethod method = new InterruptMethod();
        Thread thread = new Thread(method);
        thread.setName("ABC");
        thread.start();
        thread.interrupt();
        System.out.println("Main Thread is running");
    }
}
