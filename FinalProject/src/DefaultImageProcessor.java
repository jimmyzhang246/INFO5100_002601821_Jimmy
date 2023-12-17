import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DefaultImageProcessor implements ImageProcessor {

    private BufferedImage curImg;

    @Override
    public void loadImage(File imageFile) {
        try {
            // Load image
            curImg = ImageIO.read(imageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void convertImage(String format) {
        // Check if image is loaded
        if (curImg != null) {
            try {
                // Convert image
                File outputFile = new File("converted." + format);
                ImageIO.write(curImg, format, outputFile);
                System.out.println("Image converted and saved as: " + outputFile.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void saveImage(File destination) {
        // Check if image is loaded and destination is valid
        if (curImg != null && destination != null) {
            try {
                // Save image
                ImageIO.write(curImg, "png", destination); // Assuming PNG as default
                System.out.println("Image saved to: " + destination.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
