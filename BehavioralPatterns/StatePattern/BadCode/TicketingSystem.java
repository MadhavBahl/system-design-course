public class TicketingSystem {
  public static void main(String[] args) {
    BasicTicket ticket = new BasicTicket("1234");
    ticket.assignAgent("Alice");
    ticket.replyToCustomer("Hello! How can I help you?");
    ticket.resolve();
    ticket.close();
    ticket.replyToCustomer("Thank you for your help!");
  }
}
