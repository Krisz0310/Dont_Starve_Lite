module game.dont_starve_lite {
    requires javafx.controls;
    requires javafx.fxml;


    opens game.dont_starve_lite to javafx.fxml;
    exports game.dont_starve_lite;
}