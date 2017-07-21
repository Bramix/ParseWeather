package application;

import java.io.IOException;
import application.Logic.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class Main extends Application {
private Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
    	FXShow.showWindow("main.fxml", true);
    }

    public static void main(String[] args) throws IOException {
        launch(args);
        
    }
    
}