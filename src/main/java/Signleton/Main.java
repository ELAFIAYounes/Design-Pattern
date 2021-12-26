package Signleton;

public class Main {
    public static void main(String[] args) {

        Single object1 = Single.getInstance();
        object1.printer();

        Single object2 = Single.getInstance();
        object2.printer();

    }
}
