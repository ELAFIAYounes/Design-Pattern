package Factory;

public class Main {
    public static void main(String[] args) {
        Drink coffee = DrinkFactory.makeDrink(DrinkFactory.COFFEE_LATTE);
        coffee.prepare();
    }
}
