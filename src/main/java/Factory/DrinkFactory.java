package Factory;

public class DrinkFactory {
    public static final int SODA = 1;
    public static final int COFFEE_LATTE = 2;

    public static Drink makeDrink(int drinkNumber){
        switch (drinkNumber){
            case SODA: return new Soda();
            case COFFEE_LATTE: return new Coffee();
            default: return null;
        }
    }
}
