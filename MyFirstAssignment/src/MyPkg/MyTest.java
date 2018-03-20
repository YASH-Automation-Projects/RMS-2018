package MyPkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {

	
		
		WebDriver driver;
		
		@Test
		public void lunch() 
		{driver.get("http://www.google.co.in");}

		
		@BeforeClass
		public  void beforeTest () 
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver = new  ChromeDriver();
		}
		
		
		  @AfterClass
		  public void afterClass() {
			  driver.quit();
		  }

	



}


