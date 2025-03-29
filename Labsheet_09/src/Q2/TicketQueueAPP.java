package Q2;

public class TicketQueueAPP {
    public static void main(String[] args) {
        //creating queue
        TicketQueueArray ticketQueue = new TicketQueueArray(5);
        //trying to remove items from empty queue
        ticketQueue.remove();
        //inserting values
        ticketQueue.insert(101);
        ticketQueue.insert(102);
        //display after 2 insertions
        ticketQueue.display();
        //fill out queue
        ticketQueue.insert(103);
        ticketQueue.insert(104);
        ticketQueue.insert(105);
        //display queue
        ticketQueue.display();
        //trying to add item to already max out queue
        ticketQueue.insert(106);
        //removing items
        ticketQueue.remove();
        ticketQueue.remove();
        //display after removing
        ticketQueue.display();
    }
}
