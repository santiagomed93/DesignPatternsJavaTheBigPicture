package behavioral_design_patterns.command_pattern.example_1;

public class LightDownCommand implements Command {

    private Light light;

    public LightDownCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.down();
    }

    @Override
    public void undo() {
        light.up();
    }
}