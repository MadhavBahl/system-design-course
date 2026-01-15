
// Example: Navigation app choosing different types of routes WITHOUT Strategy Pattern
// The app can choose: fastest route, shortest route, or scenic route.
// All the logic is handled with if-else checks inside one big class.

class RoutePlannerWithoutStrategy {

  public void calculateRoute(String from, String to, String routeType) {
    if ("FASTEST".equalsIgnoreCase(routeType)) {
      System.out.println("Calculating FASTEST route from " + from + " to " + to + "...");
      System.out.println("Using highways and main roads, ignoring small streets.");
    } else if ("SHORTEST".equalsIgnoreCase(routeType)) {
      System.out.println("Calculating SHORTEST route from " + from + " to " + to + "...");
      System.out.println("Using the minimum distance, even if it has more turns.");
    } else if ("SCENIC".equalsIgnoreCase(routeType)) {
      System.out.println("Calculating SCENIC route from " + from + " to " + to + "...");
      System.out.println("Preferring parks, lakes and pretty roads over speed.");
    } else {
      System.out.println("Unknown route type. Using default FASTEST route from " + from + " to " + to + ".");
    }
  }
}

public class WithoutStrategyPattern {
  public static void main(String[] args) {
    RoutePlannerWithoutStrategy planner = new RoutePlannerWithoutStrategy();

    System.out.println("--- Fastest route ---");
    planner.calculateRoute("Home", "School", "FASTEST");

    System.out.println();

    System.out.println("--- Shortest route ---");
    planner.calculateRoute("Home", "School", "SHORTEST");

    System.out.println();

    System.out.println("--- Scenic route ---");
    planner.calculateRoute("Home", "School", "SCENIC");
  }
}
