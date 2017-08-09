package SeleniumTraining.KiaTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Exercise6 {
	@Test
	public void runExercise6 (){
		WebDriver driver = new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/"); 
		  driver.findElement(By.linkText("Dropdown")).click();
		  Select dropdown = new Select(driver.findElement(By.id("dropdown")));
		  dropdown.selectByIndex(2);
		  Select dropdown2 = new Select(driver.findElement(By.id("dropdown")));
		  dropdown2.selectByValue("1");
		  Select dropdown3 = new Select(driver.findElement(By.id("dropdown")));
		  dropdown3.selectByVisibleText("Option 2");  
		  }
		 
}
