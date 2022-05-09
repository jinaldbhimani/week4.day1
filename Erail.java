package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("https://erail.in/");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("txtStationFrom")).clear();
	       Thread.sleep(3000);
	       driver.findElement(By.id("txtStationFrom")).sendKeys("MDU",Keys.TAB);
	       Thread.sleep(3000);
	       driver.findElement(By.id("txtStationTo")).clear();
	       Thread.sleep(3000);
	       driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.TAB);
	       Thread.sleep(3000);
	       driver.findElement(By.id("chkSelectDateOnly")).click();
	    List<WebElement> trainName = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList TrainListHeader')]//tr/td[2]"));
	    for (int i = 1; i < trainName.size(); i++) {
	    List<WebElement> train = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList TrainListHeader')]//tr/td[1]"));
	   
	    //	System.out.println(trainName.get(i).getText());
	    	for (int j = 1; j < train.size(); j++) {
	    		
	    		System.out.println(train.get(j).getText()+ trainName.get(i).getText());
				
			}
			
		}
	    // String text = trainName.getText();
	      //System.out.println(text);
	      // List<WebElement> rows = driver.findElements(By.tagName("tr"));
	     //  for (int i = 1; i <rows.size(); i++) {
	    	 //  List<WebElement> col = driver.findElements(By.tagName("td"));
	    	 //  for (int j = 1; j < col.size(); j++) {
	    		//   System.out.println(col.get(j).getText());
	    		  
				
			}
	    	  
				
			
			
		}
	       
	       
	     
	       
	       
	       
	       
	


