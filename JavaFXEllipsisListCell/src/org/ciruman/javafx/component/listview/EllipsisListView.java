/**
  Copyright (C) 2015  Diego Cirujano Cuesta

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.ciruman.javafx.component.listview;

import java.util.UUID;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
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

}
