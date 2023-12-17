import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePropertiesPanel extends VBox {

    private Label isl;
    private Label idl;

    public ImagePropertiesPanel() {
        // Initialize labels
        isl = new Label("Size: ");
        idl = new Label("Dimensions: ");

        // Add labels
        this.getChildren().addAll(isl, idl);
    }

    public void setImageProperties(File imageFile) {
        // Get file size
        long imageSize = imageFile.length();
        isl.setText("Size: " + imageSize + " bytes");

        try {
            // Read image
            BufferedImage image = ImageIO.read(imageFile);
            // Get dimensions
            int width = image.getWidth();
            int height = image.getHeight();
            idl.setText("Dimensions: " + width + " x " + height);
        } catch (IOException e) {
            idl.setText("Dimensions: Not available");
            e.printStackTrace();
        }
    }
}
