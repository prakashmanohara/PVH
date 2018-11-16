package DemoMaven.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeMethod
	public void precondition() {
		System.out.println("Project started");
	}
	
  @Test
  public void f() {
	  
	 // System.setProperty("webdriver.gecko.driver", "/Users/prakashm/Documents/Prakash/Automation/PVH/source/chromedriver");
	//WebDriver driver=new FirefoxDriver();
	  System.setProperty("webdriver.chrome.driver", ".//chromedriver");
	WebDriver driver=new ChromeDriver();
		
		//Hit the URL
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
  }
}
