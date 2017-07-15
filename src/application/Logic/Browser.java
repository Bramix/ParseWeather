package application.Logic;
import java.net.URL;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


public class Browser  {

private Scene scene;
MyBrowser myBrowser;

public void ShowBrowser() {
	try {
	Stage stage = new Stage();
	myBrowser = new MyBrowser();
	scene = new Scene(myBrowser, 670, 540);
	stage.setScene(scene);
	stage.setResizable(false);
	stage.show();}
	catch(Exception e) {
		FXShow.showAlert("Ошибка подключения", null, "Проверьте наличие интернет соеденения!");
	}
	
}

class MyBrowser extends Region{
	final String hellohtml = "hello.html";
	WebView webView = new WebView();
	WebEngine webEngine = webView.getEngine();
	
	public MyBrowser(){
		webEngine.load("https://sinoptik.ua/%D0%BF%D0%BE%D0%B3%D0%BE%D0%B4%D0%B0-%D1%81%D1%83%D0%BC%D1%8B");
		getChildren().add(webView);
		
		

		
	}
}
}