package Command;

public class TurnOffTelevision implements Command{

    private final Television tv;

    public TurnOffTelevision(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.TurnOff();
    }
}
