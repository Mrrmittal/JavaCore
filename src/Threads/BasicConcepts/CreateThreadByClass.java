package src.Threads.BasicConcepts;

/* Create Thread by using Thread class.
    step 1 : Extend Thread class
    step 2: Override the run() method.
    step 3: Create object for the class.
    step 4: start/invoke the Thread by using start() method.
 */
//   Step 1 - extend the Thread inbuilt class
public class CreateThreadByClass extends Thread {

//    Step-2 : Override the run method
    @Override
    public void run(){
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        CreateThreadByClass t = new CreateThreadByClass();  // step-3 (Create Object for the class)
        t.start();    // step-4 (Invoke the Thread)
    }
}
