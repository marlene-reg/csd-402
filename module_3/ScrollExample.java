import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScrollExample {

    @Override
    public void start(Stage primaryStage) {
        // Create a VBox to hold multiple labels
        VBox content = new VBox(10); // 10px spacing between elements
        for (int i = 1; i <= 50; i++) {
            content.getChildren().add(new Label("Item " + i));
        }

        // Create a ScrollPane and set the VBox as its content
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(content);

        // Optional: Customize ScrollPane behavior
        scrollPane.setFitToWidth(true); // Ensures content width matches ScrollPane width
        scrollPane.setPannable(true);   // Allows panning with mouse drag

        // Create a Scene and set it on the Stage
        Scene scene = new Scene(scrollPane, 300, 400); // 300x400 window size
        primaryStage.setTitle("JavaFX ScrollPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}