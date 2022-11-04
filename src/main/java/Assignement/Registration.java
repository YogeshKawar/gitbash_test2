package Assignement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Registration {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://eequeuestorage.blob.core.windows.net/staticfiles/appform-demo/ee-form-widget/form-3/index.html?university=18");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='APPLY NOW']"))).click();
		
		driver.findElement(By.xpath("//input[@id='ee-form-3-form-3-firstName']")).sendKeys("Kiran",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='ee-form-3-form-3-email']")).sendKeys("kothimbirek1995@gmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='ee-form-3-form-3-mobile']")).sendKeys("9970580760",Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='select2-selection select2-selection--single'])[1]"))).click();
	
		
		}
	}


