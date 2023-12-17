import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FormatConversionPanel extends VBox {

    private ComboBox<String> fcbtn;
    private Button cbtn;
    private Button dbtn;
    private File curFile;
    private File cvtFile;
    private Stage stage;
    private ImageProcessor imageProcessor;

    public FormatConversionPanel() {
        // Get image processor
        this.imageProcessor = ImageProcessorFactory.getImageProcessor();

        // Format selection
        fcbtn = new ComboBox<>();
        fcbtn.getItems().addAll("png", "jpg", "bmp", "gif");

        // Convert button
        cbtn = new Button("Convert");
        cbtn.setOnAction(event -> convertImage());

        // Download button
        dbtn = new Button("Download Converted Image");
        dbtn.setOnAction(event -> downloadImage());
        dbtn.setDisable(true); // Initially disabled

        // Layout setup
        HBox hbox = new HBox(10, fcbtn, cbtn);
        this.getChildren().addAll(hbox, dbtn);
    }

    public void setCurrentImageFile(File file) {
        // Set current image file
        this.curFile = file;
    }

    private void convertImage() {
        // Convert image
        if (curFile != null && fcbtn.getValue() != null) {
            imageProcessor.loadImage(curFile);
            imageProcessor.convertImage(fcbtn.getValue());
            // Save path
            this.cvtFile = new File("converted." + fcbtn.getValue());
            dbtn.setDisable(false); // Enable download
        }
    }

    private void downloadImage() {
        // Download converted image
        if (cvtFile != null) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Image");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Image Files", "*." + fcbtn.getValue())
            );
            File dest = fileChooser.showSaveDialog(stage);
            if (dest != null) {
                imageProcessor.saveImage(dest);
            }
        }
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
