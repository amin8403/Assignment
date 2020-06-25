package main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PREDATOR\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		
		    driver.get(" https://www.seleniumeasy.com/test/table-pagination-demo.html");
		    
		    driver.findElement(By.linkText("2")).click();
		    String value = driver.findElement(By.xpath("//table//tr[7]/td[6]")).getText();
		    System.out.println("The value in 7th row and 5th column : " +value);
		    
		    
	}
	
}