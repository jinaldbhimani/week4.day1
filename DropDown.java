package week4.day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://leaftaps.com/opentaps/control/login");
	   	   driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		   driver.findElement(By.id("password")).sendKeys("crmsfa");
		   driver.findElement(By.className("decorativeSubmit")).click();
		   driver.findElement(By.linkText("CRM/SFA")).click();
		   driver.findElement(By.linkText("Leads")).click();
		   driver.findElement(By.linkText("Create Lead")).click();
		   WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		   //select by index
		   Select drop1=new Select(source);
		   drop1.selectByIndex(2);
		   //value
		   WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		   Select drop2=new Select(industry);
		  drop2.selectByValue("IND_SOFTWARE");
		  //select by 
		  WebElement industry2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		  Select drop3=new Select(industry2);
		  drop3.selectByVisibleText("General Services");
		  WebElement industry3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select drop4=new Select(industry3);
		 List<WebElement> options = drop4.getOptions();
		for (WebElement eachoption : options) {
			
			System.out.println(eachoption.getText());
		}
		
		//by size
		 WebElement a = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select b=new Select(a);
		 List<WebElement> last = b.getOptions();
		 b.selectByIndex(last.size()-1);
		 System.out.println(last.size()-1);
	}
		 
		 
		 
		 
		 
		 
		
		
			
			
			
			

		 
		  
	}
	


