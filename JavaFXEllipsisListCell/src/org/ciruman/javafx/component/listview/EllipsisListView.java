package org.ciruman.javafx.component.listview;

import java.util.UUID;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Diego Cirujano
 */
public class EllipsisListView extends Application {

    @Override
    public void start(Stage primaryStage) {
        ListView<String> root = new ListView<>();

        root.getItems().add(UUID.randomUUID().toString() + UUID.randomUUID().toString());
        root.getItems().add(UUID.randomUUID().toString() + UUID.randomUUID().toString());
        root.getItems().add(UUID.randomUUID().toString() + UUID.randomUUID().toString());

        root.setCellFactory((ListView<String> param) -> new EllipsisListCell());

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    private class EllipsisListCell extends ListCell<String> {

        private final Label label = new Label();
        private final StackPane pane;

        private EllipsisListCell() {
            pane = new StackPane();
            pane.setStyle("-fx-border-color:red;");
            pane.setMinWidth(0);
            pane.setPrefWidth(1);
            pane.getChildren().add(label);
        }

        @Override
        protected void updateItem(String item, boolean empty) {
            if (empty || item == null) {
                setGraphic(null);
                setText("");
            } else {
                label.setText(item);
                setGraphic(pane);
            }
        }
    }

}
