package selenium.java.testng;

import org.testng.annotations.Test;

import selenium.java.Library;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class FirstTest {
	
	@BeforeTest
	  public void beforeTest() 
	  {System.out.println("i am running before test");
	  }
	WebDriver driver;
  @Test
  public void myFirstCase() throws InterruptedException {
	  System.out.println("this is my first test case");
	     driver= Library.launchDriver("https://letskodeit.teachable.com/p/practice");
	     Thread.sleep(5000);
	  driver.findElement(By.id("bmwradio")).click();
  }
  
  @Test
  public void mySecondCase() {
	  System.out.println("this is my second test case");
	
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("i am running  after test ");
	 // driver.close();
  }

}
