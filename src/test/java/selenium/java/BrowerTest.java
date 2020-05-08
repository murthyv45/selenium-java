package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerTest {
	

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\murth\\Downloads\\chromedriver_win32\\chromedriver.exe");	
    WebDriver driver =  new ChromeDriver();
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

}
