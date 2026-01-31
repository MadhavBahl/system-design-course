package BehavioralPatterns.StatePattern.GoodCode;

public interface TicketState {
  void assignAgent(Ticket ticket, String agentName);

  void replyToCustomer(Ticket ticket, String message);

  void resolve(Ticket ticket);

  void close(Ticket ticket);
}
