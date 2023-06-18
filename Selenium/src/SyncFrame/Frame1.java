package SyncFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	//identify frame by id
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
	
	//identify frame by name / id
	driver.switchTo().frame("singleframe");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
	
	//identify the frame by web element
	WebElement iframeelement = driver.findElement(By.id("singleframe"));
	driver.switchTo().frame(iframeelement);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
	
	//to return default frame
	driver.switchTo().defaultContent();
	
	// to return parent frame
	driver.switchTo().parentFrame();
	
	//need to try > sel.dev > downloads > api docs-java > frame
}
}
