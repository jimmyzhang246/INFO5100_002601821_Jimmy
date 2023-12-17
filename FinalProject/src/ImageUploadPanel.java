import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class ImageUploadPanel extends VBox {

    private final Stage stage;
    private ThumbnailDisplayPanel tdp;
    private ImagePropertiesPanel ipp;
    private FormatConversionPanel fcp;

    public ImageUploadPanel(Stage stage, ThumbnailDisplayPanel tdp, ImagePropertiesPanel ipp, FormatConversionPanel fcp) {
        // Initialize components
        this.stage = stage;
        this.tdp = tdp;
        this.ipp = ipp;
        this.fcp = fcp;
        initializeUI();
    }

    private void initializeUI() {
        // Create upload button
        Button uploadButton = new Button("Upload Image");
        // set action on click
        uploadButton.setOnAction(event -> openFileChooser());
        // add button to panel
        this.getChildren().add(uploadButton);
    }

    private void openFileChooser() {
        // File chooser
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image File");
        // Type choices
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );

        // Open file chooser dialog
        File selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null) {
            // Update panels with chosen image
            tdp.setImage(selectedFile);
            ipp.setImageProperties(selectedFile);
            fcp.setCurrentImageFile(selectedFile);
        }
    }
}
