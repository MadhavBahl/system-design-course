package BehavioralPatterns.StatePattern.GoodCode;

public class InProgressTicketState implements TicketState {
  @Override
  public void assignAgent(Ticket ticket, String agentName) {
    System.out.println("[" + ticket.getId() + "] Already assigned. Agent can continue working.");
  }

  @Override
  public void replyToCustomer(Ticket ticket, String message) {
    System.out.println("[" + ticket.getId() + "] Updating customer: " + message);
  }

  @Override
  public void resolve(Ticket ticket) {
    System.out.println("[" + ticket.getId() + "] Marking ticket as resolved.");
    ticket.setState(new ResolvedTicketState());
  }

  @Override
  public void close(Ticket ticket) {
    System.out.println("[" + ticket.getId() + "] Cannot close directly. Resolve it first.");
  }
}
