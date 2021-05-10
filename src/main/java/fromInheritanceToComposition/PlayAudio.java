package fromInheritanceToComposition;

public class PlayAudio implements PlayBehavior{
    @Override
    public void play() {
        System.out.println("Running play implementation from PlayAudio");
    }
}
