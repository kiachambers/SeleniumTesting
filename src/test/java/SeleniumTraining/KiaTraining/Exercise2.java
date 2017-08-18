package SeleniumTraining.KiaTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise2 {
	@Test
	public void testmethod (){
		//Launch Chrome and go to Google
		WebDriver driver = new ChromeDriver();
		  driver.get("http://www.google.com/xhtml");
		 
	}


}

