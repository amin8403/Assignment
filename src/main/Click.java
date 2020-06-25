package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Click {
	public static void main(String[] args) {
		WebDriver driver = null;
		String browser = "chrome";
		
		if (browser.equals("chrome")) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PREDATOR\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PREDATOR\\Desktop\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("please select one browser");
		}
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.findElement(By.id("checkboxes")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		
		
	}

}