package Selenium_prac;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
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

public class Actionclass {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Suraj",Keys.TAB,"Jadhav",Keys.TAB,"8898901",Keys.ENTER);
		
		WebElement days = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day = new Select(days);
		day.selectByIndex(21);
		
		
	    WebElement months = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	    Select month = new Select(months);
	    month.selectByVisibleText("Dec");
	    
	    WebElement years = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	  //  Select year = new Select(years);
	  // year.selectByValue("1993");
	    
	    Actions a1 = new Actions(driver);
	    a1.click(years).build().perform();
	    Robot r1 = new Robot();
	    r1.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r1.keyRelease(KeyEvent.VK_PAGE_DOWN);	    
	    r1.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r1.keyRelease(KeyEvent.VK_PAGE_DOWN);	
	    r1.keyPress(KeyEvent.VK_UP);
	    r1.keyRelease(KeyEvent.VK_UP);
	    r1.keyPress(KeyEvent.VK_UP);
	    r1.keyRelease(KeyEvent.VK_UP);
	    r1.keyPress(KeyEvent.VK_UP);
	    r1.keyRelease(KeyEvent.VK_UP);
	    r1.keyPress(KeyEvent.VK_UP);
	    r1.keyRelease(KeyEvent.VK_UP);
	    r1.keyPress(KeyEvent.VK_UP);
	    r1.keyRelease(KeyEvent.VK_UP);
	    r1.keyPress(KeyEvent.VK_UP);
	    r1.keyRelease(KeyEvent.VK_UP);
	    r1.keyPress(KeyEvent.VK_UP);
	    r1.keyRelease(KeyEvent.VK_UP);
	    r1.keyPress(KeyEvent.VK_UP);
	    r1.keyRelease(KeyEvent.VK_UP);
	    r1.keyPress(KeyEvent.VK_UP);
	    r1.keyRelease(KeyEvent.VK_UP);
	    r1.keyPress(KeyEvent.VK_ENTER);
	    	
	    }   			
	}


