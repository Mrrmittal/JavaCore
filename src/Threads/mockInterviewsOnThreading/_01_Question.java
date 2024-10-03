/**
 * Author: Jatin Mittal
 * Date: 03-10-2024
 */
package src.Threads.mockInterviewsOnThreading;

/*
What is the difference between Thread class and Runnable interface in Java?
Please explain when you would use one over the other and which one is preferable in a multithreading scenario.

Sol: Thread Class and Runnable Interface are basically two things which helps to create thread in Java.
     Where Thread is a class and Runnable is an interface thats comes with an abstract method public void run();
     this run method is rhe only one where we write the execution of a thread.

     In between both of them thread creation using Runnable class is more preferable.
     Because Java can not support multiple inheritance. So, that time, where is class is already extend another class.
     So there a problem will create how to extend Thread Class. So, Runnable interface is preferable at that time.
     So, while we want work on a larger project so, it preferred to use Runnable Interface over Thread class.
 */
public class _01_Question {
}
