import java.io.File;

public interface ImageProcessor {
    void loadImage(File imageFile);
    void convertImage(String format);
    void saveImage(File destination);
}
