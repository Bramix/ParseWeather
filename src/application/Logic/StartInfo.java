package application.Logic;

import java.io.IOException;
import java.util.ArrayList;

import application.Constant;
import application.Objects.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class StartInfo {
	
private String day;
private String degree; 
private String sky; 
public String mounth; 
private ArrayList<Info> book = new ArrayList<>();
private ObservableList<String> date = FXCollections.observableArrayList();
private Constant constant = new Constant();

	public void parseToInfo() {
		try{
			Document doc = Jsoup.connect(constant.getSinoptik()).get();

			Elements elements = doc.getElementsByClass("main loaded");
			elements = doc.getElementsByClass("main");
			
				for(int i = 0; i < elements.size(); i++){
					mounth = elements.get(i).select("p.month").text();
					day = elements.get(i).select("[class^=day-link]").text() + ", " + elements.get(i).select("[class^=date]").text() + " " + mounth;
					sky = elements.get(i).select("[class^= weatherIco]").get(0).attr("title");
					degree = elements.select("div.min").get(i).text() +" " + elements.select("div.max").get(i).text() ;
					Info info = new Info(sky, degree);
					book.add(info);
					date.add(day);
				}
		}catch(Exception e){
			FXShow.showAlert("Ошибка подключения", null, "Проверьте наличие интернет соеденения!");
		}
	}
	
	public ArrayList<Info> getBook() {
		return book;
	}
	
	public ObservableList<String> getDate() {
		return date;
	}
	
}
		
				
			
	


