package creational_design_patterns.factory.example2;

public class DecodedImage {
    private String image;
    public DecodedImage(String image){
        this.image = image;
    }

    @Override
    public String toString() {
        return image + ": is decoded";
    }
}
