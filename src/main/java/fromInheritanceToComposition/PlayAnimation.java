package fromInheritanceToComposition;

public class PlayAnimation implements PlayBehavior{
    @Override
    public void play() {
        System.out.println("Running play implementation from PlayAnimation");
    }
}
