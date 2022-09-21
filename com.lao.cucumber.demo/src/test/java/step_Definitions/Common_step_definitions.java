package step_Definitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import utilities.Common_utils;
import utilities.Drivermanager;

public class Common_step_definitions {

	@Before
	public void beforescenario() {
		
		Common_utils.getInstance().loadproperties();
		Drivermanager.getInstance().drivermanager();
		
		
	}

}
