package src.Threads.BasicConcepts;
/*
Que : What is Static Synchronization in java Threads. How its works?
Sol: Static Synchronization may use in Multithreading while there are multiple objects of class is present. And then
     instance level lock does not support Synchronization on multiple class object. So we need to add Static
     Synchronization to allow Class level locks.

     Main Note: Static Synchronization basically create a Class level lock instead of Instance level lock.

   # Syntax: static synchronization void method_name() { // Your Code here }

   # How to use static synchronization in Multithreading.
   Suppose In PVR Cinema Gurgaon, there are 20 tickets left and two Movie booking Application (BookMyShow and Paytm)
   are allow consumer to buy tickets but Yeh dono platform k consumer ko allow hai ki woh yeh 20 tickets book kr le.
   But at that time 2 objects will create for both classes like Paytm and as well as BookMyShow. But both objects
   will work for 20 tickets because instance level lock can work for only object level. So, Both we show mislead data
   to consumer and show false data. So, to overcome that situation static synchronization method will help to generate
   Class level lock. So when a thread of an object of paytm class enter in static synchronized method then all other
   threads will be wait until thread of paytm's object complete their transaction.
 */


public class StaticSynchronization {
}
