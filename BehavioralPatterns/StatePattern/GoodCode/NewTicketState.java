package BehavioralPatterns.StatePattern.GoodCode;

public class NewTicketState implements TicketState {
  @Override
  public void assignAgent(Ticket ticket, String agentName) {
    System.out.println("[" + ticket.getId() + "] Assigned to agent: " + agentName);
    ticket.setState(new InProgressTicketState());
  }

  @Override
  public void replyToCustomer(Ticket ticket, String message) {
    System.out.println("[" + ticket.getId() + "] Replying to customer and starting work: " + message);
    ticket.setState(new InProgressTicketState());
  }

  @Override
  public void resolve(Ticket ticket) {
    System.out.println("[" + ticket.getId() + "] Can't resolve immediately. Assign and work on it first.");
  }

  @Override
  public void close(Ticket ticket) {
    System.out.println("[" + ticket.getId() + "] Can't close a new ticket directly. Resolve it first.");
  }
}
