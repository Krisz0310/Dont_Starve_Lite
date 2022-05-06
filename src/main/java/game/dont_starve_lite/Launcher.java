package game.dont_starve_lite;

import game.dont_starve_lite.starting.NewGame;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader =new FXMLLoader(Launcher.class.getResource("NewGame.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 800, 600);
        NewGame gomb = loader.getController();
        gomb.adatSzerez(stage);
        scene.getStylesheets().addAll("file:css/NewGame.css");
        stage.getIcons().add(new Image("file:kepek/hatter/icon.png"));
        stage.setTitle("Don't Starve Lite");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}