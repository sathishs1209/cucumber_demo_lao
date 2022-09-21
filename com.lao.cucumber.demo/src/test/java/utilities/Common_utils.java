package utilities;

import java.io.IOException;
import java.util.Properties;

import constantsfile.Constants;

public class Common_utils {
	
	private static Common_utils common_utilsinstance;
	
	private Common_utils() {};
	
	public static Common_utils getInstance() {
		if(common_utilsinstance == null) {
			common_utilsinstance = new Common_utils();
		}
		return common_utilsinstance;
		
	}
	
	

public void loadproperties() {
	
	Properties property = new Properties();
	try {
		property.load(getClass().getResourceAsStream("/config.properties"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	Constants.APP_URL = property.getProperty("APP_URL");
	Constants.Browser =  property.getProperty("Browser");
	Constants.UserName = property.getProperty("UserName");
	Constants.PassWord = property.getProperty("PassWord");
	Constants.ChromeDriverLocation = property.getProperty("ChromeDriverLocation");
	Constants.FireFoxDriverLocation = property.getProperty("FireFoxDriverLocation");
	Constants.EdgeDriverLocation = property.getProperty("EdgeDriverLocation");
}




}
