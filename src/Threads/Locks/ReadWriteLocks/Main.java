/**
 * Author: Jatin Mittal
 * Date: 25-09-2024
 */

package src.Threads.Locks.ReadWriteLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();


    public int getCount(){
        readLock.lock();
        try {
            return count;
        }finally {
            readLock.unlock();
        }
    }


    public void increment(){
        writeLock.lock();

        try{
            count++;
        }finally {
            writeLock.unlock();
        }
    }

}
