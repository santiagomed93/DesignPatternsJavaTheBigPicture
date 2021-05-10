package fromInheritanceToComposition;

public class PlayVideo implements PlayBehavior{
    @Override
    public void play() {
        System.out.println("Running play implementation from PlayVideo");
    }
}
