	package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlLibrary {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("https://html.com/tags/table/");
	        driver.manage().window().maximize();
	        int rows   =   driver.findElements(By.xpath("//table[1]//tr[1]")).size();
	        
	        
	        for (int i = 0; i <rows; i++) {
	        	
	        	   String library = driver.findElement(By.xpath("//table[1]//tr[2]/td[1]")).getText();
	        	   if (library.equals("Absolute Usage")) {
	        		   String jQuery = driver.findElement(By.xpath("//table[1]//tr[2]/td[2]")).getText();
	        		   String Bootstrap = driver.findElement(By.xpath("//table[1]//tr[2]/td[3]")).getText();
	        		   String Modernizr = driver.findElement(By.xpath("//table[1]//tr[2]/td[4]")).getText();
	        		   System.out.println(library+" "+jQuery+" "+Bootstrap+" "+Modernizr);
	        		   
	        		   
					
				}
	        }
	    
	         
	        
	       
	      
	        
	      
			
	}
	}



