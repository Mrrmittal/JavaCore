/**
 * Author: Jatin Mittal
 * Date: 03-10-2024
 */

package src.Threads.mockInterviewsOnThreading;
/*
Que: What are race conditions? How can you prevent them in a multithreaded environment?
Sol: Race condition refers to basically that condition where two or more threads work on the shared datasource. and
     that can be a chance to such as incorrect values being written, lost updates, or broken logic, and situation
      of misleading can occur.

     for eg: like our previous example BankApplication there were wo thread, Thread1 and Thread2 both of them are trying
             to withdraw 100 from the bank account of Mr X. But Mr. X only have 100 only in it's bank account.
             so, at that time while both thread read balance it was 100. so both are ready to withdraw. So, this is
             knows as race condition. because only one thread can withdraw the money.

             som to preventing this condition we can use synchronization in multithreading by using locks.
 */


public class _03_Question {
}
