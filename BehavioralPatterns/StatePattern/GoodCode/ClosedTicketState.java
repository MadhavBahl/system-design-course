package BehavioralPatterns.StatePattern.GoodCode;

// Concrete State: Closed
public class ClosedTicketState implements TicketState {
  @Override
  public void assignAgent(Ticket ticket, String agentName) {
    System.out.println("[" + ticket.getId() + "] Ticket is closed. Cannot assign a new agent.");
  }

  @Override
  public void replyToCustomer(Ticket ticket, String message) {
    System.out.println("[" + ticket.getId() + "] Ticket is closed. Cannot reply.");
  }

  @Override
  public void resolve(Ticket ticket) {
    System.out.println("[" + ticket.getId() + "] Ticket is closed. Cannot resolve.");
  }

  @Override
  public void close(Ticket ticket) {
    System.out.println("[" + ticket.getId() + "] Already closed.");
  }
}
