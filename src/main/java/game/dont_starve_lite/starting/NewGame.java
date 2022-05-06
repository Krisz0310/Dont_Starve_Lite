package game.dont_starve_lite.starting;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class NewGame {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void adatSzerez(Stage stage) {
        this.stage = stage;
    }

    public void newGame() throws IOException {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("PlayerSelect.fxml")));
        root = loader.load();
        PlayerSelect playerSelect = loader.getController();
        playerSelect.adatSzerez(stage);
        scene = new Scene(root);
        scene.getStylesheets().addAll("file:css/NewGame.css");
        stage.setScene(scene);
        stage.show();
    }

    public void exit() throws IOException {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("Exit.fxml")));
        root = loader.load();
        Exit exit = loader.getController();
        exit.adatSzerez(stage);
        scene = new Scene(root);
        scene.getStylesheets().addAll("file:css/NewGame.css");
        stage.setScene(scene);
        stage.show();
    }
}