package src.Threads.BasicConcepts;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
/*
java.lang.Thread class provide us to a join() method which allows to wait until the another thread complete their
execution. If t is a Thread object whose thread is currently executing, then t.join() will make sure that t is terminated before the next instruction is executed by the program.
If there are multiple threads calling the join() methods that means overloading on join allows the programmer to specify a waiting period. However, as with sleep, join is dependent on the OS for timing, so you should not assume that join will wait exactly as long as you specify.
There are three overloaded join functions.

#Syntax: public final void join()
         public final synchronized void join(long millis)
         public final synchronized void join(long millis, int nanos)
 */

// Example of join thread
public class JoinThreads implements Runnable{
    String name;
    public JoinThreads(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for(int i=0;i <5;i++){
            System.out.println("Thread name is : " +name);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        JoinThreads joinThreads = new JoinThreads("Open"); // Need to execute first
        JoinThreads joinThreads1 = new JoinThreads("Management"); // Need just after open thread
        JoinThreads joinThreads2 = new JoinThreads("Buying"); // execute random while open and Management complete their execution
        JoinThreads joinThreads3 = new JoinThreads("Selling"); // execute random while open and Management complete their execution

        Thread thread = new Thread(joinThreads);
        Thread thread1 = new Thread(joinThreads1);
        Thread thread2 = new Thread(joinThreads2);
        Thread thread3 = new Thread(joinThreads3);

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Exception has been caught : " +e);;
        }

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Exception has been caught : " +e);;
        }

        thread2.start();
        thread3.start();


    }
}
