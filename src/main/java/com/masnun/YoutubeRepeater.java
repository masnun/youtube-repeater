package com.masnun;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class YoutubeRepeater extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();

        Parent root = loader.load(getClass().getClassLoader().getResource("main.fxml"));
        Scene scene = new Scene(root);

        stage.setTitle("Youtube Repeater");
        stage.setScene(scene);
        stage.show();
    }
}