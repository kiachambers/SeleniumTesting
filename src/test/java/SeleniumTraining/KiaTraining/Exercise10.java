package SeleniumTraining.KiaTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Exercise10 {
	@Test
	public void runExercise10a (){
		//Launch Chrome and go to the the-internet site
		WebDriver driver = new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/"); 
		  //Navigate to the Dynamic Loading page
		  driver.findElement(By.linkText("Dynamic Loading")).click();
		 // Click first example
		  driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		  //Click Start button
		  driver.findElement(By.xpath("//*[@id='start']/button")).click();
		  //Wait for text to display
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("#finish > h4"), "Hello World!"));
		  System.out.println("===============================================");
		  System.out.println("TEST RESULTS:");
		  System.out.println("Hello World! text displayed.");
		  System.out.flush();
		  driver.close();
		  }
	
	@Test
	public void runExercise10b (){
		//Launch Chrome and go to the the-internet site
		WebDriver driver = new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/"); 
		  //Navigate to the Dynamic Loading page
		  driver.findElement(By.linkText("Dynamic Loading")).click();
		 // Click first example
		  driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		  //Click Start button
		  driver.findElement(By.xpath("//*[@id='start']/button")).click();
		  //Wait for text to display
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#loading > img")));
		  System.out.println("===============================================");
		  System.out.println("TEST RESULTS:");
		  System.out.println("Loading bar displayed.");
		  System.out.flush();
		  driver.close();
		  }
	
	
		@Test
		public void runExercise10c (){
			//Launch Chrome and go to the the-internet site
			WebDriver driver = new ChromeDriver();
			  driver.get("https://the-internet.herokuapp.com/"); 
			  //Navigate to the Dynamic Loading page
			  driver.findElement(By.linkText("Dynamic Loading")).click();
			 // Click first example
			  driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
			  //Click Start button
			  driver.findElement(By.xpath("//*[@id='start']/button")).click();
			  //Wait for text to display
			  WebDriverWait wait = new WebDriverWait(driver, 10);
			  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("#finish > h4"), "Hello World!"));
			  System.out.println("===============================================");
			  System.out.println("TEST RESULTS:");
			  System.out.println("Hello World! text displayed.");
			  System.out.flush();
			  driver.close();
			  }
}


