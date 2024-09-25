package src.Threads.Locks.RetrentLocks;



public class TryLocks implements Runnable{

    public int amount;
    static BankApplication bankApplication;

    public TryLocks(int amount){
        this.amount = amount;
    }

    @Override
    public void run(){
        bankApplication.withdraw(amount);
    }

    public static void main(String[] args) {
        bankApplication = new BankApplication();
        TryLocks tryLocks = new TryLocks(70);
        TryLocks tryLocks2 = new TryLocks(70);

        Thread thread = new Thread(tryLocks);
        Thread thread2 = new Thread(tryLocks2);

        thread.start();
        thread2.start();
    }
}
