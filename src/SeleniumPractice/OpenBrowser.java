package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	WebDriver driver;
	
	@Test(priority = 0)
	public void openBrowserAndMaximize() {
		WebDriverManager.chromedriver().setup();//its download 
		driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 1)
	public void getURL() {
		String currentURL=driver.getCurrentUrl();
		System.out.println("Current URL now  "+currentURL);
		Assert.assertEquals("https://testautomationpractice.blogspot.com/", currentURL);
	}
	@Test(priority = 2)
	public void enterText() {
		driver.switchTo().frame(0);
		WebElement firstName=driver.findElement(By.xpath("//input[contains(@id,'RESULT_TextField-1')]"));
		firstName.sendKeys("Desosakar");
	}
	@Test
	public void clickOnDay() {
		driver.findElement(By.xpath("(//td//input[@type='checkbox'])["+4+"]")).click();;

	}

}
