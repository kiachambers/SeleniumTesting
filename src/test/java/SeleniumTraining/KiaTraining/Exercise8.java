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

        int row = 0;

        for( WebElement w : element){

            String elemText = w.getText();

            System.out.println(elemText);

            String rowText = "jdoe@hotmail.com";

            if(elemText.contains(rowText)){

            System.out.println("Text in row " + row + " is " + rowText + "");
            }

            System.out.println("this was row " + row + "\n");

            row++;
        }
		  
		  //System.out.println("The text of the first cell in first column/row isbelow:");
		  //List<WebElement> allColumnsInRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td[1]"));
		  //for(WebElement e: allColumnsInRow)
		  //{
		  	//System.out.println(e.getText());
		  //}
		 // WebElement Table_1 = driver.findElement(By.id("table1"));
		  //List<WebElement> Rows = Table_1.findElements(By.tagName("tr"));
		  //System.out.println("No. of rows: "+Rows.size()); 
		 
		  }
		 
}

