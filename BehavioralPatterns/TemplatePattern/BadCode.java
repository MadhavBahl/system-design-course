package BehavioralPatterns.TemplatePattern;

// Example: Making hot drinks (Tea vs Coffee) WITHOUT Template Method
// Each drink follows similar steps: boil water, brew, pour into cup, add extras.
// But here, each class re-implements the whole algorithm on its own.

class TeaMakerWithoutTemplate {
  public void makeTea() {
    boilWater();
    steepTeaBag();
    pourInCup();
    addLemon();
  }

  private void boilWater() {
    System.out.println("Boiling water...");
  }

  private void steepTeaBag() {
    System.out.println("Steeping the tea bag...");
  }

  private void pourInCup() {
    System.out.println("Pouring drink into the cup...");
  }

  private void addLemon() {
    System.out.println("Adding lemon to tea.");
  }
}

class CoffeeMakerWithoutTemplate {
  public void makeCoffee() {
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }

  private void boilWater() {
    System.out.println("Boiling water...");
  }

  private void brewCoffeeGrinds() {
    System.out.println("Brewing coffee grinds...");
  }

  private void pourInCup() {
    System.out.println("Pouring drink into the cup...");
  }

  private void addSugarAndMilk() {
    System.out.println("Adding sugar and milk to coffee.");
  }
}

public class BadCode {
  public static void main(String[] args) {
    System.out.println("--- Making Tea (without Template Method) ---");
    TeaMakerWithoutTemplate teaMaker = new TeaMakerWithoutTemplate();
    teaMaker.makeTea();

    System.out.println();

    System.out.println("--- Making Coffee (without Template Method) ---");
    CoffeeMakerWithoutTemplate coffeeMaker = new CoffeeMakerWithoutTemplate();
    coffeeMaker.makeCoffee();
  }
}
