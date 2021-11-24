package behavioral_design_patterns.command_pattern.example_1;

public class LightUpCommand implements Command {

    private Light light;

    public LightUpCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.up();
    }

    @Override
    public void undo() {
        light.down();
    }
}