package Decorator;

public class Main {
    public static void main(String[] args) {
        Sandwich sandwich =  new Beef(new BasicSandwich());
        System.out.println( sandwich.getCost() );
        System.out.println( sandwich.getDescription() );


    }
}
