import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Set the title of the stage
        primaryStage.setTitle("My JavaFX App");

        // Set the dimensions of the stage
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);

        // Make the stage resizable (optional)
        primaryStage.setResizable(true);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
