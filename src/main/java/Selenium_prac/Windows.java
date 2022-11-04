package Selenium_prac;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.devtools.v101.page.Page.GetAppIdResponse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles under 10000",Keys.ENTER);
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='POCO C31 (Royal Blue, 64 GB)']"))).click();
	
	Set<String> allwin = driver.getWindowHandles();

	ArrayList<String> wind = new ArrayList<String>(allwin);
	
	driver.switchTo().window(wind.get(1));
	
	driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
	
	
	
	
	
		
		
		
		
		
		
		
		
	}

}
