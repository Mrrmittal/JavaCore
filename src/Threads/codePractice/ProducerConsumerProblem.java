/**
 * Author: Jatin Mittal
 * Date: 27-09-2024
 */

/*
Description: Implement a producer-consumer scenario using threads. The producer thread generates data and adds
             it to a shared buffer, while the consumer thread retrieves and processes the data.
             Make sure to handle synchronization properly to avoid race conditions.

Key Concepts: wait(), notify(), synchronization.

*/

package src.Threads.codePractice;


import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerProblem {

    private static final int maxCapacity = 5;
    private static final Queue<Integer> buffer = new LinkedList<>();

    public Queue<Integer> getBuffer() {
        return buffer;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public static void main(String[] args) {
        ProducerConsumerProblem obj1 = new ProducerConsumerProblem();

        Producer producer = new Producer(obj1);
        Consumer consumer = new Consumer(obj1);

        Thread thread = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread.start();
        thread2.start();
    }

}

class Consumer implements Runnable{

    private final ProducerConsumerProblem producerConsumerProblem;

    Consumer(ProducerConsumerProblem producerConsumerProblem) {
        this.producerConsumerProblem = producerConsumerProblem;
    }


    @Override
    public void run() {
        while (true){
            consume();
        }
    }

    public void consume() {
        synchronized (producerConsumerProblem) {  // Synchronize on the shared object
            while (producerConsumerProblem.getBuffer().isEmpty()) {
                try {
                    producerConsumerProblem.wait();  // Wait on the shared object
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("Consumer Interrupted..");
                }
            }

            int data = producerConsumerProblem.getBuffer().poll();  // Consume data
            System.out.println("Consumed data: " + data);
            producerConsumerProblem.notify();  // Notify the producer
        }
    }


}

class Producer implements Runnable {

    private final ProducerConsumerProblem producerConsumerProblem;

    Producer(ProducerConsumerProblem producerConsumerProblem) {
        this.producerConsumerProblem = producerConsumerProblem;
    }

    @Override
    public  void run() {
        int count= 0;
        while (count<10){
            produce();
            count++;
        }
    }

    public void produce() {
        synchronized (producerConsumerProblem) {
            while (producerConsumerProblem.getBuffer().size() == producerConsumerProblem.getMaxCapacity()) {
                try {
                    producerConsumerProblem.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("Producer Interrupted...");
                }
            }

            int data = (int) (Math.random() * 100);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            producerConsumerProblem.getBuffer().offer(data);
            System.out.println("Data Produced " + data);
            producerConsumerProblem.notify();
        }
    }
}