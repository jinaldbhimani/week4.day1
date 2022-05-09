package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("https://html.com/tags/table/");
	        driver.manage().window().maximize();
	 int rows   =   driver.findElements(By.xpath("//table[1]//tr[1]")).size();
	 System.out.println("numbers of rows in table:" + rows);
	 
	 int colos   =   driver.findElements(By.xpath("//table[1]//thead/tr/th")).size();
	 System.out.println("numbers of coloumns in table:" + colos);
	 
	   
		

	}

}
