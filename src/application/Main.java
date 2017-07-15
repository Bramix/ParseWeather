package application;

import java.io.IOException;
import application.Logic.*;
import javafx.application.Application;
import javafx.stage.Stage;



public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
    	FXShow.showWindow("main.fxml", true);
    }

    public static void main(String[] args) throws IOException {
        launch(args);
        
    }
    
}