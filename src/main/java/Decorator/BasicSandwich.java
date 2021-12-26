package Decorator;

public class BasicSandwich implements Sandwich{
    @Override
    public String getDescription() {
        return "bread";
    }

    @Override
    public double getCost() {
        return 10.5;
    }
}
