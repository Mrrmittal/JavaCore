package src.LambdaExpression;

//Here we implement runnable interface using Lambda Expression and creating a new thread

public class RunnableInterfaceUsingLambdaExpression {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            for(int i=1; i<=10; i++){
                System.out.print(i*3 + " ");
            }
        };

        // No new thread will create
        Thread childThread = new Thread(runnable);
        childThread.run();
        System.out.println();

        // No new thread will create
        runnable.run();
        System.out.println();

        //New thread will create
        childThread.start();
    }
}
