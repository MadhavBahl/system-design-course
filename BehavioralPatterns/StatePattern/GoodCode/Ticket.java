package BehavioralPatterns.StatePattern.GoodCode;

public class Ticket {
  private final String id;
  private TicketState state;

  public Ticket(String id) {
    this.id = id;
    // this.state = (Assign new State) here
  }

  public String getId() {
    return id;
  }

  public void setState(TicketState state) {
    this.state = state;
  }

  public void assignAgent(String agentName) {
    state.assignAgent(this, agentName);
  }

  public void replyToCustomer(String message) {
    state.replyToCustomer(this, message);
  }

  public void resolve() {
    state.resolve(this);
  }

  public void close() {
    state.close(this);
  }
}
