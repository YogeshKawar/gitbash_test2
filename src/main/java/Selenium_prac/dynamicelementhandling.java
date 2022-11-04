package Selenium_prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicelementhandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Oneplus 10T");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='gUuXy-']//span)[6]"))).getText();
		//String text = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]")).getText();
		System.out.println(text);
		
	}

}
