package DemoMaven.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/prakashm/Documents/Prakash/Automation/MaximCrane/Drivers/chromedriver");
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//get method used to enter the URL
		driver.get("https://www.facebook.com/");
		
		
		
	}
	

}
