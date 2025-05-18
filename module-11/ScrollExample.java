import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class ScrollExample {
 
    @Override
    public void start(Stage primaryStage) {
        }
 
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(Hi);
 
        scrollPane.setFitToWidth(true); 
        scrollPane.setPannable(true);   
 
        Scene scene = new Scene(scrollPane, 100, 200); 
        primaryStage.setTitle("ScrollPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args); 
    }
}