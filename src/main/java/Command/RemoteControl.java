package Command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands =  new Command[3];
        offCommands = new Command[3];
    }

    public void addCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPress(int slot){
        onCommands[slot].execute();
    }

    public void offButtonPress(int slot){
        offCommands[slot].execute();
    }
}
