package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT_LP_001 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	LoginPage lp = new LoginPage (driver);
	lp.getUsername().sendKeys("afeefd");
	lp.getPassword().sendKeys("dfadsf");
	lp.getLoginbtn().click();
	
	Thread.sleep(3000);
	
	lp.getUsername().sendKeys("admin");
	lp.getPassword().sendKeys("manager");
	lp.getLoginbtn().click();
}
}
