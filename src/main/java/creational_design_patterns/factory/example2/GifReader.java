package creational_design_patterns.factory.example2;

public class GifReader implements ImageReader{
    private DecodedImage decodedImage;
    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }
    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}
