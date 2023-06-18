package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
public static void main(String[] args) {
	System.setProperty("WebDriver.Chrome.Driver", "./chormedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.cssSelector("input[class=\"inputtext _55r1 _6luy\"]"));
	System.out.println("Element Identified");
	
	driver.findElement(By.cssSelector("input[name=\"email\"]"));
	System.out.println("Element Identified");
	
	driver.findElement(By.cssSelector("input[id=\"email\"]"));
	System.out.println("Element Identified");
	
	driver.findElement(By.cssSelector("input[data-testid=\"royal_email\"]"));
	System.out.println("Element Identified");
	
	driver.findElement(By.cssSelector("input[placeholder=\"Email address or phone number\"]"));
	System.out.println("Element Identified");
	
	driver.findElement(By.cssSelector("input[autofocus=\"1\"]"));
	System.out.println("Element Identified");
	
	System.out.println("Element Identified");
}
}
