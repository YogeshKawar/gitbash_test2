package Selenium_prac;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class upload {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin",Keys.TAB,"Admin123");
		driver.findElement(By.xpath("//li[text()='Inpatient Ward']")).click();
		driver.findElement(By.xpath("//input[@id='loginButton']")).click();
		driver.findElement(By.xpath("//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")).click();
		driver.findElement(By.xpath("//td[text()='Rohini Verma']")).click();
		driver.findElement(By.xpath("(//div[@class='col-11 col-lg-10'])[10]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='dz-default dz-message ng-binding']")).click();
		
		
		Robot r1 = new Robot();
		r1.delay(2000);
		StringSelection s1 = new StringSelection("C:\\Users\\Suraj\\Downloads\\file.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a caption']")).sendKeys("File Uploaded");
		driver.findElement(By.xpath("//button[text()='Upload file']")).click();
		
		
		
		
	}

}
