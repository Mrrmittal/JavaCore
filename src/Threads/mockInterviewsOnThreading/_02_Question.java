/**
 * Author: Jatin Mittal
 * Date: 03-10-2024
 */

package src.Threads.mockInterviewsOnThreading;
/*
Que: What are the different ways to achieve thread synchronization in Java? Explain synchronized keyword and locks in Java.
Sol: They are mainly two ways which helps to achieve synchronization in java. one is by using synchronized keyword.
     and another one is using Locks.

     1.) by using synchronized keyword: so there is two scenario, one is using synchronized block and another one by
         using synchronized method. so, synchronized block is provide lock to a thread at the beginning of the function,
         while we synchronized keyword on a block then its provide lock at block level.

         For ex: let suppose there is two threads - Thread1 and Thread2 both are want to withdraw amount of Rs 100 each
                 from the bank account of MR. X. But there is only Rs. 100 available in the Mr. X account. So, here we
                 need synchronization of thread to prevent the situation of false writing and misleading.

                 so here using a synchronized method or block helps to enter in withdraw methods to only one thread,
                 and until a thread is not complete his task there is no permission allowed to another thread to enter,
                 into the method.

      2.) by using locks: so, there is problem with the synchronized keyword, it is this while thread1 is processing
          so, thread2 is remains in the waiting state and continuously waiting for the thread1 to complete their task.
          so, it's effect the CPU performance and optimization. so, there is lock where lock can allow for a specific
          time or while another acquire a lock then this thread can perform another task or can immediately terminate.

          so, there is many methods like.
          lock.lock()
          tryLock() without time, that immediately terminate if another thread acquired a lock.
          tryLock(time, millisecond); that will wait for a specific amount of time, otherwise terminate.
          ReadAndWriteLock; this is a pair of two lock one is readLock() and another is writeLock(), so read lock can
          acquire by multiple thread. while writeLLock() can be acquires only by the one.
          Fairness lock.

          these all locks can use only by using Reentrance class.

 */


public class _02_Question implements Runnable {

    static BankApplication bankApplication;

    public void run(){
        bankApplication.withdraw(100);
    }

    public static void main(String[] args) {
        bankApplication = new BankApplication();
        _02_Question obj = new _02_Question();
        _02_Question obj2 = new _02_Question();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }

}

class BankApplication{

    private int balance = 100;

    public synchronized void withdraw(int amount){
        System.out.println("Processed");
        try {
            if(balance >= amount ){
                balance = balance - amount;
                System.out.println("Withdraw successful");
            }

            else {
                System.out.println("Insufficient Balance");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        finally {
            System.out.println("balance amount :" +balance);
        }

    }

}
