package selenium.java.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browser2 {
	@BeforeTest
	  public void beforeTest() 
	  {System.out.println("i am running before test");
	  }
	WebDriver driver;
@Test

public void firstTestCase(){
	System.out.println("this is running ");
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\murth\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	     driver =  new ChromeDriver();
	   // String url = "https://www.amazon.in/";
	    String url = "http://shop.demoqa.com/";
	    driver.get(url);
	    String message = driver.findElement(By.xpath("/html/body/p")).getText();
	    System.out.println(message);
	    driver.findElement(By.xpath("//a[text()='Dismiss']")).click();
	    String address = driver.findElement(By.tagName("address")).getText();
	    System.out.println(address);
	    String contact = driver.findElement(By.xpath("//span[text()='T']//following-sibling::a")).getText();
	    System.out.println(contact);
	    //driver.findElement(By.partialLinkText(" round")).click();
	   // driver.close();
}
@AfterTest
public void afterTest() {
	  System.out.println("i am running  after test ");
	 // driver.close();
}}
