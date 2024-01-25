package src.Threads.BasicConcepts;

/* Create a Thread by Using Runnable Interface.
    step 1 : Implement Runnable interface
    step 2:  Override run() method
    step 3: Create class object.
    step 4: create Thread Class object with class object reference.
    step 5: Invoke/start the Thread.


 */
//step 1 : Implement Runnable interface
public class CreateThreadByInterface implements Runnable{
//    step 2:  Override run() method
    @Override
    public void run(){
        System.out.println("Thread is Running");
    }
    
    public static void main(String[] args) {
        CreateThreadByInterface t = new CreateThreadByInterface(); // step 3: Create class object.
        Thread th = new Thread(t); // step 4: create Thread Class object with class object reference.
        th.start(); // step 5: Invoke/start the Thread.
    }
}
