package main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment3 {
	
	public static void main(String[] args)  throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PREDATOR\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		
		    driver.get("  https://rahulshettyacademy.com/AutomationPractice/");
		    Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());  
		    System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		    Thread.sleep(3000);
			driver.findElement(By.id("checkBoxOption1")).click();
			System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
	}
	
}