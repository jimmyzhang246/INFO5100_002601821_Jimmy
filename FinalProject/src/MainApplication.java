import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // main layout
            BorderPane root = new BorderPane();

            // Thumbnail part
            ThumbnailDisplayPanel tdp = new ThumbnailDisplayPanel();

            // Image properties part
            ImagePropertiesPanel ipp = new ImagePropertiesPanel();

            // Format conversion part
            FormatConversionPanel fcp = new FormatConversionPanel();

            // Image upload part
            ImageUploadPanel up = new ImageUploadPanel(primaryStage, tdp, ipp, fcp);

            // Set layout
            root.setTop(up);
            root.setCenter(tdp);
            root.setLeft(fcp);
            root.setRight(ipp);

            // Create scene
            Scene scene = new Scene(root, 500, 300);

            // Setup stage
            primaryStage.setScene(scene);
            primaryStage.setTitle("Image Management Tool");

            // display window
            primaryStage.show();
        } catch (Exception e) {
            // Print error
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // launch app
        launch(args);
    }
}
