package application.Logic;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Modality;
import application.Main;
import application.Icons.IconsResource;


public class FXShow {
private static IconsResource icon = new IconsResource();
    
    public static void showWindow(String str, boolean b){	
	Stage stage = new Stage();
	try {
            Parent root = FXMLLoader.load(Main.class.getResource(str));
            Scene scene = new Scene(root);
           
            stage.setScene(scene);
            stage.getIcons().add(icon.getIcon());
            	if(b){
            		stage.setResizable(false);
            	}
            stage.show();
	} catch (IOException e) {
		e.printStackTrace();
	}	
    }
    
    public static void closeWindow(Stage stage) {
        stage.close();
    }
    
    public static void showDialoge(String str){
    	Stage stage = new Stage();

	try {
            Parent root = FXMLLoader.load(Main.class.getResource(str));
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            //stage.initOwner(((Node)ActionEvent.getSource()).getScene().getWindow());
            stage.showAndWait();
	} catch (IOException e) {
		e.printStackTrace();
	}	
    }
    
    public static void showAlert(String title, String header, String content){
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle(title);
    	alert.setHeaderText(header);
    	alert.setContentText(content);

    	alert.showAndWait();
    }

}