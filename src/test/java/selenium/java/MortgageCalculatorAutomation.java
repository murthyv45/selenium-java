package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MortgageCalculatorAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Library.launchDriver("https://www.mortgagecalculator.org/");
         Library.clearAndTypeValue(driver.findElement(By.id("homeval")),"20000");
         Library.clearAndTypeValue(driver.findElement(By.id("downpayment")),"1500");
         WebElement ele =  driver.findElement(By.tagName("select"));
         Select sel = new Select(ele);
         sel.selectByVisibleText("Mar");
         WebElement ele1 = driver.findElement(By.xpath("//select[@name='param[milserve]']"));
         Select sel1 = new Select(ele1);
         sel1.selectByVisibleText("FHA");
         driver.findElement(By.xpath("//input[@type='submit']")).click();
         Thread.sleep(5000);
         WebElement monthlypayment = driver.findElement(By.xpath("//div[@class='repayment-block']//h3"));
         String mp = monthlypayment.getText();
         System.out.println("the monthly repayment is : "+mp);
         
	}

}
