package behavioral_design_patterns.command_pattern.example_1;

public class Invoker {

    private Command on;
    private Command off;
    private Command up;
    private Command down;

    public Invoker (Command on, Command off, Command up, Command down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void clickOn() {
        on.execute();
    }

    public void clickOff() {
        off.execute();
    }

    public void clickUp() {
        up.execute();
    }

    public void clickDown() {
        down.execute();
    }
}
