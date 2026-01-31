enum TicketStatus {
  NEW,
  IN_PROGRESS,
  RESOLVED,
  CLOSED
}

public class BasicTicket {
  private final String id;
  private TicketStatus status = TicketStatus.NEW;

  public BasicTicket(String id) {
    this.id = id;
    this.status = TicketStatus.NEW;
  }

  public void assignAgent(String agentName) {
    switch (status) {
      case NEW:
        System.out.println("[Ticket " + id + "] Assigned to agent: " + agentName);
        status = TicketStatus.IN_PROGRESS;
        break;
      case IN_PROGRESS:
        System.out.println("[Ticket " + id + "] Already assigned. Agent can continue working.");
        break;
      case RESOLVED:
        System.out.println("[Ticket " + id + "] Already resolved. Reassign only if reopened.");
        break;
      case CLOSED:
        System.out.println("[Ticket " + id + "] Ticket is closed. Cannot assign a new agent.");
        break;
    }
  }

  public void replyToCustomer(String message) {
    switch (status) {
      case NEW:
        System.out.println("[Ticket " + id + "] Replying to customer and starting work: " + message);
        status = TicketStatus.IN_PROGRESS;
        break;
      case IN_PROGRESS:
        System.out.println("[Ticket " + id + "] Updating customer: " + message);
        break;
      case RESOLVED:
        System.out.println("[Ticket " + id + "] Ticket already resolved. Ask customer to reopen if needed.");
        break;
      case CLOSED:
        System.out.println("[Ticket " + id + "] Ticket is closed. Cannot reply.");
        break;
    }
  }

  public void resolve() {
    switch (status) {
      case NEW:
        System.out.println("[Ticket " + id + "] Can't resolve immediately. Start working first.");
        break;
      case IN_PROGRESS:
        System.out.println("[Ticket " + id + "] Marking as resolved.");
        status = TicketStatus.RESOLVED;
        break;
      case RESOLVED:
        System.out.println("[Ticket " + id + "] Already resolved.");
        break;
      case CLOSED:
        System.out.println("[Ticket " + id + "] Ticket is closed. Cannot resolve.");
        break;
    }
  }

  public void close() {
    switch (status) {
      case NEW:
      case IN_PROGRESS:
        System.out.println("[Ticket " + id + "] Cannot close directly. Resolve it first.");
        break;
      case RESOLVED:
        System.out.println("[Ticket " + id + "] Closing ticket.");
        status = TicketStatus.CLOSED;
        break;
      case CLOSED:
        System.out.println("[Ticket " + id + "] Already closed.");
        break;
    }
  }
}
