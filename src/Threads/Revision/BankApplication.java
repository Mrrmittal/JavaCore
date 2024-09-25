package src.Threads.Revision;

public class BankApplication {

    int totalAmount = 100;

    public synchronized void withdraw(int amount){

        if (totalAmount >= amount){
            System.out.println("Withdraw Processing !!");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            totalAmount -= amount;
            System.out.println("Withdraw Success, Remaining amount : "+totalAmount);
        }

        else {
            System.out.println("Insufficient amount");
        }
    }
}
