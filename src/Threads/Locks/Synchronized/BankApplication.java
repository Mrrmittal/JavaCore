package src.Threads.Locks.Synchronized;

public class BankApplication {

    private int totalAmount = 100;

    public synchronized void withdraw(int amount){
        if(totalAmount > amount){
            System.out.println("Withdraw Processing!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            totalAmount -= amount;
            System.out.println(totalAmount +" amount available now.");
        }else {
            System.out.println("Insufficient Balance. Try again later");
            System.out.println(totalAmount +" amount available now.");
        }
    }
}
