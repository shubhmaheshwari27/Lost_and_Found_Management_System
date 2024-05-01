import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdminPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Admin Page");

        // Create buttons for sub-GUIs
        Button addLostItemButton = new Button("Add Lost Item");
        Button addFoundItemButton = new Button("Add Found Item");
        Button viewMatchedItemsButton = new Button("View Matched Items");

        // Handle button actions
        addLostItemButton.setOnAction(e -> {
            // Launch GUI for adding lost items
            AddLostItemPage addLostItemPage = new AddLostItemPage();
            addLostItemPage.start(new Stage());
        });

        addFoundItemButton.setOnAction(e -> {
            // Launch GUI for adding found items
            AddFoundItemPage addFoundItemPage = new AddFoundItemPage();
            addFoundItemPage.start(new Stage());
        });

        viewMatchedItemsButton.setOnAction(e -> {
            // Launch GUI for viewing matched items
            ViewMatchedItemsPage viewMatchedItemsPage = new ViewMatchedItemsPage();
            viewMatchedItemsPage.start(new Stage());
        });

        // Add buttons to a vertical layout
        VBox root = new VBox(10, addLostItemButton, addFoundItemButton, viewMatchedItemsButton);

        // Create scene and set it to stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
