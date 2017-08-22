package SeleniumTraining.KiaTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise8 {
	@Test
	public void runExercise8 (){
		WebDriver driver = new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/"); 
		  driver.findElement(By.linkText("Sortable Data Tables")).click();
		// Retrieve cell value by providing row and column number
		  System.out.println("The text of the first cell in first column/row is below:");
		  //WebElement colValue= driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[1]"));
		  WebElement colValue= driver.findElement(By.xpath("//*[@id='table1']/thead/tr/th[1]/span"));
		  System.out.println(colValue.getText());
		  System.out.println("===============================================");
		// Retrieve all the text of all cells in the first row
		  System.out.println("All the text of all cells in the first row is below:");
		  WebElement firstRow= driver.findElement(By.cssSelector("table[id='table1'] tr:nth-child(1)"));
		  System.out.println(firstRow.getText());
		  System.out.println("===============================================");
		  //Retrieve the row number of row that contains the cell with text ‘jdoe@hotmail.com’

		  List<WebElement> element = driver.findElements(By.cssSelector("tr"));

        int row = 1;

        for( WebElement w : element){

            String elemText = w.getText();

            String rowText = "jdoe@hotmail.com";

            if(elemText.contains(rowText)){

            System.out.println("Text in row " + row + " is " + rowText + "");
            }

            row++;
        }
		  
		
		 
		  }
		 
}

