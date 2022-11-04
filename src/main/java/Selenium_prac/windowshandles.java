package Selenium_prac;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowshandles {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles under 50000");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 128 GB)']"))).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		ArrayList<String> onewindow = new ArrayList<String>(allwindows);
		driver.switchTo().window(onewindow.get(0));
		driver.switchTo().window(onewindow.get(1));
		
		driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
