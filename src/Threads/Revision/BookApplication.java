package src.Threads.Revision;

public class BookApplication implements Runnable {

    String name;
    int tickets;
    static BookTicket bookTicket;

    BookApplication(String name, int tickets) {
        this.name = name;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        bookTicket.book(name, tickets);
    }

    public static void main(String[] args) {

        bookTicket = new BookTicket();
        BookApplication bookApplication = new BookApplication("cus1", 6);
        BookApplication bookApplication2 = new BookApplication("cus2", 7);

        Thread thread = new Thread(bookApplication);
        Thread thread2 = new Thread(bookApplication2);

        thread.start();
        thread2.start();

    }
}
