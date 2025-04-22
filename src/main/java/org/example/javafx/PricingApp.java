package org.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class PricingApp extends Application {
    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(PricingApp.class.getResource("pricing-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Pricing Plans");
        stage.setScene(scene);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/org/example/javafx/images.png")));

        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}