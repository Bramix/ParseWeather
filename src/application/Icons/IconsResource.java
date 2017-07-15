package application.Icons;

import javafx.scene.image.Image;

public class IconsResource {

private Image cloud = new Image(String.valueOf(getClass().getResource("Cloud.png")));
private Image rain = new Image(String.valueOf(getClass().getResource("Rain.png")));
private Image rainStorm = new Image(String.valueOf(getClass().getResource("RainStorm.png")));
private Image sun = new Image(String.valueOf(getClass().getResource("Sun.png")));
private Image sunAndCloud = new Image(String.valueOf(getClass().getResource("SunAndCloud.png")));
private Image sunAndRain = new Image(String.valueOf(getClass().getResource("SunAndRain.png")));
private Image sunRainStorm = new Image(String.valueOf(getClass().getResource("SunRainStorm.png")));
private Image icon = new Image(String.valueOf(getClass().getResource("Icon.png")));


	public Image getCloud() {
		return cloud; 
	}
	
	public Image getRain() {
		return rain; 
	}
	
	public Image getRainStorm() {
		return rainStorm; 
	}
	
	public Image getSun() {
		return sun; 
	}
	
	public Image getSunAndCloud() {
		return sunAndCloud; 
	}
	
	public Image getSunAndRain() {
		return sunAndRain; 
	}
	
	public Image getSunRainStorm() {
		return sunRainStorm;
	}
	
	public Image getIcon() {
		return icon;
	}

}
