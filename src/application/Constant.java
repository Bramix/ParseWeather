package application;

import application.Icons.IconsResource;
import javafx.scene.image.Image;

public class Constant {

private final String sinoptik = "https://sinoptik.ua/%D0%BF%D0%BE%D0%B3%D0%BE%D0%B4%D0%B0-%D1%81%D1%83%D0%BC%D1%8B"; 
private final String cloudSunAndSmollRain = "������� � ������������, ������ �����";
private final String cloudSunAndRain = "������� � ������������, �����";
private final String cloudSunAndRain2 = "�������� ����������, ������ �����";
private final String cloudSunAndRain3 = "�������� ����������, �����";
private final String cloudSunAndRain4 = "�������� ����������, ������� �����";
private final String cloudAndSun = "������� � ������������";
private final String cloudAndSun2 = "���������� ����������";
private final String cloudAndSun3 = "��������� ����������";
private final String onlyCloud = "�������� ����������";
private final String sun = "����";
private final String cloudSunStorm = "������� � ������������, �����, �����";
private final String cloudStorm = "�������� ����������, �����, �����";
private final String cloudStorm2 = "������� � ������������, ������� �����";
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
