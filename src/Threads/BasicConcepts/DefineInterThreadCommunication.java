package src.Threads.BasicConcepts;

/*
Que: Define Inter thread Communication. How wait(), notify(), notifyAll() methods works.
Sol: Inter threads communication is used in java while threads need to communicate with each other. Means a thread is in
     own the lock and release the lock and go into the wait() or runnable state and notify to another thread or all
     threads to access the lock.

     Wait(), notify(), notifyAll() method on Objects call works to achieve the Inter thread communication.

   1. Wait() method : if any threads call the wait() method, it means that the current thread need to release the lock
                      and stand in the waiting and pausing state until the another thread does not call notify() or
                      notifyAll() method.
               Syntax: public final void wait() throws InterruptedException (wait until notify() and notifyAll() method)
                       public final void wait(long timeout) throws InterruptedException (wait until timeout)

   2. notify() : if any thread call notify() method that's means to sent notification to a single thread and release the
                 lock.
             syntax: public final void notify();

   3. notifyAll() : if any thread call notifyAll(), means to sent notification to all threads which are in Waiting state
                    and release the Object lock.

   Note** : These all Object class method call only while thread own the lock, means thread inside the Synchronized area.
 */

// how Inter Thread Communication works
public class DefineInterThreadCommunication implements Runnable {
    static TotalMovieEarnings obj1;
    @Override
    public void run(){
        obj1.calEarning();
    }


    public static void main(String[] args) {
        obj1 = new TotalMovieEarnings();
        DefineInterThreadCommunication te = new DefineInterThreadCommunication();
        Thread thread = new Thread(te);
        thread.start();

        synchronized (thread){

           try {
               thread.wait();
               System.out.println("Total movie earnigs : " +obj1.totalEarning);
           }
           catch (Exception e){
               e.printStackTrace();
           }

        }
    }


}

class TotalMovieEarnings {
    long totalEarning = 0;
    int totalSeat = 10;
    int ticketPrice = 100;

    public void calEarning () {
    synchronized (this)
    {
        int i;
        for (i=1; i <= totalSeat; i++){
            totalEarning += ticketPrice;
        }
        notify();
    }
    }
}