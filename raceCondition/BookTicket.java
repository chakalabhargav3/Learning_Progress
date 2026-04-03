package raceCondition;

public class BookTicket extends Thread {
    int availableTickets = 1;


        public synchronized void run(){
            if(availableTickets > 0){
                System.out.println("Ticket booked successfully");
                availableTickets--; 
                
            }
            else{
                System.out.println("No tickets available");
            }
        }

        public static void main(String[] args) {
            BookTicket bookTicket = new BookTicket();

            Thread t1 = new Thread(bookTicket);
            Thread t2 = new Thread(bookTicket);

            t1.start();
            t2.start();
        }
    }


