package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constantsfile.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivermanager {
	
	private static Drivermanager drivermanager_instance;
	private Drivermanager() {};
	public static Drivermanager getInstance() {
		if(drivermanager_instance == null) {
			drivermanager_instance = new Drivermanager();
		}
		return drivermanager_instance;
		
	}
	
	
	WebDriver driver;
	public void drivermanager() {
		
		switch(Constants.Browser) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case"edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		
		case"gecko":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
		
		default:	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
	}
	
	

}
