/**
 * Author: Jatin Mittal
 * Date: 25-09-2024
 */

package src.Threads.ThreadCommunication;

public class Resources{

    int data;
    boolean hasData;

    public synchronized void producer(int value){
        while (hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        data = value;
        hasData = true;
        System.out.println("Produced Value : " +data);
        notify();

    }

    public synchronized int consumer(){
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            hasData = false;
            System.out.println("Consumed " +data);
            notify();
            return data;

    }

}
