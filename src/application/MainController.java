package application;

import application.Icons.IconsResource;
import application.Logic.Browser;
import application.Logic.FXShow;
import application.Logic.StartInfo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
	private StartInfo date = new StartInfo();
	private ObservableList<String> test = date.getDate();
	private Browser browser = new Browser(); 
	private Constant check = new Constant();
	private FXShow exit = new FXShow();  
	@FXML
	ComboBox weekend;
	@FXML 
	private Label temperature;
	@FXML
	private Label weather;
	@FXML
	private ImageView sun;
	@FXML
	private Button site; 
	
	@FXML
	private void getSite() {
		browser.ShowBrowser();
	}
	
	@FXML
	public void reload() {
		int inx = weekend.getSelectionModel().getSelectedIndex();
		temperature.setText(date.getBook().get(inx).getDegree());
		weather.setText(date.getBook().get(inx).getSky());
		sun.setImage(check.checkWeather(weather.getText()));
	}
	
	@FXML
	public void exit() {
		System.exit(0);
		
	}
	@FXML
	public void initialize(){
		date.parseToInfo();
		weekend.setValue(date.getDate().get(0));
		weekend.setItems(date.getDate());
		temperature.setText(date.getBook().get(0).getDegree());
		weather.setText(date.getBook().get(0).getSky());
		sun.setImage(check.checkWeather(weather.getText()));
        	
	}

}
