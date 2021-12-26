package Command;

public class Main {
    public static void main(String[] args) {
        Television television =  new Television();

        TurnOnTelevision turnOnTelevision =  new TurnOnTelevision(television);
        TurnOffTelevision turnOffTelevision = new TurnOffTelevision(television);

        RemoteControl remoteControl =  new RemoteControl();
        remoteControl.addCommand(0,turnOnTelevision,turnOffTelevision);

        remoteControl.onButtonPress(0);
        remoteControl.offButtonPress(0);
    }
}
