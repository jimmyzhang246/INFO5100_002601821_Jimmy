import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThumbnailDisplayPanel extends HBox {

    private ImageView iv;

    public ThumbnailDisplayPanel() {
        // Initialize
        iv = new ImageView();
        // Set size
        iv.setFitHeight(100);
        iv.setFitWidth(100);

        // Set position
        this.setAlignment(Pos.CENTER);
        // Add ImageView to panel
        this.getChildren().add(iv);
    }

    public void setImage(File imageFile) {
        try {
            // Load and set image
            Image img = new Image(new FileInputStream(imageFile));
            iv.setImage(img);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
