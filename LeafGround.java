package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://www.leafground.com/pages/table.html");
	       driver.manage().window().maximize();
	       
	       List<WebElement> table = driver.findElements(By.xpath("//table"));
	       List<WebElement> rows = driver.findElements(By.tagName("tr"));{
	       System.out.println("total numer of rows is" +"  " + rows.size());
	       }
	       
	   
	       for (int i = 0; i < rows.size(); i++) {
	    	   List<WebElement> col = driver.findElements(By.tagName("td"));
	    	   for (int j = 0; j < col.size(); j++) {
	    		   System.out.println(col.get(j).getText());
				
			}
			
		}
	}
}
	     
	       
	


