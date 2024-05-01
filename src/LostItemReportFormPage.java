import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LostItemReportFormPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lost Item Report Form");

        // Create labels and fields for item details
        Label itemNameLabel = new Label("Item Name:");
        TextField itemNameField = new TextField();
        Label categoryLabel = new Label("Category:");
        TextField categoryField = new TextField();
        // Add more fields as needed

        // Create labels and fields for user details
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        Label contactNumberLabel = new Label("Contact Number:");
        TextField contactNumberField = new TextField();
        // Add more fields as needed

        // Create submit button
        Button submitButton = new Button("Submit");

        // Handle submit button action
        submitButton.setOnAction(e -> {
            // Retrieve item details from fields
            String itemName = itemNameField.getText();
            String category = categoryField.getText();
            // Retrieve user details from fields
            String name = nameField.getText();
            String contactNumber = contactNumberField.getText();

            // Validate input fields (implement validation logic)

            // If validation passes, proceed to submit data (implement data submission logic)
            // For demonstration purposes, we'll print the retrieved data
            System.out.println("Item Name: " + itemName);
            System.out.println("Category: " + category);
            System.out.println("Name: " + name);
            System.out.println("Contact Number: " + contactNumber);

            // Reset fields after submission (optional)
            itemNameField.clear();
            categoryField.clear();
            nameField.clear();
            contactNumberField.clear();
        });

        // Add labels, fields, and button to a vertical layout
        VBox root = new VBox(10,
                itemNameLabel, itemNameField,
                categoryLabel, categoryField,
                nameLabel, nameField,
                contactNumberLabel, contactNumberField,
                submitButton);

        // Create scene and set it to stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
