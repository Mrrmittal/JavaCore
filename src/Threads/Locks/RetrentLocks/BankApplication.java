package src.Threads.Locks.RetrentLocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankApplication {

    private int totalAmount = 100;
    Lock lock = new ReentrantLock();

    public void withdraw(int amount){

        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(totalAmount>amount){
                    System.out.println("Withdraw Successful!!");
                    try{
                        Thread.sleep(3000);
                    }catch (Exception e){
                    }
                    finally {
                        lock.unlock();
                    }
                    totalAmount -= amount;
                    System.out.println(totalAmount +" amount available now");
                }else {
                    System.out.println("Insufficient balance");
                }
            }else {
                System.out.println("Lock are not available");
            }
        }catch (Exception e){

        }

    }
}
