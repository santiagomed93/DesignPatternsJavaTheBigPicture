package fromInheritanceToComposition;

public class MediaFile {

    private PlayBehavior behavior;

    public MediaFile(PlayBehavior behavior){
        this.behavior = behavior;
    }

    public void play(){
        if ((behavior != null)) {
            behavior.play();
        } else {
            System.out.println("Play behavior not supported");
        }
    }

    public void setBehavior(PlayBehavior behavior){
        this.behavior = behavior;
    }
}
