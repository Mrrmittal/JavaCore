package src.Threads.Revision;

public class BookTicket {
    int totalTickets = 10;

    public synchronized void book(String name, int tickets){

        if (totalTickets >= tickets){
            System.out.println(name +" tickets has been booked. Congratulation!!");
            totalTickets = totalTickets - tickets;
            System.out.println(totalTickets +" tickets are left now, Hurry Up!!");
        }

        else {
            System.out.println("Sorry only "+totalTickets +" are left now!");
        }
    }
}
