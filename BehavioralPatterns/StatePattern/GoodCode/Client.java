package BehavioralPatterns.StatePattern.GoodCode;

public class Client {
  public static void main(String[] args) {
    Ticket ticket = new Ticket("#5678");

    ticket.assignAgent("Alice");
    ticket.replyToCustomer("We are investigating your login issue.");
    ticket.resolve();
    ticket.close();
  }
}
