package SeleniumTraining.KiaTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise10 {
	@Test
	public void runExercise10 (){
		//Launch Chrome and go to the the-internet site
		WebDriver driver = new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/"); 
		  //Navigate to the Dynamic Loading page
		  driver.findElement(By.linkText("Dynamic Loading")).click();
		// Click first example
		  driver.findElement(By.linkText("Example 1: Element on page that is hidden ")).click();
		  //Click Start button
		  (driver.findElement(By.id("start"))).click();
		 // Wait.until(ExpectedConditions.textToBePresentInElement(By.id("finish"),"Sample"));
		  Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']/h4)]")));
		  System.out.println("===============================================");
		  System.out.println("TEST RESULTS:");
		  System.out.println("User successfuly loged in!");
		  System.out.flush();
		  }
	
}

