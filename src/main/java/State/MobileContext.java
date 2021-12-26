package State;

public class MobileContext {
    private MobileAlertState mobileAlertState;

    public MobileContext() {
        mobileAlertState = new Ringing();
    }

    public void setStat(MobileAlertState stat){
        mobileAlertState = stat;
    }

    public void alert(){
        mobileAlertState.alert();
    }
}
