package main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flight {
	
	public static void main(String[] args)  throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PREDATOR\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get(" https://www.cleartrip.com/");
			driver.findElement(By.id("FromTag")).sendKeys("Delhi");
			driver.findElement(By.id("ToTag")).sendKeys("Srinagar");
			driver.findElement(By.id("DepartDate")).sendKeys("15/09/2020");
			Select a = new Select(driver.findElement(By.name("adults")));
			a.selectByVisibleText("4");
			Select c = new Select(driver.findElement(By.name("childs")));
			c.selectByVisibleText("2");
			Select i = new Select(driver.findElement(By.name("infants")));
			i.selectByVisibleText("3");
			driver.findElement(By.id("SearchBtn")).click();
			System.out.println(driver.findElement(By.xpath("(//strong[@class='resultsCount'])[1]")).getText());	
			
			//driver.close();
		    

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PREDATOR\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver1  = new ChromeDriver();
			driver1.get("https://www.cleartrip.com/"); 
			
			driver1.findElement(By.id("FromTag")).sendKeys("Srinagar");
			driver1.findElement(By.id("ToTag")).sendKeys("");
			driver1.findElement(By.id("DepartDate")).sendKeys("15/9/2020");
			Select s1 = new Select(driver1.findElement(By.name("adults")));
			s1.selectByVisibleText("2");
			Select b1 = new Select(driver1.findElement(By.name("childs")));
			b1.selectByVisibleText("1");
			
		    Thread.sleep(2000);

			driver1.findElement(By.id("SearchBtn")).click();
			
			driver1.findElement(By.id("homeErrorMessage")).click();  
	         
		     Alert alert = (Alert) driver1.switchTo().alert();  
		          
		     alert.accept();  
		          
		     driver.findElement(By.className("hint ugly errorLabel")).click();  
		          
		          
		     Alert confirmBox = (Alert) driver.switchTo().alert();  
		          
		     ((Alert) confirmBox).dismiss();  

	}
	
}