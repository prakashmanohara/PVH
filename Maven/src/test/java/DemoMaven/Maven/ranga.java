package DemoMaven.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ranga {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/prakashm/Documents/Prakash/Automation/MaximCrane/Drivers/chromedriver");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.findElement(By.id("email")).sendKeys("test@gmail.com");

		driver1.findElement(By.id("pass")).sendKeys("Test");

		driver1.findElement(By.id("u_0_2")).click();
		
		}
	
	
	
	
	
	
//	public static void main(String[] args) {
//		
//		
//		System.setProperty("webdriver.chrome.driver", "/Users/prakashm/Documents/Prakash/Automation/MaximCrane/Drivers/chromedriver");
//		//open the browser
//		WebDriver driver=new ChromeDriver();
//		
//		//get method used to enter the URL
//		driver.get("https://www.facebook.com/");
//		
//		
//	}

}
