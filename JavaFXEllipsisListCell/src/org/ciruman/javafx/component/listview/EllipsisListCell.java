package org.ciruman.javafx.component.listview;

import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.StackPane;

/**
 * ListCell that returns cells with ellipsis(...) applied automatically because
 * the default functionality of JavaFX ListViews is a horizontal scroll.
 *
 * @author Diego Cirujano
 */
public class EllipsisListCell extends ListCell<String> {

    private final Label label = new Label();
    private final StackPane pane;

    public EllipsisListCell() {
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
