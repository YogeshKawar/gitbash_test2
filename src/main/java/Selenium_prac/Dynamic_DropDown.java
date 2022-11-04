package Selenium_prac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_DropDown {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("KGF");
		Thread.sleep(3000);
		List<WebElement> allwords = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		Thread.sleep(3000);
		
		for(WebElement word:allwords) {
			String text = word.getText();
			System.out.println(text);
			if (text.contains("kgf 2 on tv")) {
				word.click();
				break;
			}
		}
		
	}

}
