import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdminLoginPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Admin Login");

        // Create labels and fields for username and password
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();

        // Create login button
        Button loginButton = new Button("Login");

        // Handle login button action
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            // Implement logic to validate username and password
            if (isValidCredentials(username, password)) {
                // Navigate to admin dashboard
                primaryStage.close(); // Close login window

                // Launch AdminPage
                AdminPage adminPage = new AdminPage();
                adminPage.start(new Stage());
                // Implement logic to navigate to admin dashboard
            } else {
                // Display error message (implement later)
                System.out.println("Invalid credentials");
            }
        });

        // Add labels, fields, and button to a vertical layout
        VBox root = new VBox(10, usernameLabel, usernameField, passwordLabel, passwordField, loginButton);

        // Create scene and set it to stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Dummy method to validate credentials (replace with actual logic)
    private boolean isValidCredentials(String username, String password) {
        // Dummy validation (replace with actual validation logic)
        return username.equals("admin") && password.equals("admin123");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
