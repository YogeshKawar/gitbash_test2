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

public class child_browser {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Oneplus 10T");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='_4rR01T'])[1]"))).click();
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String>one = new ArrayList<String>(allwindows);
		driver.switchTo().window(one.get(0));
		driver.switchTo().window(one.get(1));
		String tittle = driver.getTitle();
		System.out.println(tittle);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		
		
		
		
		
	}

}
