package State;

public class Main {

    public static void main(String[] args) {
        MobileContext mobileContext = new MobileContext();
        mobileContext.alert();

        mobileContext.setStat(new Silent());
        mobileContext.alert();
    }
}
