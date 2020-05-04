package selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library {
	public static WebDriver launchDriver(String url){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murth\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		return driver;
		
	}
	public static void clearAndTypeValue(WebElement element,String value){
		element.clear();
		element.sendKeys(value);
	}

}
