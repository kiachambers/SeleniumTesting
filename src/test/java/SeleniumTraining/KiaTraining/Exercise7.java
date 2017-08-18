package SeleniumTraining.KiaTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise7 {
	@Test
	public void runExercise7 (){
		//Launch Chrome and go to w3schools
		WebDriver driver = new ChromeDriver();
		  driver.get("http://www.w3schools.com/html/html_forms.asp");
		  //chose female radio button
		  WebElement oCheckBox = driver.findElement(By.xpath("//*[@id='main']/input[4]"));
 		  oCheckBox.click();
		  }
		 
}


