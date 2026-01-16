
// Example: Navigation app choosing different types of routes WITH Strategy Pattern

// Strategy interface: defines the common behavior for all route strategies
interface RouteStrategy {
  void buildRoute(String from, String to);
}

// Concrete strategy: finds the fastest route
class FastestRouteStrategy implements RouteStrategy {
  @Override
  public void buildRoute(String from, String to) {
    System.out.println("[FastestRouteStrategy] Calculating FASTEST route from " + from + " to " + to + "...");
    System.out.println("Using highways and main roads to minimize time.");
  }
}

// Concrete strategy: finds the shortest route by distance
class ShortestRouteStrategy implements RouteStrategy {
  @Override
  public void buildRoute(String from, String to) {
    System.out.println("[ShortestRouteStrategy] Calculating SHORTEST route from " + from + " to " + to + "...");
    System.out.println("Minimizing distance, even if it has more turns.");
  }
}

// Concrete strategy: finds a scenic route with nice views
class ScenicRouteStrategy implements RouteStrategy {
  @Override
  public void buildRoute(String from, String to) {
    System.out.println("[ScenicRouteStrategy] Calculating SCENIC route from " + from + " to " + to + "...");
    System.out.println("Preferring parks, lakes and pretty roads over speed.");
  }
}

// Context class: uses a RouteStrategy to build a route
class Navigator {
  private RouteStrategy strategy;

  public Navigator(RouteStrategy strategy) {
    this.strategy = strategy;
  }

  public void setStrategy(RouteStrategy strategy) {
    this.strategy = strategy;
  }

  public void navigate(String from, String to) {
    if (strategy == null) {
      System.out.println("No route strategy selected.");
      return;
    }
    strategy.buildRoute(from, to);
  }
}

public class WithStrategyPattern {
  public static void main(String[] args) {
    Navigator navigator = new Navigator(new FastestRouteStrategy());

    System.out.println("--- Fastest route ---");
    navigator.navigate("Home", "School");

    System.out.println();

    System.out.println("--- Shortest route ---");
    navigator.setStrategy(new ShortestRouteStrategy());
    navigator.navigate("Home", "School");

    System.out.println();

    System.out.println("--- Scenic route ---");
    navigator.setStrategy(new ScenicRouteStrategy());
    navigator.navigate("Home", "School");
  }
}
