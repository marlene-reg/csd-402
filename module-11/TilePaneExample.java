import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneExample {

    @Override
    public void start(Stage primaryStage) {
        TilePane tilePane = new TilePane();
        tilePane.setHgap(5); 
        tilePane.setVgap(5); 
        tilePane.setPrefColumns(4); 

       
        for (int i = 1; i <= 9; i++) {
            Button button = new Button("Button " + i);
            button.setPrefSize(50, 25); 
            tilePane.getChildren().add(button);
        }


        Scene scene = new Scene(tilePane, 200, 100);
        primaryStage.setTitle("JavaFX TilePane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}