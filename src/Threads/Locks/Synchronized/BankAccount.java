package src.Threads.Locks.Synchronized;

public class BankAccount implements Runnable{

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int amount;
    static BankApplication bankApplication;

    public BankAccount(int amount){
        this.amount = amount;
    }


    @Override
    public synchronized void run(){
        bankApplication.withdraw(amount);
    }





    public static void main(String[] args) {
        bankApplication = new BankApplication();
        BankAccount obj1 = new BankAccount(70);
        BankAccount obj2 = new BankAccount(70);
        Thread thread = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread.start();
        thread2.start();
    }
}
