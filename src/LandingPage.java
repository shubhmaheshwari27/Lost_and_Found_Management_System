import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LandingPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lost and Found Management System");

        // Header Section
        Label logoLabel = new Label("Lost and Found");
        logoLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        Button reportButton = new Button("Report Lost Item");
        Button adminLoginButton = new Button("Admin Login");
        HBox headerBox = new HBox(10, logoLabel, reportButton, adminLoginButton);
        headerBox.setPadding(new Insets(10));

        // Hero Section
        Label welcomeLabel = new Label("Welcome to Lost and Found Management System");
        welcomeLabel.setStyle("-fx-font-size: 32px; -fx-font-weight: bold;");
        Button ctaButton = new Button("Report Lost Item");
        VBox heroBox = new VBox(20, welcomeLabel, ctaButton);
        heroBox.setPadding(new Insets(50));
        heroBox.setStyle("-fx-background-color: #f0f0f0;");

        // Features Section
        // Add feature elements here

        // Testimonials Section
        // Add testimonial elements here

        // Footer Section
        Label contactLabel = new Label("Contact: contact@lostandfound.com");
        Label socialLabel = new Label("Follow us: @lostandfound");
        HBox footerBox = new HBox(10, contactLabel, socialLabel);
        footerBox.setPadding(new Insets(10));

        // Combine sections into a BorderPane
        BorderPane root = new BorderPane();
        root.setTop(headerBox);
        root.setCenter(heroBox);
        root.setBottom(footerBox);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
