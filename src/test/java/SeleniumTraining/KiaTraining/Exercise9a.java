package SeleniumTraining.KiaTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise9a {
	@Test
	public void runExercise9a (){
		//Launch Chrome and go to the the-internet site
		WebDriver driver = new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/"); 
		  //Navigate to the Form Authentication page
		  driver.findElement(By.linkText("Form Authentication")).click();
		// Enter username and password
		  WebElement username = driver.findElement(By.id("username"));
		  username.sendKeys("tomsmith");
		  WebElement password = driver.findElement(By.id("password"));
		  password.sendKeys("SuperSecretPassword!");
		  //Click Login button
		  driver.findElements(By.className("radius")).get(0).click();
		  Assert.assertTrue(driver.getPageSource().contains("Welcome to the Secure Area. When you are done click logout below."));
		  System.out.println("===============================================");
		  System.out.println("TEST RESULTS:");
		  System.out.println("User successfuly loged in!");
		  System.out.flush();
		  }
	
}

