package application;

import application.Icons.IconsResource;
import javafx.scene.image.Image;

public class Constant {

private final String sinoptik = "https://sinoptik.ua/%D0%BF%D0%BE%D0%B3%D0%BE%D0%B4%D0%B0-%D1%81%D1%83%D0%BC%D1%8B"; 
private final String cloudSunAndSmollRain = "Облачно с прояснениями, мелкий дождь";
private final String cloudSunAndRain = "Облачно с прояснениями, дождь";
private final String cloudSunAndRain2 = "Сплошная облачность, мелкий дождь";
private final String cloudSunAndRain3 = "Сплошная облачность, дождь";
private final String cloudSunAndRain4 = "Сплошная облачность, сильный дождь";
private final String cloudAndSun = "Облачно с прояснениями";
private final String cloudAndSun2 = "Переменная облачность";
private final String cloudAndSun3 = "Небольшая облачность";
private final String onlyCloud = "Сплошная облачность";
private final String sun = "Ясно";
private final String cloudSunStorm = "Облачно с прояснениями, дождь, грозы";
private final String cloudStorm = "Сплошная облачность, дождь, грозы";
private final String cloudStorm2 = "Облачно с прояснениями, сильный дождь";
private IconsResource icon = new IconsResource();

	public String getSinoptik() {
		return sinoptik;
	}
	
	public String getCloudSunAndRain() {
		return cloudSunAndRain;
	}
	
	public String getCloudSunAndSmollRain() {
		return cloudSunAndSmollRain;
	}
	
	public Image checkWeather(String string) {
		switch (string) {
		case cloudSunAndRain :
		case cloudSunAndSmollRain:
		case cloudSunAndRain2:
		case cloudSunAndRain3:
		case cloudSunAndRain4:
			return icon.getSunAndRain();
		case cloudAndSun:
		case cloudAndSun2:
		case cloudAndSun3:
			return icon.getSunAndCloud();
		case onlyCloud:
			return icon.getCloud();
		case sun:
			return icon.getSun();
		case cloudSunStorm:
			return icon.getSunRainStorm();
		case cloudStorm:
		case cloudStorm2:
			return icon.getRainStorm();
		default:
			return icon.getSunAndCloud();
		}
	}

}
