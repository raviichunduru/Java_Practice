package designpatterns.decorator;

// Base Coffee interface
interface Coffee {
    double getCost();
    String getDescription();
}

// Concrete Coffee implementation
class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1.0; // Base price for simple coffee
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}

// Decorator abstract class
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}

// Concrete decorator for adding milk
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        // Additional cost for milk
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        // Additional description for milk
        return super.getDescription() + ", with Milk";
    }
}

// Concrete decorator for adding sugar
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        // Additional cost for sugar
        return super.getCost() + 0.2;
    }

    @Override
    public String getDescription() {
        // Additional description for sugar
        return super.getDescription() + ", with Sugar";
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.getCost() + ", Description: " + simpleCoffee.getDescription());

        // Add milk to the coffee
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost: " + milkCoffee.getCost() + ", Description: " + milkCoffee.getDescription());

        // Add sugar to the coffee
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: " + milkSugarCoffee.getCost() + ", Description: " + milkSugarCoffee.getDescription());
    }
}
