package application.Objects;

import javafx.scene.image.Image;

public class Info {
	
	private String sky;
	private String degree; 
	
	public Info(String sky, String degree){
		this.sky = sky; 
		this.degree = degree; 
	}
	
	public String getSky(){
		return sky; 
	}
	
	public void setSky(String sky){
		this.sky = sky; 
	}
	
	public String getDegree(){
		return degree; 
	}
	
	public void setDegree(String degree){
		this.degree = degree; 
	}
	
	
	
	

}
