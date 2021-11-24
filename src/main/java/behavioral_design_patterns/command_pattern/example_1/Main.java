package behavioral_design_patterns.command_pattern.example_1;

public class Main {

    public static void main(String[] args){
        Light light = new Light();
        Invoker invoker = new Invoker(
                new LightOnCommand(light),
                new LightOffCommand(light),
                new LightUpCommand(light),
                new LightDownCommand(light)
        );

        invoker.clickOn();
        invoker.clickDown();
        invoker.clickUp();
        invoker.clickDown();
    }
}
