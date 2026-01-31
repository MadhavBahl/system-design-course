package BehavioralPatterns.StatePattern.GoodCode;

public class ResolvedTicketState implements TicketState {
  @Override
  public void assignAgent(Ticket ticket, String agentName) {
    System.out.println("[" + ticket.getId() + "] Already resolved. Reassign only if reopened.");
  }

  @Override
  public void replyToCustomer(Ticket ticket, String message) {
    System.out.println("[" + ticket.getId() + "] Informing customer that ticket is already resolved: " + message);
  }

  @Override
  public void resolve(Ticket ticket) {
    System.out.println("[" + ticket.getId() + "] Ticket already resolved.");
  }

  @Override
  public void close(Ticket ticket) {
    System.out.println("[" + ticket.getId() + "] Closing ticket.");
    ticket.setState(new ClosedTicketState());
  }
}
