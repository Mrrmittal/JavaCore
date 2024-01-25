package src.Threads.BasicConcepts;
/*
Que: What is Daemon Threads in Java. Use and their properties and how to create daemon threads in Java.
Sol: Daemon Threads are basically low-priority threads. Which totally provide service to another user threads.
     Daemon Threads are basically the Shadow and only serve to the User or main threads. JVM does not depend on the
     Daemon thread while main or user thread execution will complete JVM automatically kill the present Daemon threads
     For eg: Garbage Collector and finalizer are the Daemon threads

     #Use : To provide Service to the main or User Threads.
     #Properties : Always dependent (if main or user thread is not exists then it can not perform action)
   # methods: setDaemon(true/false), boolean isDaemon()
 */

public class DaemonThreads implements Runnable{

    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Thread is Daemon " +Thread.currentThread().getName());
        }
        else {
            System.out.println("Thread is not Daemon " +Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        DaemonThreads daemonThreads = new DaemonThreads();
        DaemonThreads daemonThreads2 = new DaemonThreads();
        Thread th = new Thread(daemonThreads);
        Thread th2 = new Thread(daemonThreads);
        th.setName("1st");
        th.setDaemon(true);
        th.start();
        th2.setName("2nd");
        th2.start();
    }
}
