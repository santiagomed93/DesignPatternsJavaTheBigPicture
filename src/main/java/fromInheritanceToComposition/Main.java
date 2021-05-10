package fromInheritanceToComposition;

public class Main {

    public static void main(String[] args){
        MediaFile file = new MediaFile(new PlayVideo());
        file.play();

        file.setBehavior(new PlayAudio());
        file.play();

        file.setBehavior(null);
        file.play();

        file.setBehavior(new PlayAnimation());
        file.play();
    }
}
