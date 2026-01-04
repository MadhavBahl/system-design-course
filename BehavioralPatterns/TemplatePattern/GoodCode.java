package BehavioralPatterns.TemplatePattern;

// Example: Making hot drinks (Tea vs Coffee) WITH Template Method

// Template (abstract) class that defines the skeleton of the algorithm
abstract class BeverageMaker {

  // Template method - defines the steps and the order
  public final void makeBeverage() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  // Steps with default/common implementation
  protected void boilWater() {
    System.out.println("Boiling water...");
  }

  protected void pourInCup() {
    System.out.println("Pouring drink into the cup...");
  }

  // Steps that vary and must be implemented by subclasses
  protected abstract void brew();

  protected abstract void addCondiments();
}

// Concrete subclass for Tea
class TeaMaker extends BeverageMaker {
  @Override
  protected void brew() {
    System.out.println("Steeping the tea bag...");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Adding lemon to tea.");
  }
}

// Concrete subclass for Coffee
class CoffeeMaker extends BeverageMaker {
  @Override
  protected void brew() {
    System.out.println("Brewing coffee grinds...");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Adding sugar and milk to coffee.");
  }
}

public class GoodCode {
  public static void main(String[] args) {
    System.out.println("--- Making Tea (with Template Method) ---");
    BeverageMaker teaMaker = new TeaMaker();
    teaMaker.makeBeverage();

    System.out.println();

    System.out.println("--- Making Coffee (with Template Method) ---");
    BeverageMaker coffeeMaker = new CoffeeMaker();
    coffeeMaker.makeBeverage();
  }
}
