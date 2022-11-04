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

public class Dynamic_Element {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Oneplus 10T",Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='OnePlus 10T 5G (Moonstone Black, 128 GB)'])[1]"))).click();
		//driver.findElement(By.xpath("(//div[text()='OnePlus 10T 5G (Moonstone Black, 128 GB)'])[1]")).click();
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String> window = new ArrayList<String>(allwindows);
		driver.switchTo().window(window.get(0));
		driver.switchTo().window(window.get(1));
		String text = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]")).getText();
		System.out.println(text);
		driver.switchTo().window(window.get(0));
		String text2 = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[38]")).getText();
		System.out.println(text2);

	}

}
