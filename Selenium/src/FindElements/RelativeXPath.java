package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {
public static void main(String[] args) {
	System.setProperty("webdriver.driver.chromeDriver", "./chrome.driver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	//by attribute
	driver.findElement(By.xpath("//input[@type=\"hidden\"]"));
	System.out.println("IDentinfied Element");
	

	driver.findElement(By.xpath("//input[@id=\"email\"]"));
	System.out.println("IDentinfied Element");
	
	//by text
	
	driver.findElement(By.xpath("//div(text()='Login')");
	
	
}
}
