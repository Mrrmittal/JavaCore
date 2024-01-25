package src.Threads.BasicConcepts;

/*
getName();
setName();
currentThread() // static method
isAlive();
 */

public class NamingMethods implements Runnable {

    @Override
    public void run(){
        if(Thread.currentThread().isAlive()) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "is Running");
            }
        }
    }

    public static void main(String[] args) {
        NamingMethods namingMethods = new NamingMethods();
        NamingMethods namingMethods2 = new NamingMethods();
        NamingMethods namingMethods3 = new NamingMethods();
        Thread thread1 = new Thread(namingMethods);
        Thread thread2 = new Thread(namingMethods2);
        Thread thread3 = new Thread(namingMethods3);

        thread1.setName("Teenager");
        thread2.setName("Adult");
        thread3.setName("Senior");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
