package src.Threads.Revision;

public class Main {
    public static void main(String[] args) {

        BankApplication bankApplication = new BankApplication();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                bankApplication.withdraw(70);
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();



    }
}
