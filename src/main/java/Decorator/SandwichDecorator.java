package Decorator;

public class SandwichDecorator implements Sandwich{
    private final Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription();
    }

    @Override
    public double getCost() {
        return sandwich.getCost();
    }
}
