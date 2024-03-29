import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login to Pills on Wheels");

        // Create UI elements
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER); // Center the grid
        grid.setPadding(new Insets(10));
        grid.setVgap(10);
        grid.setHgap(10);

        grid.setStyle("-fx-background-color: #FBF6F3;");

        //BURKAYY LOGOMUZU YÜKLEYELİM!
        
        Label usernameLabel = new Label("Username:");
        usernameLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        GridPane.setConstraints(usernameLabel, 0, 0);
        TextField usernameInput = new TextField();
        GridPane.setConstraints(usernameInput, 1, 0);

        Label passwordLabel = new Label("Password:");
        passwordLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        GridPane.setConstraints(passwordLabel, 0, 1);
        PasswordField passwordInput = new PasswordField();
        GridPane.setConstraints(passwordInput, 1, 1);

        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: orange;"); 
        GridPane.setConstraints(loginButton, 1, 2);

        // Add UI elements to the grid
        grid.getChildren().addAll(usernameLabel, usernameInput, passwordLabel, passwordInput, loginButton);

        // Add event handler for login button
        loginButton.setOnAction(e -> {
            String username = usernameInput.getText();
            String password = passwordInput.getText();
            // Add your login logic here
            if (isValid(username, password)) {
                System.out.println("Login successful");
                // Navigate to the next screen or perform other actions
            } else {
                System.out.println("Invalid username or password");
                // Display error message to the user
            }
        });

        Scene scene = new Scene(grid, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Dummy method to simulate login validation
    private boolean isValid(String username, String password) {
        // Add your actual login validation logic here
        return username.equals("admin") && password.equals("password");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
