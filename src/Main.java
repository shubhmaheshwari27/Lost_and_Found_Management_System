import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lost and Found Management System");

        // Create buttons for report lost item and admin login
        Button reportLostItemButton = new Button("Report Lost Item");
        Button adminLoginButton = new Button("Admin Login");

        // Handle button actions (implement functionality later)
        reportLostItemButton.setOnAction(e -> {
            // Launch lost item report form page
            LostItemReportFormPage lostItemReportFormPage = new LostItemReportFormPage();
            lostItemReportFormPage.start(new Stage());
        });


        adminLoginButton.setOnAction(e -> {
            // Launch admin login page
            AdminLoginPage adminLoginPage = new AdminLoginPage();
            adminLoginPage.start(new Stage());
        });
        // Add buttons to a vertical layout
        VBox root = new VBox(10, reportLostItemButton, adminLoginButton);

        // Create scene and set it to stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}