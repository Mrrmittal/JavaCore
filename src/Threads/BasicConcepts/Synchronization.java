package src.Threads.BasicConcepts;
/*
Que: What is Synchronization in Java. Needs to use Synchronization?
Sol: Synchronization is the important term use in Java. synchronization is crucial to avoid issues such as
     data corruption, inconsistencies, and unexpected behavior.

   #Why Synchronization need.
   In multithreading programming in java the data can be bad and false because many threads try to access the same
   resources and can produce error and unwanted, unseen results.
   for eg: A Ticket Booking app 2 there is available 10 tickets, But 2 person wants to book all 10 tickets at the
   same time. So, Both have to see 10 tickets are available but both of them can not book tickets so the data error,
   data falseness can be seen for one person.
 */

//Example to check how two threads can create erroneous and inconsistencies.
public class Synchronization implements Runnable {
    static BookingApplication bookingApplication;
    String name;
    int tickets;
    Synchronization(String name, int tickets){
        this.name = name;
        this.tickets = tickets;
    }

    @Override
    public void run(){
        bookingApplication.bookTickets(tickets, name);
    }

    public static void main(String[] args) {
        bookingApplication = new BookingApplication();
        Synchronization obj = new Synchronization("Customer1", 6);
        Synchronization obj2 = new Synchronization("Customer2", 7);
        Thread thread = new Thread(obj);
        Thread thread2 = new Thread(obj2);

        thread.start();
        thread2.start();
    }
}

class BookingApplication{
        int total_tickets = 10;
        String name;
        int tickets;
        public void bookTickets(int tickets, String name){
            if(total_tickets >= tickets  ){
                System.out.println(name +" Seats Confirmed!! ThankYou for showing Interest");
                int left_tickets = (total_tickets - tickets);
                total_tickets = left_tickets;
                System.out.println("Only "+left_tickets +" tickets are left, Hurry Up!!" );
            }else {
                System.out.println("Sorry!! Only "+total_tickets +" are available.");
            }
        }
}
