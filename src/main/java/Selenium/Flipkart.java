package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.className("_3704LK")).sendKeys("mobiles",Keys.ENTER);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		
	}

}
