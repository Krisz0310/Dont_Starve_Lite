package game.dont_starve_lite;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("NewGame.fxml")));
        Scene scene = new Scene(root);
        Image ikon = new Image("icon.png");
        stage.getIcons().add(ikon);
        stage.setTitle("Don't Starve Lite");
        stage.setWidth(610);
        stage.setHeight(530);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}