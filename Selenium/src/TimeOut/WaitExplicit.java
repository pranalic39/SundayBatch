package TimeOut;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExplicit {
public static void main(String[] args) {
	System.setProperty("WebDriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("/div[text()='Login ']")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LogoutLink")));
	driver.findElement(By.id("LogoutLink")).click();

}
}
