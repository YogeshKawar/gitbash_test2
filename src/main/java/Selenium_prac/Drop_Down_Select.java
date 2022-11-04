package Selenium_prac;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down_Select {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
		 Select day = new Select(days);
		 day.selectByIndex(21);
		 
		 WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
		 Select month = new Select(months);
		 month.selectByIndex(11);
		 
		 WebElement years = driver.findElement(By.xpath("//select[@id='year']"));
		 Select year = new Select(years);
		 year.selectByValue("1993");
		 
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SURAJ",Keys.TAB,"Jadhav",Keys.ENTER);
		 
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		WebElement sign_up = driver.findElement(By.xpath("//button[@name='websubmit']"));
		Actions ac1 = new Actions(driver);
		
		 ac1.moveToElement(sign_up).click().build().perform();
	}

}
