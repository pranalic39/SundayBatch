package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://fb.com");
	WebElement img = driver.findElement(By.className("fb_logo _8ilh img"));
	
	System.out.println(img.getSize());
	System.out.println(img.getLocation());
	
	WebElement email = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	
	
	//it is printing address of object / object reference
	System.out.println(img.getRect());
	
	System.out.println(email.getRect().x);
	System.out.println(pass.getRect().x);
	
	//get css value
	System.out.println(email.getCssValue("border"));
	
	//submit method
	driver.findElement(By.name("Login")).submit();
	
}
}
